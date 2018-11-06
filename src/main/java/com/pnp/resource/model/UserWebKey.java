package com.pnp.resource.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TBL_USER_WEB")
public class UserWebKey {

	@EmbeddedId
	private UserWeb userWeb;

	public UserWeb getUserWeb() {
		return userWeb;
	}

	public void setUserWeb(UserWeb userWeb) {
		this.userWeb = userWeb;
	}
	
	@Override
	public String toString(){
		return this.userWeb.getUsername();
	}
	
	
}
