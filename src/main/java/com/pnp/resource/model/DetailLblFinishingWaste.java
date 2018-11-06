package com.pnp.resource.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings({ })
@Embeddable
public class DetailLblFinishingWaste implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="JUMLAH")
	private int jumlah;
	
	@Column(name="NOMOR_PP_CUTTER")
	private String noPPCutter;
	
	@Column(name="JENIS_WASTE")
	private String jenisWaste;
	
	@Column(name="status")
	private String status;
			
	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public String getNoPPCutter() {
		return noPPCutter;
	}

	public void setNoPPCutter(String noPPCutter) {
		this.noPPCutter = noPPCutter;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getJenisWaste() {
		return jenisWaste;
	}

	public void setJenisWaste(String jenisWaste) {
		this.jenisWaste = jenisWaste;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
