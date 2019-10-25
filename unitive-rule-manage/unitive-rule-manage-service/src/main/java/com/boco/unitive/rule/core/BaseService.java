package com.boco.unitive.rule.core;

import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;

import tk.mybatis.mapper.entity.Condition;

public interface BaseService<T> {
	public void save(T model);
	public void save(List<T> models);//批量持久化
	//public void deleteById(Integer id);//通过主鍵刪除
	//public void deleteByIds(String ids);//批量刪除 eg：ids -> “1,2,3,4”
	public void update(T model);
	public T findById(Integer id);//通过ID查找
    public T findBy(String fieldName, Object value) throws TooManyResultsException; //通过Model中某个成员变量名称（非数据表中column的名称）查找,value需符合unique约束
    //public List<T> findByIds(String ids);//通过多个ID查找//eg：ids -> “1,2,3,4”
    public List<T> findByCondition(Condition condition);//根据条件查找
    public List<T> findAll();//获取所有

}
