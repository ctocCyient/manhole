package com.cyient.rest;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.hibernate.SessionFactory;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.cyient.dao.ManholeDAO;
import com.cyient.model.ManholeData;
import com.cyient.model.sensorData;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/operations")
public class ManwholeController {
	
	
	@Autowired
	private ManholeDAO DAO;
	
	JSONObject Success_string =  new JSONObject();

	Gson gson = new Gson();
	@GetMapping(path="/test", produces = "application/json")  
	public String test(){ 
		return "Working fine";	    	
	}  
	
	@PostMapping(path="/push_data",consumes = "application/json")
	public String update_data(@Valid @RequestBody sensorData data) {
		System.out.println(data);
		try{
			DAO.addData(data);
			Success_string.put("status", "Data Added");
		}
		catch(Exception e)
		{
			
		}
        return Success_string.toString(); 
	}
	
	
	@GetMapping(path="/getData", produces = "application/json")  
	public List<sensorData> getSiteAccess()
	{ 	
		return (List<sensorData>) DAO.getAllData();  	
	} 
	
}
