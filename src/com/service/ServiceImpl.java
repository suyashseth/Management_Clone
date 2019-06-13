package com.service;

import com.dao.DAO;
import com.dao.DAOImpl;
import com.dto.Employee;

public class ServiceImpl implements ServiceDAo{

	DAO d = new DAOImpl();
	@Override
	public boolean createEmployee(Employee emp) {
	
		boolean res = d.createEmployee(emp);
		return res;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
