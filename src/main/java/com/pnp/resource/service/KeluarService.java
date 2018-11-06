package com.pnp.resource.service;

import java.util.List;

import com.pnp.resource.model.Keluar;

public interface KeluarService {
	public List<Keluar> findById(String noPP);
}
