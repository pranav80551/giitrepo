package com.vinsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinsys.model.student;

public interface StudentRepo extends JpaRepository<student,Integer> {

}
