package com.test.rule.manager;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class ParseTempl {

	public static void main(String[] args) throws Exception{
		Configuration conf = new Configuration(Configuration.VERSION_2_3_0);
		conf.setClassLoaderForTemplateLoading(ParseTempl.class.getClassLoader(), "/template");
		conf.setDefaultEncoding("UTF-8");
		Template tmpl = conf.getTemplate("gaia-rule.ftl");
		StringWriter sw = new StringWriter();
		Map<String, String> dateMap = new HashMap<>();
		dateMap.put("activeTimeout","30m");
		dateMap.put("unite","minute");
		dateMap.put("threshold", "5");
		dateMap.put("professional_type", "8");
		dateMap.put("vendor_id","10000");
		dateMap.put("name","[衍生关联]CMNET link down告警与一干传输告警关联");
		dateMap.put("desc","实现CMNET link down告警与一干传输告警关联，同一故障，在传输侧派单后，CMNET侧无需再派单，可有效降低重复派单");
		tmpl.process(dateMap,sw);
		System.out.println(sw.toString());
	}

}
