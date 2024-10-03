package com.docurepo.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docurepo.swagger.model.EmployeeEntity;

@Repository
public interface EmployeeResposity  extends JpaRepository<EmployeeEntity, Integer>{

}
