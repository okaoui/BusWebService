package com.developeinjava.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stop", propOrder = {
		"stopId",
		"streetCd",
		"cityCd"
})
public class Stop {
	
	private long stopId;
	private String streetCd;
	private String cityCd;
	
	public long getStopId() {
		return stopId;
	}
	public void setStopId(long stopId) {
		this.stopId = stopId;
	}
	public String getStreetCd() {
		return streetCd;
	}
	public void setStreetCd(String streetCd) {
		this.streetCd = streetCd;
	}
	public String getCityCd() {
		return cityCd;
	}
	public void setCityCd(String cityCd) {
		this.cityCd = cityCd;
	}
	
	
	
}
