package com.pnp.resource.dao.impl;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import com.pnp.resource.dao.WasteKeluarDao;
import com.pnp.resource.model.WasteKeluar;
import com.pnp.resource.util.HibernateUtil;

@Repository("wasteKeluarDao")
public class WasteKeluarDaoImpl implements WasteKeluarDao {

	private Session session;
	@Override
	public int getLastId() {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Criteria crt = session.createCriteria(WasteKeluar.class);
		ProjectionList projList = Projections.projectionList();
        projList.add(Projections.max("id"));
        crt.setProjection(projList);
        
        if(crt.list().get(0)!=null){
        	 int results = (Integer)crt.uniqueResult();
        	 return results;
        }else{
        	return 0;
        }
       
	}

	@Override
	public boolean saveWaste(WasteKeluar wasteKeluar) {
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(wasteKeluar);
			session.getTransaction().commit();
	        return true;
		}catch(HibernateException e){
			e.printStackTrace();
			return false;
		}finally{
			 if(session.isOpen()){
		            session.close();
		         }
			}
	}

}
