package com.ordering.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ordering.mapper.UserMapper;
import com.ordering.po.User;
import com.ordering.po.UserExample;
import com.ordering.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	public UserMapper userMapper;

	public void insert(User user) {
		userMapper.insert(user);
	}

	public boolean check(String username) {
		User user=userMapper.check(username);
		if(user!=null)
		{
			return true;
		}else{
			return false;
		}
		
	}
	
	//查询用户名和账号密码是否正确
	public User selectByExample(User u){
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(u.getUsername());
		criteria.andPasswordEqualTo(u.getPassword());
		List<User> userList = userMapper.selectByExample(userExample);
		if(userList.size()>0){
			User user=userList.get(0);
			return user;
		}
		return null;
	}
	

}
