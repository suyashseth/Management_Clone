package com.repository;

import java.util.HashMap;
import java.util.Map;

import com.dto.Employee;

public class DataBase {

	Map<Integer,Employee> map = new HashMap<>();

	public boolean addEmp(Employee emp)
	{
		Employee emp1 = map.put(emp.getId(),emp);
		if(emp1!=null)
		{
			return true;
		}
		return false;
	}

















}
