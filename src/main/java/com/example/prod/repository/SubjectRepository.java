package com.example.prod.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prod.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{
    
}
