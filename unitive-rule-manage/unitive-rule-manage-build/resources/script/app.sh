#!/bin/sh


# 设置进程依赖的环境变量
APP_HOME=..

# 设置classpath环境
JARS="$APP_HOME/prjConf:$APP_HOME/devConf"
LIB=$APP_HOME/lib

if [ -d $LIB ]; then
  for i in $LIB/*/*.jar; do
    JARS="$JARS":$i
  done
fi
if [ -d $LIB ]; then
  for i in $LIB/*.jar; do
    JARS="$JARS":$i
  done
fi
export JARS

# 设置变量，如进程名
programName=unitive-rule-manage

if [ ! -d "./process" ]; then
  mkdir ./process
fi

case "$1" in
        'start')
			java -Dprogram.name=$programName -Xms1g -Xmx1g -XX:PermSize=128m -XX:MaxPermSize=128m -Xloggc:./process/gc.vgc -XX:+PrintGCDateStamps -Dfile.encoding=GBK -cp $JARS com.boco.unitive.rule.Application
			;;
        'stop')
        	echo "will Stop $programName Service ..."
  	 		ps -ef | grep "program.name=$programName" | grep -v grep | awk '{print $2}' | xargs -i kill -15 {}
  	 		echo "backup jvm log to ./process/"
  	 		curD=`date +%Y%m%d%H%M`
  	 		cp ./process/gc.vgc ./process/gc$curD.vgc
  	 		echo "Stop $programName Service Success"
        	;;
		*)
	        echo "unitive-rule-manage v0/0/1, boco ltd. (c)2017-boco lifetime"
	        echo "usage: ./app.sh <command>"
	        echo "       command = < start| stop >"
	        echo "       start: start nfv-controller in current shell, and in background if succeded with &."
	        echo "       stop:  stop the process."
	        ;;
esac
