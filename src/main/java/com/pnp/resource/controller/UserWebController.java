package com.pnp.resource.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pnp.resource.model.UserWebKey;
import com.pnp.resource.service.UserWebService;

@RestController
public class UserWebController {

	@Autowired
	private UserWebService userWebService;
	
	@RequestMapping(value="/userweb/login", method = RequestMethod.POST, headers="Accept=application/json")
	public @ResponseBody UserWebKey login(@RequestBody UserWebKey data){

		String password = data.getUserWeb().getPassword();

        MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());

	        byte byteData[] = md.digest();
	      //convert the byte to hex format method 1
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < byteData.length; i++) {
	         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	        }

//	        System.out.println("Digest(in hex format):: " + sb.toString());

	        //convert the byte to hex format method 2
	        StringBuffer hexString = new StringBuffer();
	    	for (int i=0;i<byteData.length;i++) {
	    		String hex=Integer.toHexString(0xff & byteData[i]);
	   	     	if(hex.length()==1) hexString.append('0');
	   	     	hexString.append(hex);
	    	}
	    	data.getUserWeb().setPassword(hexString.toString());
//	    	System.out.println("Digest(in hex format):: " + hexString.toString());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UserWebKey userWeb = userWebService.login(data.getUserWeb().getUsername(), data.getUserWeb().getPassword());
				return userWeb;
	}
}
