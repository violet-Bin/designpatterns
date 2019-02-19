package com.designpatterns.observer.mode;

import com.designpatterns.observer.observer.Observer;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 15:05 2019/2/19
 */
public class ForcastConditions implements Observer {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;
    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature =mTemperature;
        this.mPressure=mPressure;
        this.mHumidity=mHumidity;
        display();
    }

    private void display() {
        System.out.println("**明天温度:" + (mTemperature + Math.random()) + "**");
        System.out.println("**明天气压:" + (mPressure + 10 * Math.random()) + "**");
        System.out.println("**明天湿度:"+(mHumidity+Math.random())+"**");
    }
}
