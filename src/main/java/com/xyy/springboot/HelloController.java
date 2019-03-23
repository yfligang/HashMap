package com.xyy.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zhangsan/demoAPI")  //get和post之前共同填写的路径
public class HelloController {

//    @RequestMapping("/hello")  //web地址输入的参数
//    public String hello(){
//        return "Hello Spring Boot!";
//    }

    @RequestMapping(value = "/getDemo/{userName}",method = RequestMethod.GET) //访问这个方法，标注出的路径  getDemo后是你的参数
    public String getDemo(@PathVariable String userName){ //只要你在getDemo/后再添加信息，就可以返回
        String i = "aaaa";  //这部分就是业务逻辑
        userName = userName + " " + i;  //这部分就是业务逻辑
        System.out.println(userName);
        return "data you put is(您输入的数据是): " + userName ; //data you put is userName aaaa
    }

    @RequestMapping(value = "postDemo",method = RequestMethod.POST)
    public String postDemo(@PathVariable String userName){

        return "2";
    }



}
