package com.docurepo.swagger.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docurepo.swagger.model.EmployeeEntity;
import com.docurepo.swagger.repository.EmployeeResposity;

@Service
public class EmployeeService {

	@Autowired
	EmployeeResposity repoResposity;
	
	public void addEmployee(EmployeeEntity employee) {
		repoResposity.save(employee);
	}

	public EmployeeEntity getEmployee(Integer id) {
		return repoResposity.findById(id).get();
	}

	public List<EmployeeEntity> getAllEmployee() {
		
		Stream<String> str = Stream.empty();
		
		List<EmployeeEntity> list = repoResposity.findAll();
		//list.stream();
		return list;
	}

	public void updateEmployee(EmployeeEntity employee, Integer id) {
		EmployeeEntity employeeEntity = repoResposity.findById(id).get();
		
		employeeEntity.setAge(employee.getAge());
		employeeEntity.setCity(employee.getCity());
		employeeEntity.setCountry(employee.getCountry());
		employeeEntity.setDesignation(employee.getDesignation());
		employeeEntity.setFirstname(employee.getFirstname());
		employeeEntity.setLastname(employee.getLastname());
		
		repoResposity.save(employeeEntity);	
	}

	public void updatePatchEmployee(EmployeeEntity employee, Integer id) {
		
		EmployeeEntity employeeEntity = repoResposity.findById(id).get();
		
		employeeEntity.setAge(employee.getAge());
		employeeEntity.setCity(employee.getCity());
		employeeEntity.setCountry(employee.getCountry());
		employeeEntity.setDesignation(employee.getDesignation());
		employeeEntity.setFirstname(employee.getFirstname());
		employeeEntity.setLastname(employee.getLastname());
		
		repoResposity.save(employeeEntity);	
	}
	
	public void deleteEmployee(Integer id) {
		EmployeeEntity employeeEntity = repoResposity.findById(id).get();
		repoResposity.delete(employeeEntity);
		
	}

}
