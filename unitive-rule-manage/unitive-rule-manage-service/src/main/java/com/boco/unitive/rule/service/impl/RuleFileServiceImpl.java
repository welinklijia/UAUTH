package com.boco.unitive.rule.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boco.unitive.rule.core.AbstractService;
import com.boco.unitive.rule.dao.TfaGaiaRuleFileMapper;
import com.boco.unitive.rule.entity.TfaGaiaRuleFile;
import com.boco.unitive.rule.entity.dto.RuleAlarms;
import com.boco.unitive.rule.service.RuleFileService;
@Service
@Transactional
public class RuleFileServiceImpl extends AbstractService<TfaGaiaRuleFile> implements RuleFileService {
	@Override
	public List<RuleAlarms> querySubAlarm(Integer serFileId) {
		TfaGaiaRuleFileMapper tfaRuleFileMapper = (TfaGaiaRuleFileMapper)mapper;
		return tfaRuleFileMapper.queryRuleAlarm(serFileId);
	}
}
