package com.designpatterns.graph.pattern.creative.builder;

/**
 * @author: jiangjiabin
 * @date: Create in 2:47 2021/10/31
 * @description:
 */
public class HighHouseBuilder implements HouseBuilder {

    @Override
    public void buildBasic() {
        HOUSE.setBasic("100");
    }

    @Override
    public void buildWalls() {
        HOUSE.setWall("200");
    }

    @Override
    public House getResult() {
        return HOUSE;
    }
}
