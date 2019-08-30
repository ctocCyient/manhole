package com.cyient.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;

import com.cyient.model.ManholeData;
import com.cyient.model.sensorData;




public interface ManholeDAO {
	
	@Transactional
	public void addData(sensorData manholeData);
	
	@Transactional
	public List<sensorData> getAllData();
	
}
