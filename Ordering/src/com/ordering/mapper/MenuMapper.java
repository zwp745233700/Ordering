package com.ordering.mapper;

import com.ordering.po.Menu;
import com.ordering.po.MenuCustom;
import com.ordering.po.MenuExample;
import com.ordering.po.Type;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    int countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer menuid);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer menuid);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
    
    public List<Menu> selectAllMenu(int shoreid);

	List<Menu> findMenuByType(int typeid);
	
	public MenuCustom selectMenuById(int menuid);
	
}