package com.pnp.resource.dao;

import com.pnp.resource.model.UserWebKey;

public interface UserWebDao {

	public UserWebKey login(String username, String password);
}
