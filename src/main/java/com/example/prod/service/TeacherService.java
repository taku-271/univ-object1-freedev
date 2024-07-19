package com.example.prod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prod.model.Teacher;
import com.example.prod.repository.TeacherRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TeacherService {
    @Autowired
    TeacherRepository TeacherRepository;

    public Teacher getTeacher(Integer id) {
        return TeacherRepository.findById(id).orElse(null);
    }

    public List<Teacher> getAll() {
        return TeacherRepository.findAll();
    }

    public Teacher post(Teacher teacher) {
        return TeacherRepository.save(teacher);
    }
}
