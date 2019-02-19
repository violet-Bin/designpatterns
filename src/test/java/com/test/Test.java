package com.test;

import java.util.*;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 19:17 2019/2/19
 */
public class Test {

    @org.junit.Test
    public void t1() {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(4);
        System.out.println("hashSet       " + hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(4);
        System.out.println("linkedHashSet     " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(23);
        treeSet.add(12);
        treeSet.add(78);
        treeSet.add(15);
        treeSet.add(2);
        System.out.println("treeSet    " + treeSet);

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "qwe");
        hashMap.put(4, "asd");
        hashMap.put(1, "cv");
        hashMap.put(3, "a");
        System.out.println("hashMap       " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2, "as");
        linkedHashMap.put(4, "as");
        linkedHashMap.put(1, "as");
        linkedHashMap.put(3, "as");
        System.out.println("linkedHashMap      " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(23, "qwe");
        treeMap.put(78, "qwe");
        treeMap.put(99, "qwe");
        treeMap.put(12, "qwe");
        treeMap.put(15, "qwe");
        treeMap.put(2, "qwe");
        System.out.println("treeMap    " + treeMap); //中序遍历

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(123);
        arrayList.add(321);
        arrayList.add(999);
        arrayList.add(34);
        arrayList.add(90);
        arrayList.add(3);
        System.out.println("ArrayList     " + arrayList);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(132);
        linkedList.add(231);
        linkedList.add(123);
        linkedList.add(34);
        linkedList.add(90);
        linkedList.add(3);
        System.out.println("linkedList     " + linkedList);


    }

}
