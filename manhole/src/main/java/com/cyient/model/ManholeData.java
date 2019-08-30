package com.cyient.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Manhole")
public class ManholeData implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="data")
	private String data;
	
	@Column(name="dataEUI")
	private String dataEUI;
	
	@Column(name="deviceName")
	private String deviceName;
	
	@Column(name="adr")
	private String adr;
	
	@Column(name="applicationID")
	private String applicationID;
	
	@Column(name="applicationName")
	private String applicationName;
	
	@Column(name="fCnt")
	private String fCnt;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDataEUI() {
		return dataEUI;
	}

	public void setDataEUI(String dataEUI) {
		this.dataEUI = dataEUI;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getApplicationID() {
		return applicationID;
	}

	public void setApplicationID(String applicationID) {
		this.applicationID = applicationID;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getfCnt() {
		return fCnt;
	}

	public void setfCnt(String fCnt) {
		this.fCnt = fCnt;
	}

	public String getfPort() {
		return fPort;
	}

	public void setfPort(String fPort) {
		this.fPort = fPort;
	}

	public String getRxInfo() {
		return rxInfo;
	}

	public void setRxInfo(String rxInfo) {
		this.rxInfo = rxInfo;
	}

	public String getTxInfo() {
		return txInfo;
	}

	public void setTxInfo(String txInfo) {
		this.txInfo = txInfo;
	}

	@Column(name="fPort")
	private String fPort;
	
	@Column(name="rxInfo")
	private String rxInfo;
	
	@Column(name="txInfo")
	private String txInfo;
	
	
	
	
}
