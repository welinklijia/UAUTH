package com.boco.unitive.rule.service;

import java.util.List;

import com.boco.unitive.rule.core.BaseService;
import com.boco.unitive.rule.entity.TfaGaiaRuleFile;
import com.boco.unitive.rule.entity.dto.RuleAlarms;

public interface RuleFileService extends BaseService<TfaGaiaRuleFile> {
	public List<RuleAlarms> querySubAlarm(Integer id);
}
