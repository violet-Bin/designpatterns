package com.designpatterns.new1206.singleresponsibility;

/**
 * @author: jiangjiabin
 * @date: Create in 15:36 2020/12/6
 * @description: 单一职责
 */
public class SingleResponsibility {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.runAir("飞机");
        vehicle.runRoad("汽车");
        vehicle.runWater("轮船");
    }

}


//应该分开 -> 天上、路上、水里
//这里只是在方法级别上遵守了单一职责原则
class Vehicle {

//    public void run(String vehicle) {
//        System.out.println(vehicle + "在 XX run");
//    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在 天上run");
    }
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在 路上run");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在 水中run");
    }
}