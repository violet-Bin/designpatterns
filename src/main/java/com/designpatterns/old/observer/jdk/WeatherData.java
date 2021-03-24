package com.designpatterns.old.observer.jdk;

import java.util.Observable;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 16:17 2019/2/19
 */
public class WeatherData extends Observable {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    public float getTemperature() {
        return mTemperature;

    }

    public float getPressure() {
        return mPressure;

    }

    public float getHumidity() {
        return mHumidity;

    }


    public void dataChange() {
        this.setChanged();
        this.notifyObservers(new Data(getTemperature(), getPressure(), getHumidity()));
    }


    public void setData(float mTemperatrue, float mPressure, float mHumidity) {
        this.mTemperature = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    public class Data {
        float mTemperature;
        float mPressure;
        float mHumidity;

        public Data(float mTemperature, float mPressure, float mHumidity) {
            this.mTemperature = mTemperature;
            this.mPressure = mPressure;
            this.mHumidity = mHumidity;
        }
    }
}
