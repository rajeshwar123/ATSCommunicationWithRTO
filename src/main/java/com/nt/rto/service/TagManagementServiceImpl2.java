package com.nt.rto.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nt.model.VehicleSummary;

@Service
public class TagManagementServiceImpl2 implements TagManagementService {
	public TagManagementServiceImpl2() {
		System.out.println("TagManagementServiceImpl2.TagManagementServiceImpl2()");
	}

	@Autowired
	RestTemplate restTemp;
	
 public static final String RTO_REST_URL="http://localhost:1221/getVehicleSummary?regNo={regNum}";

	@Override
	public VehicleSummary getVehicleDtlsByNum(String regNum) {
		/*ResponseEntity<VehicleSummary> responseEntity = restTemp.exchange(RTO_REST_URL, HttpMethod.GET, null, VehicleSummary.class,regNum);
		int statusCode = responseEntity.getStatusCode().value();
		if (statusCode == 400) {
			return null;
		}
		VehicleSummary vehicleSummary = responseEntity.getBody();
		*/
		VehicleSummary vehicleSummary = restTemp.getForObject(RTO_REST_URL, VehicleSummary.class, regNum);
		return vehicleSummary;
	}
}