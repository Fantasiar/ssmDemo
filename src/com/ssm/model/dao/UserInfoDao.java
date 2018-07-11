package com.ssm.model.dao;

import java.util.List;

import com.ssm.model.bean.UserInfo;

public interface UserInfoDao {
	public List<UserInfo> selectUsers();
}
