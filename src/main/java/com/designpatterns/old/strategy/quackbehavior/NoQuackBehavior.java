package com.designpatterns.old.strategy.quackbehavior;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 14:37 2019/2/19
 */
public class NoQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("--NoQuackBehavior--");
    }
}
