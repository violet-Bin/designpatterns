package com.designpatterns.strategy.quackbehavior;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 14:37 2019/2/19
 */
public class GaGaQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("--GaGaQuackBehavior--");
    }
}
