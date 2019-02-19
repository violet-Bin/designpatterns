package com.designpatterns.observer.mode;

import com.designpatterns.observer.observer.Observer;
import com.designpatterns.observer.observer.Subject;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 15:27 2019/2/19
 */
public class WeatherDataSt implements Subject {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;
    private ArrayList<Observer> mObservers;

    public WeatherDataSt() {
        mObservers = new ArrayList<>();
    }

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
        notifyObservers();
    }

    public void setData(float mTemperatrue, float mPressure, float mHumidity) {
        this.mTemperature = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        mObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        Optional<Observer> optional = Optional.ofNullable(o);
        optional.ifPresent(item -> mObservers.remove(o));
    }

    @Override
    public void notifyObservers() {
        for (int i = 0, len = mObservers.size(); i < len; i++) {
            mObservers.get(i).update(getTemperature(), getPressure(), getHumidity());
        }
    }
}
