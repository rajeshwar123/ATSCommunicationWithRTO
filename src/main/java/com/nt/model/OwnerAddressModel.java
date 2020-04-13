package com.nt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OwnerAddressModel {
	
	private Integer oaid;
	private Integer hno;
	private String streetno;
	private String city;
	private Integer zip;

}
