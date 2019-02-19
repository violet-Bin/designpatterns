package com.designpatterns.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 16:26 2019/2/19
 */
public class ForcastConditions implements Observer {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(Observable o, Object arg) {
        this.mTemperature = ((WeatherData.Data) (arg)).mTemperature;
        this.mTemperature = ((WeatherData.Data) (arg)).mPressure;
        this.mTemperature = ((WeatherData.Data) (arg)).mHumidity;
        display();
    }

    private void display() {
        System.out.println("**明天温度:" + (mTemperature + Math.random()) + "**");
        System.out.println("**明天气压:" + (mPressure + 10 * Math.random()) + "**");
        System.out.println("**明天湿度:"+(mHumidity+Math.random())+"**");
    }
}
