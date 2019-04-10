package com.xyy.hashmap;

import java.util.HashMap;
import java.util.Map;

class HashDemo{
    HashDemo(){
        System.out.println("构造函数打印出Hello World!");
    }
}

public class HashDemo2 {

    public static void main(String[] args){
        HashDemo2 hashDemo2 = new HashDemo2();
        hashDemo3();
        hashDemo2.HashDemo4();
        HashDemo hashDemo = new HashDemo();

    }

    public static void hashDemo3(){
        Map<String,String> map2 = new HashMap<String,String>(); //需要先写一个方法
        map2.put("1","HelloWorld!");
        map2.put("2","HelloWorld2");
        map2.put("3","HelloWorld3");


        for (String key:map2.keySet()){
            System.out.println("key为: " + key + "value为: " + map2.get(key));
        }

        for (String value: map2.values()){
            System.out.println("map2的values为: " + map2.values());
        }
    }

    public void HashDemo4(){
        System.out.println("Hello World!");
    }







}
