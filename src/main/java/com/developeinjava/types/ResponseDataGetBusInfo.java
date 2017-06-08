package com.developeinjava.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.developeinjava.models.Bus;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDataGetBusInfo", propOrder = {
    "bus"
})
public class ResponseDataGetBusInfo {

	private Bus bus;

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	
}
