package com.designpatterns.factory.pizzastore.pizza;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 21:39 2019/2/19
 */
public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setname(String name) {
        this.name = name;
    }
}
