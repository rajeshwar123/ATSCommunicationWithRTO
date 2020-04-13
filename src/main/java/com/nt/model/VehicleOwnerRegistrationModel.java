package com.nt.model;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleOwnerRegistrationModel {
	
	private Integer oid;
	private String fname;
	private String lname;
	private String email;
	private String dob;
	private String ssn;

}
