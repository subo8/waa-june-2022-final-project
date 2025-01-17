package com.finalproject.controllers;

import com.finalproject.models.Tags;
import com.finalproject.service.TagSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tags")
@CrossOrigin(origins = "*")
public class TagController {

    @Autowired
    TagSevice tagSevice;

    @GetMapping
    public List<Tags> findAll() {
        return tagSevice.findAll();
    }
}
