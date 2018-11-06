package com.pnp.resource.dao;

import java.util.List;

import com.pnp.resource.model.Keluar;

public interface KeluarDao {
	public List<Keluar> findById(String noPP);
}
