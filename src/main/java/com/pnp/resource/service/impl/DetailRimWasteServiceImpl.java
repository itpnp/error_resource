package com.pnp.resource.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pnp.resource.dao.DetailRimWasteDao;
import com.pnp.resource.model.DetailRimWaste;
import com.pnp.resource.service.DetailRimWasteService;

@Service ("detailRimWasteService")
public class DetailRimWasteServiceImpl implements DetailRimWasteService {

	@Autowired
	private DetailRimWasteDao detailRimWasteDao;
	
	@Override
	public DetailRimWaste findByRim(String kodeRim) {
		// TODO Auto-generated method stub
		return detailRimWasteDao.findByRim(kodeRim);
	}

}
