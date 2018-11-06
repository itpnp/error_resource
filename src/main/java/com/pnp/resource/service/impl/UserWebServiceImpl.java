package com.pnp.resource.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pnp.resource.dao.UserWebDao;
import com.pnp.resource.model.UserWebKey;
import com.pnp.resource.service.UserWebService;

@Service("userWebService")
public class UserWebServiceImpl implements UserWebService {
	
	@Autowired
	private UserWebDao userWebDao;

	@Override
	public UserWebKey login(String username, String password) {
		// TODO Auto-generated method stub
		return userWebDao.login(username, password);
	}

}
