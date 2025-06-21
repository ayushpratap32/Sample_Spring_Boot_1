package com.ayush.springboottest.controller;

import com.ayush.springboottest.streamtest.StreamTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class StreamController {

    @Autowired
    StreamTest streamTest;


    @GetMapping("/value")
    void test(){
        streamTest.test();
    }
}
