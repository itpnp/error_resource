package com.pnp.resource.dao.impl;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.pnp.resource.dao.DetailRimWasteDao;
import com.pnp.resource.model.DetailRimWaste;
import com.pnp.resource.util.HibernateUtil;

@Repository("detailRimWasteDao")
public class DetailRimWasteDaoImpl implements DetailRimWasteDao {

	private Session session;
	@Override
	public DetailRimWaste findByRim(String kodeRim) {
		DetailRimWaste detailRim = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Criteria criteria = session.createCriteria(DetailRimWaste.class).add(Restrictions.eq("kodeRim", kodeRim));
			detailRim = (DetailRimWaste)criteria.uniqueResult();
//			for(DetailLblFinishingWasteKey key : detailRim.getListDetailLblFinishingWaste()){
//				for(Keluar key2 : key.getListKeluar()){
//					Hibernate.initialize(key2);
//				}
//			}
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			try{
				if(session != null){
					if (session.isOpen()){
			            session.close();
			        }
				}
				
			}catch(HibernateException e){
				e.printStackTrace();
			}
			
		}
		return detailRim;
	}

}
