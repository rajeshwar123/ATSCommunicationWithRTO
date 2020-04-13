package com.nt.rto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.VehicleSummary;
import com.nt.rto.service.TagManagementService;

@Controller
public class VehicleSearchController {
	
	public VehicleSearchController() {
		System.out.println("VehicleSearchController.VehicleSearchController()");
	}

	@Autowired
	TagManagementService service;

	@RequestMapping("/ptag")
	public String loadPurchaseTagForm() {
		return "purchaseTag";
	}

	@RequestMapping(value = "/getTag")
	public String vehicleSearchForm(Model model, @RequestParam("vhclRgNum") String vehcleRegNum) {
		System.out.println(vehcleRegNum);
		VehicleSummary vhclSummary = service.getVehicleDtlsByNum(vehcleRegNum);
		
		if (vhclSummary != null)
			model.addAttribute("vhclSummaryData", vhclSummary);
		else
			model.addAttribute("vhclSummaryData", "Vehicle Data is Not Found");
		return "purchaseTag";
	}
}