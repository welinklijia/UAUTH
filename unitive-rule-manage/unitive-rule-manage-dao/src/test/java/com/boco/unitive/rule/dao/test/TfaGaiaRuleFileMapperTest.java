package com.boco.unitive.rule.dao.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.boco.unitive.rule.dao.TfaGaiaRuleFileMapper;
import com.boco.unitive.rule.entity.TfaGaiaRuleFile;
import com.boco.unitive.rule.entity.dto.RuleAlarms;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
//@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
public class TfaGaiaRuleFileMapperTest {
	@Autowired
	private TfaGaiaRuleFileMapper tfaGaiaRuleFileMapper;
	@Test
	public void addUser(){
		PageHelper.offsetPage(1,2);
		List<TfaGaiaRuleFile> list = tfaGaiaRuleFileMapper.selectAll();
		PageInfo<TfaGaiaRuleFile> page = new PageInfo<TfaGaiaRuleFile>(list);
		System.out.println();
		//System.out.println(buser.getUserName());
	}
	@Test
	public void queryAlarms(){
		List<RuleAlarms> list = tfaGaiaRuleFileMapper.queryRuleAlarm(455439434);
		for(RuleAlarms alarm:list){
			System.out.println(alarm.getFileName()+","+alarm.getOptPerson()+","+alarm.getSubAlarm());
		}
	}
}
