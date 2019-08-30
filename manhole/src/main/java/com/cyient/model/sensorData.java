package com.cyient.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//Maintaincehole_sensorsData
@Table(name = "MaintainenceHoleMonitoring")
public class sensorData implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name="Smoke_Detected")
	private Boolean smoke_Detected;
	
	@Column(name="Motion_Detected")
	private Boolean motion_Detected;
	
	@Column(name="Node_Moved")
	private Boolean node_Moved;
	
	@Column(name="Low_Battery")
	private Boolean low_Battery;
	
	@Column(name="M_Battery_Value")
	private int m_Battery_Value;
	
	@Column(name="m_Pressure")
	private float m_Pressure;
	
	@Column(name="M_Temperature")
	private float m_Temperature;

	@Column(name="m_Humidity")
	private float m_Humidity;
	
	@Column(name="m_fCnt")
	private int m_fCnt;
	
	@Column(name="m_rssi")
	private int m_rssi;
	
	@Column(name="timestamp")
	private long timestamp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Boolean isSmoke_Detected() {
		return smoke_Detected;
	}

	public void setSmoke_Detected(Boolean smoke_Detected) {
		this.smoke_Detected = smoke_Detected;
	}

	public Boolean isMotion_Detected() {
		return motion_Detected;
	}

	public void setMotion_Detected(Boolean motion_Detected) {
		this.motion_Detected = motion_Detected;
	}

	public Boolean isNode_Moved() {
		return node_Moved;
	}

	public void setNode_Moved(Boolean node_Moved) {
		this.node_Moved = node_Moved;
	}

	public Boolean isLow_Battery() {
		return low_Battery;
	}

	public void setLow_Battery(Boolean low_Battery) {
		this.low_Battery = low_Battery;
	}

	public int getM_Battery_Value() {
		return m_Battery_Value;
	}

	public void setM_Battery_Value(int m_Battery_Value) {
		this.m_Battery_Value = m_Battery_Value;
	}

	public float getM_Pressure() {
		return m_Pressure;
	}

	public void setM_Pressure(float m_Pressure) {
		this.m_Pressure = m_Pressure;
	}

	public float getM_Temperature() {
		return m_Temperature;
	}

	public void setM_Temperature(float m_Temperature) {
		this.m_Temperature = m_Temperature;
	}

	public float getM_Humidity() {
		return m_Humidity;
	}

	public void setM_Humidity(float m_Humidity) {
		this.m_Humidity = m_Humidity;
	}

	public int getM_fCnt() {
		return m_fCnt;
	}

	public void setM_fCnt(int m_fCnt) {
		this.m_fCnt = m_fCnt;
	}

	public int getM_rssi() {
		return m_rssi;
	}

	public void setM_rssi(int m_rssi) {
		this.m_rssi = m_rssi;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
