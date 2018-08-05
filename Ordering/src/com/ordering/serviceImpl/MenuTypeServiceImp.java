package com.ordering.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import com.ordering.mapper.TypeMapper;
import com.ordering.po.Type;
import com.ordering.service.MenuTypeService;

public class MenuTypeServiceImp implements MenuTypeService {

	@Resource
	private TypeMapper typeMapper;

	public List<Type> findAllType(int shoreid) {
		List<Type> typeList=typeMapper.findAllType(shoreid);
		return typeList;
	}

	public void addType(Type type) {
		typeMapper.addType(type);
	}
	
	public void deleteByPrimaryKey(int typeid) {
		typeMapper.deleteByPrimaryKey(typeid);
	}
	public void updateByPrimaryKeySelective(Type type) {
		typeMapper.updateByPrimaryKeySelective(type);
	}
	
	public Type selectByPrimaryKey(int typeid) {
		return typeMapper.selectByPrimaryKey(typeid);
	}
	
	
	
}
