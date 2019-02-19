package com.designpatterns.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 16:23 2019/2/19
 */
public class CurrentConditions implements Observer {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(Observable o, Object arg) {
        this.mTemperature = ((WeatherData.Data) (arg)).mTemperature;
        this.mPressure = ((WeatherData.Data) (arg)).mPressure;
        this.mHumidity = ((WeatherData.Data) (arg)).mHumidity;
        display();
    }

    private void display() {
        System.out.println("***Today mTemperature:" + mTemperature + "***");
        System.out.println("***Today mPressure:" + mPressure + "***");
        System.out.println("***Today mHumidity:" + mHumidity + "***");
    }
}
