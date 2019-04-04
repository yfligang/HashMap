package com.xyy.hashmap;

/*
 10  * @desc 遍历HashMap的测试程序。
 11  *   (01) 通过entrySet()去遍历key、value，参考实现函数：
 12  *        iteratorHashMapByEntryset()
 13  *   (02) 通过keySet()去遍历key、value，参考实现函数：
 14  *        iteratorHashMapByKeyset()
 15  *   (03) 通过values()去遍历value，参考实现函数：
 16  *        iteratorHashMapJustValues()
 17  *
 18  * @author yfligang
 19  */


import java.util.HashMap;
import java.util.Random;

public class HashMapDemo1 {

    public static void main(String[] args){
        int val = 0;
        String key = null;
        Integer value = null;
        Random random = new Random();
        HashMap map1 = new HashMap();

        for (int i = 0; i < 12; i++){
            //随机获取一个[0,100]之间的数字
            val = random.nextInt(100);

            key = String.valueOf(val);

            //随机获取一个[1,5]之间的数字
            value = random.nextInt(5);

            //添加到HashMap中
            map1.put(key,value);

            System.out.println("map的值为:  " + map1);
        }

        // 通过entrySet()遍历HashMap的key-value
        iteratorHaskMapByKeySet(map1);

        

    }



}
