package com.pnp.resource.service;

import com.pnp.resource.model.UserWebKey;

public interface UserWebService {
	public UserWebKey login(String username, String password);
}
