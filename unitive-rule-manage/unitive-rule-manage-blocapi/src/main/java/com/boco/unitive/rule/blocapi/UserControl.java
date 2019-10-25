package com.boco.unitive.rule.blocapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.boco.unitive.rule.core.ResponseBody;
import com.boco.unitive.rule.core.ResponseGenerator;
import com.boco.unitive.rule.entity.TfaGaiaRuleFile;
import com.boco.unitive.rule.entity.dto.RuleAlarms;
import com.boco.unitive.rule.service.RuleFileService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value="/rule/manage",description="查询所有规则")
@RestController
@RequestMapping("/rule/manage")
public class UserControl {
	@Autowired
	private RuleFileService ruleFileService;
	@ApiOperation(value="ruleFile")
	@PostMapping("queryUser")
	public ResponseBody queryUserControl(){
		List<TfaGaiaRuleFile> listFile = ruleFileService.findAll();
		return ResponseGenerator.genSuccessResult(listFile);
	}
	@ApiOperation(value="subAlarms")
	@PostMapping("querySubAlarms")
	public ResponseBody querySubAlarms(Integer id){
		List<RuleAlarms> list = ruleFileService.querySubAlarm(id);
		return ResponseGenerator.genSuccessResult(list);
	}
	@ApiOperation(value="分页查询")
	@PostMapping("queryByPage")
	public ResponseBody queryByPage(int index,int num){
		PageHelper.startPage(index, num);
		List<TfaGaiaRuleFile> list = ruleFileService.findAll();
		PageInfo<TfaGaiaRuleFile> pageInfo = new PageInfo<>(list);
		return ResponseGenerator.genSuccessResult(pageInfo);
	}
}
