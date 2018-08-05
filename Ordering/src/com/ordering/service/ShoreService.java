package com.ordering.service;

import java.util.List;

import com.ordering.po.Menu;
import com.ordering.po.MenuCustom;
import com.ordering.po.Shore;
import com.ordering.po.ShoreCustom;
import com.ordering.po.Shoretype;
import com.ordering.po.Type;

public interface ShoreService {

	public boolean check(String username);

	public void insert(Shore shore);
	
	public List<Shoretype> selectAllType();

	public ShoreCustom selectShore(Shore shore);
	
	public ShoreCustom selectShoreById(Shore shore);
	
	public void updateShore(Shore shore);
	
	public void updateShoreImg(Shore shore);
	
	public void insertSelective(Menu menu);
	
	public void updateByPrimaryKeySelective(Menu menu);
	
	public List<Menu> selectByExample(Menu menu);
	
	public List<Menu> selectAllMenu(int shoreid);

	public List<Menu> findMenuByType(int typeid);
	
	public Menu selectByPrimaryKey(int menuid);
	
	public void deleteByPrimaryKey(int menuid);

	public List<Shore> selectAllShore();

	public List<Shore> findShoreByType(int shoretypeid);
	
	public ShoreCustom selectShoreByPrimaryKey(int shoreid);
	
	public MenuCustom selectMenuById(int menuid);
}
