package com.example.prod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prod.model.Teacher;
import com.example.prod.service.TeacherService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/teacher")
@CrossOrigin
public class TeacherController {

    @Autowired
    TeacherService TeacherService;

    @GetMapping("/")
    public List<Teacher> getSubject() {
        return TeacherService.getAll();
    }

    @PostMapping("/post")
    public Teacher postMethodName(@RequestBody Teacher teacher) {
        return TeacherService.post(teacher);
    }    
}
