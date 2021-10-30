package com.designpatterns.graph.pattern.creative.builder;

/**
 * @author: jiangjiabin
 * @date: Create in 2:45 2021/10/31
 * @description:
 */
public interface HouseBuilder {

    House HOUSE = new House();

    void buildBasic();
    void buildWalls();
    House getResult();
}
