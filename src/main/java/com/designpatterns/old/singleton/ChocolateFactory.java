package com.designpatterns.old.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 21:22 2019/2/19
 */
public class ChocolateFactory {

    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateFactory uniqueInstance = null; //volatile配合synchronized

    private ChocolateFactory() {
        empty = true;
        boiled = false;
    }

    public static ChocolateFactory getInstance() {

        if (uniqueInstance == null) {
            synchronized (ChocolateFactory.class) {//加锁
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateFactory();
                }
            }
        }
        return uniqueInstance;
    }

    public void fill() {
        if (empty) {
            // 添加原料巧克力动作
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if ((!empty) && boiled) {
            // 排出巧克力动作
            empty = true;
        }
    }

    public void boil() {
        if ((!empty) && (!boiled)) {
            // 煮沸
            boiled = true;
        }
    }


    public static void main(String[] args) {
        List<String> strings = Collections.synchronizedList(new ArrayList<String>());
        strings.add("1");

        new ArrayList<Integer>().add(1);

        CopyOnWriteArrayList<Integer> l = new CopyOnWriteArrayList<Integer>();
        l.add(1);
        l.addIfAbsent(2);
        l.contains(1);
        l.get(1);

        CopyOnWriteArraySet set = new CopyOnWriteArraySet();
        set.add(1);

        AtomicInteger a = new AtomicInteger();
        a.getAndAdd(1);
        a.addAndGet(2);

    }


}
