package com.example.prod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prod.model.Subject;
import com.example.prod.service.SubjectService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/subject")
@CrossOrigin
public class SubjectController {

    @Autowired
    SubjectService SubjectService;

    @GetMapping("/")
    public List<Subject> getSubject() {
        return SubjectService.getAll();
    }

    @PostMapping("/post")
    public Subject postMethodName(@RequestBody Subject subject) {
        return SubjectService.post(subject);
    }    
}
