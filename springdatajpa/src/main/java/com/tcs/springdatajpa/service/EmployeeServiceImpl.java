package com.tcs.springdatajpa.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.springdatajpa.model.Employee;
import com.tcs.springdatajpa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;


	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> findById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public void update(int id, Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}
		
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}
}	

