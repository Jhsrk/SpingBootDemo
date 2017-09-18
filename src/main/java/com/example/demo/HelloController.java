package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ${lishijie} on 2017/9/18 0018.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        return "hello hello";
    }
}
