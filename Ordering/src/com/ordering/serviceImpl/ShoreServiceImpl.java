package com.ordering.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ordering.mapper.MenuMapper;
import com.ordering.mapper.ShoreMapper;
import com.ordering.mapper.ShoretypeMapper;
import com.ordering.po.Menu;
import com.ordering.po.MenuCustom;
import com.ordering.po.MenuExample;
import com.ordering.po.Shore;
import com.ordering.po.ShoreCustom;
import com.ordering.po.ShoreExample;
import com.ordering.po.Shoretype;
import com.ordering.po.Type;
import com.ordering.po.User;
import com.ordering.po.UserExample;
import com.ordering.service.ShoreService;

@Service
@Transactional
public class ShoreServiceImpl implements ShoreService {

	@Resource
	private ShoreMapper shoreMapper;
	@Resource
	private ShoretypeMapper shoretypeMapper;
	@Resource
	private MenuMapper menuMapper;

	public boolean check(String username) {
		
		Shore shore=shoreMapper.check(username);
		if(shore!=null)
		{
			return true;
		}else{
			return false;
		}
	}

	public void insert(Shore shore) {
		shoreMapper.insert(shore);
	}
	
	//查询所有的商家类别
	public List<Shoretype> selectAllType(){
		
		List<Shoretype> shoreTypeList=shoretypeMapper.selectAllType();
		return shoreTypeList;
	}

	//查询商家
	public ShoreCustom selectShore(Shore shore) {
		ShoreCustom shoreCustom=shoreMapper.selectShore(shore);
		return shoreCustom;
	}
	
	//更新商店信息
	public void updateShore(Shore shore){
		shoreMapper.updateShore(shore);
	}
	//更新商店头像
	public void updateShoreImg(Shore shore){
		shoreMapper.updateShoreImg(shore);
	}

	public ShoreCustom selectShoreById(Shore shore) {
		ShoreCustom shoreCustom=shoreMapper.selectShoreById(shore);
		return shoreCustom;
		
	}
	public List<Shore> selectAllShore() {
		return shoreMapper.selectAllShore() ;
	}
	
	
	
	//菜式部分：
	public void insertSelective(Menu menu){
		menuMapper.insertSelective(menu);
	}
	public void updateByPrimaryKeySelective(Menu menu){
		menuMapper.updateByPrimaryKeySelective(menu);
	}
	public List<Menu> selectByExample(Menu menu){
		
		MenuExample menuExample = new MenuExample();
		MenuExample.Criteria criteria = menuExample.createCriteria();
		criteria.andShoreIdEqualTo(menu.getShoreId());
		
		List<Menu> menuList=menuMapper.selectByExample(menuExample);
		return menuList;
	}
	public List<Menu> selectAllMenu(int shoreid){
		return menuMapper.selectAllMenu(shoreid);
	}

	public List<Menu> findMenuByType(int typeid) {
		List<Menu> menuList=menuMapper.findMenuByType(typeid);
		return menuList;
	}
	public Menu selectByPrimaryKey(int menuid) {
		Menu menu=menuMapper.selectByPrimaryKey(menuid);
		return menu;
	}
	public void deleteByPrimaryKey(int menuid) {
		menuMapper.deleteByPrimaryKey(menuid);
	}

	public List<Shore> findShoreByType(int shoretypeid) {
		return shoreMapper.findShoreByType(shoretypeid);
	}
	public ShoreCustom selectShoreByPrimaryKey(int shoreid) {
		return shoreMapper.selectShoreByPrimaryKey(shoreid);
	}
	
	public MenuCustom selectMenuById(int menuid){
		return menuMapper.selectMenuById(menuid);
	}
	
}
