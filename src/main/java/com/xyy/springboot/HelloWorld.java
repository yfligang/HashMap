package com.xyy.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("baggioli/HelloWorld")
@SuppressWarnings("FieldCanBeLocal")

public class HelloWorld {

    @RequestMapping(value = "cool/{userName}",method = RequestMethod.GET)  //没有分号，没有大括号
    //需要写一个方法，如果传参userName
    public String cool(@PathVariable String userName){
        userName = "kiss";
        return userName;

    }
}
