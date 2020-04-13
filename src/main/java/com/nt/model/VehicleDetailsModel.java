package com.nt.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;



import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleDetailsModel {
	
	private Integer vid;
	private String type;
	private Integer year;
	private String vcompanyname;
	/*private VehicleOwnerRegistrationEntity vehicleOwn;*/

}
