package com.cyient.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cyient.model.ManholeData;



public interface ManholeRepository extends CrudRepository<ManholeData, Long>
{

	
	 List<ManholeData> findByDataAndDeviceName(String data,String devicename);
}
