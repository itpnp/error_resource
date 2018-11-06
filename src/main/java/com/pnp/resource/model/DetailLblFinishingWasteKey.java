package com.pnp.resource.model;


import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="TBL_DETAIL_LBL_FINISHING_WASTE")
public class DetailLblFinishingWasteKey {
	
	@EmbeddedId
	private DetailLblFinishingWaste detailKey;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "KODE_RIM", nullable=false)
	@JsonIgnore
	private DetailRimWaste detailRimWaste;
	
	public DetailLblFinishingWaste getDetailKey() {
		return detailKey;
	}

	public void setDetailKey(DetailLblFinishingWaste detailKey) {
		this.detailKey = detailKey;
	}

	public DetailRimWaste getDetailRimWaste() {
		return detailRimWaste;
	}

	public void setDetailRimWaste(DetailRimWaste detailRimWaste) {
		this.detailRimWaste = detailRimWaste;
	}	

}
