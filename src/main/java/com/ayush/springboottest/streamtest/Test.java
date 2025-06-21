package com.ayush.springboottest.streamtest;

import org.springframework.beans.factory.annotation.Autowired;

public class Test {

    @Autowired StreamTest streamTest;

    void dummy(){
        streamTest.test();
    }
}
