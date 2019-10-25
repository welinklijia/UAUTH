package com.boco.unitive.rule.core;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface GeneralMapper<T> extends BaseMapper<T>,
									 ConditionMapper<T>,
									 InsertListMapper<T>{

}
