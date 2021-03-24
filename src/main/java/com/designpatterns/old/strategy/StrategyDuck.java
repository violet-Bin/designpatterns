package com.designpatterns.old.strategy;

import com.designpatterns.old.strategy.duck.Duck;
import com.designpatterns.old.strategy.duck.GreenHeadDuck;
import com.designpatterns.old.strategy.duck.RedHeadDuck;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 14:38 2019/2/19
 */
public class StrategyDuck {

    public static void main(String[] args) {
        Duck greenHeadDuck = new GreenHeadDuck();
        Duck redHeadDuck = new RedHeadDuck();

        greenHeadDuck.display();
        greenHeadDuck.Fly();
        greenHeadDuck.Quack();
        greenHeadDuck.swim();

        redHeadDuck.display();
        redHeadDuck.Fly();
        redHeadDuck.Quack();
        redHeadDuck.swim();

        redHeadDuck.SetFlyBehavoir(() -> System.out.println("new Fly"));
        redHeadDuck.SetQuackBehavoir(() -> System.out.println("new Quack"));
        redHeadDuck.display();
        redHeadDuck.Fly();
        redHeadDuck.Quack();

    }


}
