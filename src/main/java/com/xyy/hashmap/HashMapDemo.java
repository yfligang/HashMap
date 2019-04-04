package com.xyy.hashmap;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args){
        Map map1 = new HashMap();
        map1.put("a","aaa");
        map1.put("b","bbb");
        map1.put("c","ccc");
        map1.put("d","ddd");
        map1.put("e","eee");
        map1.put("f","fff");

        Iterator iterator = map1.keySet().iterator();
        int i = 0;
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println("map1.get"+ "(" + i + ")" + "is: " + map1.get(key));
            i++;
        }





    }


}
