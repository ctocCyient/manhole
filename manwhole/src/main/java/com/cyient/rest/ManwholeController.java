package com.cyient.rest;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.catalina.core.ApplicationContext;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
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

import com.cyient.dao.ManholeRepository;
import com.cyient.model.ManholeData;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/Manhole")
public class ManwholeController {
	
	
	@Autowired
	private ManholeRepository manholeresp;
	
	Gson gson = new Gson();
	@GetMapping(path="/test", produces = "application/json")  
	public String test(){ 
		return "Working fine";	    	
	}  

	
	@PostMapping(path="/push_data",consumes = "application/json")
	public String update_data(@Valid @RequestBody ManholeData data) {
		System.out.println(data);
		manholeresp.save(data);
        return "Done"; 
	}
	
	
	@GetMapping(path="/getData", produces = "application/json")  
	public Iterable<ManholeData> getSiteAccess()
	{ 	
		return manholeresp.findAll() ;	    	
	} 
	
}
