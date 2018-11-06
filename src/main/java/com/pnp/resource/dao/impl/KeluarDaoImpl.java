package com.pnp.resource.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.pnp.resource.dao.KeluarDao;
import com.pnp.resource.model.Keluar;
import com.pnp.resource.util.HibernateUtil;

@Repository("keluarDao")
public class KeluarDaoImpl implements KeluarDao {

	private Session session;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Keluar> findById(String noPP) {
		List<Keluar> listKeluar = new ArrayList<>();
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Criteria crt = session.createCriteria(Keluar.class)
					.add(Restrictions.eq("noPPCutter", noPP));
			listKeluar = crt.list();
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			 if (session.isOpen()){
	                session.close();
	            }
		}
		return listKeluar;
	}

}
