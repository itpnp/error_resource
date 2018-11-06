package com.pnp.resource.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.pnp.resource.util.CustomerDateAndTimeDeserialize;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
@Table(name="tbl_keluar_waste")
public class WasteKeluar {
	
	@Id
	@Column(name="ID_MUTASI_KELUAR")
	private int id;
	
	@Column(name="NO_MUTASI_KELUAR")
	private String noMutasi;
	
	@JsonDeserialize(using=CustomerDateAndTimeDeserialize.class)
	@Column(name="TGL_MUTASI_KELUAR")
	private Date tglMutasi;
	
	@Column(name="JENIS_WASTE")
	private String jenisWaste;
	
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy="wasteKeluar")
	private List<DetailWasteKeluar> detailWasteKeluar;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNoMutasi() {
		return noMutasi;
	}

	public void setNoMutasi(String noMutasi) {
		this.noMutasi = noMutasi;
	}

	public Date getTglMutasi() {
		return tglMutasi;
	}

	public void setTglMutasi(Date tglMutasi) {
		this.tglMutasi = tglMutasi;
	}

	public String getJenisWaste() {
		return jenisWaste;
	}

	public void setJenisWaste(String jenisWaste) {
		this.jenisWaste = jenisWaste;
	}

	public List<DetailWasteKeluar> getDetailWasteKeluar() {
		return detailWasteKeluar;
	}

	public void setDetailWasteKeluar(List<DetailWasteKeluar> detailWasteKeluar) {
		this.detailWasteKeluar = detailWasteKeluar;
	}
	
}
