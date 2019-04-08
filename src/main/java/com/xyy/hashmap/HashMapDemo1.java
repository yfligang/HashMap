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


import java.util.*;

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
        iteratorHaskMapByEntrySet(map1);

        iteratorHashMapByKeySet(map1);

        iteratorHashMapJustValues(map1);
    }

    private static void iteratorHaskMapByEntrySet(HashMap map1){
        if (map1 == null){
            return;
        }

        System.out.println("\niterator HashMap by entryset");
        String key = null;
        Integer integer = null;
        Iterator iterator = map1.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();

            key = (String)entry.getKey();
            integer = (Integer)entry.getValue();
            System.out.println(key + "--" + integer.intValue());
        }
    }

    //遍历HashMap的values
    private static void iteratorHashMapByKeySet(HashMap map1){
        if (map1 == null){
            return;
        }

        Collection collection = map1.values();
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //遍历HashMap的values
    private static void iteratorHashMapJustValues(HashMap map1){
        if (map1 == null){
            return;
        }

        Collection collection = map1.values();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
