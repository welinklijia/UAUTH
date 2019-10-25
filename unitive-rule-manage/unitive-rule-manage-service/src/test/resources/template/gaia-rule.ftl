<?xml version="1.0" encoding="GBK"?>
<xml> 
  <extension> 
    <variables> 
      <var name="activeTimeout" value="${activeTimeout}" display="中文名称" desc="告警创建后存在时间" type="${unite}"/>
	  <var name="threshold" value="${threshold}" display="阀值" desc="阀值" type="number"/>
    </variables>  
    <ruleinfo professional_type="${professional_type}" vendor_id="${vendor_id}" name="${name}"> 
      <ruledesc><![CDATA[${desc}]]></ruledesc> 
    </ruleinfo> 
  </extension>
  <rule ruleName="[衍生关联]CMNET link down告警与一干传输告警关联" activeTimeout="${activeTimeout}">
  	<alarm>
  		<condition></condition>
  		<keyset>
  			<relation></relation>
  			<location></location>
  		</keyset>
  	</alarm>
  </rule>
 </xml>