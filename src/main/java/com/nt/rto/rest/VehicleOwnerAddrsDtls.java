package com.nt.rto.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleOwnerAddrsDtls {
	private Integer onrId;
	private Integer hno;
	private String streetno;
	private String city;
	private Integer zip;
	private VehicleOwnerDtls vehicleOwn;
}
