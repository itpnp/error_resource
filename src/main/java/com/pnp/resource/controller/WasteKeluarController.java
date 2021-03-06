package com.pnp.resource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pnp.resource.model.DetailWasteKeluar;
import com.pnp.resource.model.WasteKeluar;
import com.pnp.resource.service.WasteKeluarService;

@RestController
public class WasteKeluarController {

	@Autowired
	private WasteKeluarService wasteKeluarService;
	
	@RequestMapping(value="/wastekeluar/save", method = RequestMethod.POST, headers="Accept=application/json")
	public @ResponseBody boolean addWasteKeluar(@RequestBody WasteKeluar wasteKeluar){
		int id = (wasteKeluarService.getLastId())+1;
		wasteKeluar.setId(id);
		for(DetailWasteKeluar detail : wasteKeluar.getDetailWasteKeluar()){
			detail.setWasteKeluar(wasteKeluar);
		}
		return wasteKeluarService.saveWaste(wasteKeluar);
//		return false;
	}
}
