package com.nt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleRegistrationNoModel {
	
	private Integer vregid;
	private String regDate;
	private String regNo;
	private String regCenter;
	private String createDate;
	private String updateDate;

}
