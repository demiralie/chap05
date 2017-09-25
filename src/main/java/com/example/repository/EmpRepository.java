package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.EmpVO;

public interface EmpRepository extends JpaRepository<EmpVO, Integer>{

}
