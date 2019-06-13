package com.dao;

import com.dto.Employee;
import com.repository.DataBase;

public class DAOImpl implements DAO{

	DataBase db = new DataBase();
	@Override
	public boolean createEmployee(Employee emp) {

		boolean res = db.addEmp(emp);

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
