package com.designpatterns.graph.pattern.creative.simplefactory.pizze;


/**
 * @author: jiangjiabin
 * @date: Create in 15:08 2021/10/30
 * @description:
 */
public abstract class Pizza {

    private String name;


    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
