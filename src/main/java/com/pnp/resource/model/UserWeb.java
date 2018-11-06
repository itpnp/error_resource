package com.pnp.resource.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserWeb implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1879931586748268221L;

	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="BAGIAN")
	private String bagian;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBagian() {
		return bagian;
	}
	public void setBagian(String bagian) {
		this.bagian = bagian;
	}
	
	@Override
	public String toString(){
		return this.username;
	}
	
}
