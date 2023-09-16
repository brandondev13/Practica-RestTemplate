package com.brandon.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {



    private final RestTemplate restTemplate;

    @Autowired
    public Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping("/test")
    public Object getApi() {
        String url = "https://jsonplaceholder.typicode.com/todos/1";
        Result result = restTemplate.getForObject(url, Result.class);
        System.out.println("Result " + result);
        return result;

    }

    @GetMapping("/test/list")
    public List<Result> getListResult() {
        String url = "https://jsonplaceholder.typicode.com/todos";
        Result[] results = restTemplate.getForObject(url, Result[].class);
        return Arrays.asList(results);

    }




}
