package com.designpatterns.graph.pattern.creative.builder;

/**
 * @author: jiangjiabin
 * @date: Create in 2:47 2021/10/31
 * @description: 具体建造者
 */
public class CommonHouseBuilder implements HouseBuilder {

    @Override
    public void buildBasic() {
        HOUSE.setBasic("10");
    }

    @Override
    public void buildWalls() {
        HOUSE.setWall("20");
    }

    @Override
    public House getResult() {
        return HOUSE;
    }
}
