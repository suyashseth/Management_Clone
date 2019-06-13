package com.controller;

import java.util.Scanner;

import com.dto.Employee;
import com.service.ServiceDAo;
import com.service.ServiceImpl;

public class CreateEmployeeController {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter salary");
		double sal = sc.nextDouble();
		System.out.println("Enter password");
		String pass = sc.next();
		
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setPassword(pass);
		emp.setSalary(sal);
		
		
		ServiceDAo service =  new ServiceImpl();
		boolean res = service.createEmployee(emp);
		if(res)
		{
			System.out.println("Employee Successfully Added");
		}
		else
		{
			System.out.println("Somethimg went wrong");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
