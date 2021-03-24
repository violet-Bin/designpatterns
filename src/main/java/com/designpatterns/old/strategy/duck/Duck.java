package com.designpatterns.old.strategy.duck;

import com.designpatterns.old.strategy.flybehavior.FlyBehavior;
import com.designpatterns.old.strategy.quackbehavior.QuackBehavior;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 14:28 2019/2/19
 */
public abstract class Duck {

    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public Duck() {

    }

    public void Fly() {
        mFlyBehavior.fly();
    }

    public void Quack() {
        mQuackBehavior.quack();
    }

    public abstract void display();

    public void SetQuackBehavoir(QuackBehavior qb) {
        mQuackBehavior = qb;
    }

    public void SetFlyBehavoir(FlyBehavior fb) {
        mFlyBehavior = fb;
    }

    public void swim() {
        System.out.println("~~im swim~~");
    }

}
