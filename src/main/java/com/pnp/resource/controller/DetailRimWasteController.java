package com.pnp.resource.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pnp.resource.model.DetailLblFinishingWasteKey;
import com.pnp.resource.model.DetailRimWaste;
import com.pnp.resource.model.Keluar;
import com.pnp.resource.service.DetailRimWasteService;
import com.pnp.resource.service.KeluarService;
import com.pnp.resource.service.WasteKeluarService;

@RestController
public class DetailRimWasteController {

	@Autowired
	private DetailRimWasteService detailRimWasteService;
	
	@Autowired
	private WasteKeluarService wasteKeluarService;
	
	@Autowired
	private KeluarService keluarService;
	
//	@RequestMapping(value="/detailrimwaste/find", method = RequestMethod.POST, headers="Accept=application/json")
//	public @ResponseBody DetailRimWaste findById(@RequestBody DetailRimWaste kode){
//		if(kode.getKodeRim().equals("")|| kode.getKodeRim().equals(null)){
//			return null;
//		}else{
//			DetailRimWaste detail= detailRimWasteService.findByRim(kode.getKodeRim());
//			return detail;
//		}
//	}
	@RequestMapping(value="/detailrimwaste/find", method = RequestMethod.POST, headers="Accept=application/json")
	public @ResponseBody HashMap<String,Object> findById(@RequestBody DetailRimWaste kode){
		HashMap<String, Object> map = new HashMap<String,Object>();
		DetailRimWaste detail= detailRimWasteService.findByRim(kode.getKodeRim());
		List<Keluar> listKeluar = new ArrayList<>();
		for(DetailLblFinishingWasteKey key : detail.getListDetailLblFinishingWaste()){
			listKeluar.addAll(keluarService.findById(key.getDetailKey().getNoPPCutter()));
//			listOfList.add(listKeluar);
		}
		map.put("detailRimWaste", detail);
		map.put("listKeluar", listKeluar);
		return map;
	}
	
	@RequestMapping(value="/detailrimwaste/test", method = RequestMethod.GET, headers="Accept=application/json")
	public HashMap<String,Object> test(){
//		HashMap<String, Object> map = new HashMap<String,Object>();
//		DetailRimWaste detail= detailRimWasteService.findByRim("18030000013F");
//		List<List<Keluar>> listOfList = new ArrayList<>();
//		List<Keluar> listKeluar;
//		for(DetailLblFinishingWasteKey key : detail.getListDetailLblFinishingWaste()){
//			listKeluar = keluarService.findById(key.getDetailKey().getNoPPCutter());
//			System.out.println(key.getDetailKey().getNoPPCutter());
//			System.out.println(listKeluar.size());
//			listOfList.add(listKeluar);
//		}
//		map.put("detailRimWaste", detail);
//		map.put("listKeluar", listOfList);
//		return map;
		int id = (wasteKeluarService.getLastId())+1;
		HashMap<String, Object> map = new HashMap<String,Object>();
		DetailRimWaste detail= detailRimWasteService.findByRim("18030000013F");
		List<Keluar> listKeluar = new ArrayList<>();;
		for(DetailLblFinishingWasteKey key : detail.getListDetailLblFinishingWaste()){
			listKeluar.addAll(keluarService.findById(key.getDetailKey().getNoPPCutter()));
		}
		map.put("detailRimWaste", detail);
		map.put("listKeluar", listKeluar);
		return map;
	}
}
