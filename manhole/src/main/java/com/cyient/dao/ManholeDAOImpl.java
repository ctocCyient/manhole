package com.cyient.dao;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;


import com.cyient.model.ManholeData;
import com.cyient.model.sensorData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;


@Repository
public class ManholeDAOImpl implements ManholeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	Gson gson = new Gson();

	public void addData(sensorData data) {
		sessionFactory.getCurrentSession().saveOrUpdate(data);
	}

	public List<sensorData> getAllData() {
		Criteria c = sessionFactory.getCurrentSession().createCriteria(sensorData.class);
		return (List<sensorData>)c.list();
	} 




}