package com.svj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.svj.model.Employee;

public interface IEmployee extends JpaRepository<Employee, Integer>{
	

}
