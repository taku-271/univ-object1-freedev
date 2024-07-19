package com.example.prod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prod.model.Subject;
import com.example.prod.repository.SubjectRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SubjectService  {
    @Autowired
    SubjectRepository SubjectRepository;

    public List<Subject> getAll() {
        return SubjectRepository.findAll();
    }

    public Subject post(Subject subject) {
        return SubjectRepository.save(subject);
    }
}
