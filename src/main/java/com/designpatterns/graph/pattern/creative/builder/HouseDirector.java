package com.designpatterns.graph.pattern.creative.builder;

/**
 * @author: jiangjiabin
 * @date: Create in 2:50 2021/10/31
 * @description: 指挥者
 */
public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //建造房子的流程交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        return houseBuilder.getResult();
    }
}
