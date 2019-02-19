package com.designpatterns.observer.mode;

import com.designpatterns.observer.observer.Observer;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 15:21 2019/2/19
 */
public class CurrentConditions implements Observer {

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
        System.out.println("***Today mTemperature:" + mTemperature + "***");
        System.out.println("***Today mPressure:" + mPressure + "***");
        System.out.println("***Today mHumidity:" + mHumidity + "***");
    }


}
