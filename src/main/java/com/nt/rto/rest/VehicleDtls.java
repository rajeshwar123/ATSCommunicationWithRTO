package com.nt.rto.rest;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleDtls {
	
	private Integer vid;
	private String type;
	private Integer year;
	private String vcompanyname;
	private VehicleOwnerDtls vehicleOwn;

}
