package com.designpatterns.graph.pattern.struct.decorator;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: jiangjiabin
 * @date: Create in 0:30 2021/11/5
 * @description:
 */
public abstract class Drink {

    @Getter
    protected String desc;

    public abstract int cost();

}
