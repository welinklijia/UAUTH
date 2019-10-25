package com.boco.unitive.rule.dao;

import java.util.List;

import com.boco.unitive.rule.core.GeneralMapper;
import com.boco.unitive.rule.entity.TfaGaiaRuleFile;
import com.boco.unitive.rule.entity.dto.RuleAlarms;

public interface TfaGaiaRuleFileMapper extends GeneralMapper<TfaGaiaRuleFile> {
	public List<RuleAlarms> queryRuleAlarm(Integer serFileId);
}