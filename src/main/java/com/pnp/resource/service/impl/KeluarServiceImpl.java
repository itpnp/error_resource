package com.pnp.resource.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pnp.resource.dao.KeluarDao;
import com.pnp.resource.model.Keluar;
import com.pnp.resource.service.KeluarService;

@Service("keluarService")
public class KeluarServiceImpl implements KeluarService{

	@Autowired
	private KeluarDao keluarDao;
	
	@Override
	public List<Keluar> findById(String noPP) {
		// TODO Auto-generated method stub
		return keluarDao.findById(noPP);
	}

}
