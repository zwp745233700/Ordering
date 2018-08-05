package com.ordering.service;

import java.util.List;

import com.ordering.po.Type;

public interface MenuTypeService {

	List<Type> findAllType(int shoreid);

	void addType(Type type);
	
	public void deleteByPrimaryKey(int typeid);

	public void updateByPrimaryKeySelective(Type type);
	
	public Type selectByPrimaryKey(int typeid);
}
