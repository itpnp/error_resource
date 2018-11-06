package com.pnp.resource.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_keluar")
public class Keluar {

	@Id
	@Column(name="NO_ROLL")
	private String noRoll;
	
	@Column(name="NOMOR_PP_CUTTER")
	private String noPPCutter;
	
	public String getNoRoll() {
		return noRoll;
	}

	public void setNoRoll(String noRoll) {
		this.noRoll = noRoll;
	}

	public String getNomorPP() {
		return noPPCutter;
	}

	public void setNomorPP(String nomorPP) {
		this.noPPCutter = nomorPP;
	}

}
