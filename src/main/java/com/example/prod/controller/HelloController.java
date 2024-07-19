package com.example.prod.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> getHelloWorld() {
        return Map.of("/api/hello", "return Hello World!");
    }

    @GetMapping("/help")
    public List<Map<String, String>> getHelp() {
        return Arrays.asList(
            Map.of("/api/help", "return this json"),
            Map.of("/api/hello", "return Hello World!"),
            Map.of("/api/user/", "return user by id"),
            Map.of("/api/user/post", "post user"),
            Map.of("/api/subject/", "return all subject"),
            Map.of("/api/subject/post", "post subject"),
            Map.of("/api/teacher/", "return all teacher"),
            Map.of("/api/teacher/post", "post teacher")
        );
    }
}
