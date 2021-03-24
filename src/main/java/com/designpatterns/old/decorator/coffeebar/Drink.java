package com.designpatterns.old.decorator.coffeebar;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 16:47 2019/2/19
 */
public abstract class Drink {
    public String description = "";
    private float price = 0f;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description + "--" + this.getPrice();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();

}
