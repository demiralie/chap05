package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.DeptVO;

public interface DeptRepository extends JpaRepository<DeptVO, Integer>{

}
