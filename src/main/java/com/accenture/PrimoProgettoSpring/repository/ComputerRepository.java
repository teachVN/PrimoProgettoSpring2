package com.accenture.PrimoProgettoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.PrimoProgettoSpring.bean.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Integer>{
    
}
