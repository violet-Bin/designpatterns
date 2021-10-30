package com.designpatterns.graph.pattern.creative.builder;


/**
 * @author: jiangjiabin
 * @date: Create in 2:53 2021/10/31
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        HouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        HouseDirector director1 = new HouseDirector(commonHouseBuilder);
        House house1 = director1.constructHouse();
        System.out.println(house1.toString());

        HouseBuilder highHouseBuilder = new HighHouseBuilder();
        HouseDirector director2 = new HouseDirector(highHouseBuilder);
        House house2 = director2.constructHouse();
        System.out.println(house2.toString());
    }
}
