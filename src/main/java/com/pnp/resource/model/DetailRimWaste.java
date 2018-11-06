package com.pnp.resource.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="TBL_DETAIL_RIM_WASTE")
public class DetailRimWaste {
	
	@Id
	@Column(name="KODE_RIM")
	private String kodeRim;
	
	@Column(name="NO_SPP")
	private String noSpp;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone="GMT+7")
	@Column(name="TGL_DELTIME_SPP")
	private Date tglDelTime;
	
	@Column(name="KODE_BAHAN")
	private String kodeBahan;
	
	@Column(name="JENIS_WASTE")
	private String jenisWaste;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone="GMT+7")
	@Column(name="TGL_MUTASI_WASTE")
	private Date tglMutasiWaste;
	
	@Column(name="NO_MUTASI")
	private String noMutasi;
	
	@Column(name="STATUS")
	private String status;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy="detailRimWaste")
	private List<DetailLblFinishingWasteKey> listDetailLblFinishingWaste;

	public String getKodeRim() {
		return kodeRim;
	}

	public void setKodeRim(String kodeRim) {
		this.kodeRim = kodeRim;
	}

	public String getNoSpp() {
		return noSpp;
	}

	public void setNoSpp(String noSpp) {
		this.noSpp = noSpp;
	}

	public Date getTglDelTime() {
		return tglDelTime;
	}

	public void setTglDelTime(Date tglDelTime) {
		this.tglDelTime = tglDelTime;
	}

	public String getKodeBahan() {
		return kodeBahan;
	}

	public void setKodeBahan(String kodeBahan) {
		this.kodeBahan = kodeBahan;
	}

	public String getJenisWaste() {
		return jenisWaste;
	}

	public void setJenisWaste(String jenisWaste) {
		this.jenisWaste = jenisWaste;
	}

	public Date getTglMutasiWaste() {
		return tglMutasiWaste;
	}

	public void setTglMutasiWaste(Date tglMutasiWaste) {
		this.tglMutasiWaste = tglMutasiWaste;
	}

	public String getNoMutasi() {
		return noMutasi;
	}

	public void setNoMutasi(String noMutasi) {
		this.noMutasi = noMutasi;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<DetailLblFinishingWasteKey> getListDetailLblFinishingWaste() {
		return listDetailLblFinishingWaste;
	}

	public void setListDetailLblFinishingWaste(List<DetailLblFinishingWasteKey> listKeluar) {
		this.listDetailLblFinishingWaste = listKeluar;
	}
	
}
