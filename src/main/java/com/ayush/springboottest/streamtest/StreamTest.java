package com.ayush.springboottest.streamtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
@Component
public class StreamTest {

    public void test(){
        String name="Ayush Pratap Singh";
        Map<String, Long> characterLongMap = name.chars().peek((x) -> System.out.println(x)).mapToObj(x -> (char) x).map(x->x.toString().toLowerCase()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characterLongMap);
    }
}
