package com.ssm.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.model.bean.UserInfo;
import com.ssm.model.dao.UserInfoDao;

@Service
public class UserService {
	@Autowired
	private UserInfoDao userInfoDao;
	
	public List<UserInfo> selectUsers(){
		return userInfoDao.selectUsers();
	}
}
