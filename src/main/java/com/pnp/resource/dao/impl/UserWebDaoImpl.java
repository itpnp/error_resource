package com.pnp.resource.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.pnp.resource.dao.UserWebDao;
import com.pnp.resource.model.UserWebKey;
import com.pnp.resource.util.HibernateUtil;

@Repository("userWebDao")
public class UserWebDaoImpl implements UserWebDao{

	private Session session;
	@Override
	public UserWebKey login(String username, String password) {
		UserWebKey user = new UserWebKey();
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Criteria crt = session.createCriteria(UserWebKey.class).
					add(Restrictions.eq("userWeb.username", username)).
					add(Restrictions.eq("userWeb.password", password));
			user = (UserWebKey) crt.uniqueResult();
		}catch(HibernateException e){
			e.printStackTrace();
		}
		return user;
	}

}
