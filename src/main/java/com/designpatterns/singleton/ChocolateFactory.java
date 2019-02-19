package com.designpatterns.singleton;

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


}
