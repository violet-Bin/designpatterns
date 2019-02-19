package com.designpatterns.observer.mode;

import com.designpatterns.observer.observer.Observer;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 16:08 2019/2/19
 */
public class NewCondition implements Observer {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        display();
    }

    private void display() {
        System.out.println("***new mTemperature:" + mTemperature + "***");
        System.out.println("***new mPressure:" + mPressure + "***");
        System.out.println("***new mHumidity:" + mHumidity + "***");
    }
}
