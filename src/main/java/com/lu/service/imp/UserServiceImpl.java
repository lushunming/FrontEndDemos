package com.lu.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lu.inter.UserMapper;
import com.lu.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	private @Autowired UserMapper usermapper;

	public List<Map<String, Object>> getUserListByName(String userName) {
		List<Map<String, Object>> list = usermapper.selectUsers(userName);
		return list;
	}

}
