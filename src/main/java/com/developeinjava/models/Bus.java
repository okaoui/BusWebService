package com.developeinjava.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bus", propOrder = {
		"busNumber",
		"current",
		"next"
})
public class Bus {

	private int busNumber;
	private Stop current;
	private Stop next;
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public Stop getCurrent() {
		return current;
	}
	public void setCurrent(Stop current) {
		this.current = current;
	}
	public Stop getNext() {
		return next;
	}
	public void setNext(Stop next) {
		this.next = next;
	}
	
	
	
}
