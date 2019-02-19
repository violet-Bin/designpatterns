package com.designpatterns.observer;

import com.designpatterns.observer.mode.CurrentConditions;
import com.designpatterns.observer.mode.ForcastConditions;
import com.designpatterns.observer.mode.NewCondition;
import com.designpatterns.observer.mode.WeatherDataSt;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 15:27 2019/2/19
 */
public class InternetWeather {

    public static void main(String[] args) {
        CurrentConditions mCurrentConditions;
        ForcastConditions mForcastConditions;
        NewCondition mnewCondition;
        WeatherDataSt mWeatherDataSt;

        mWeatherDataSt=new WeatherDataSt();
        mCurrentConditions=new CurrentConditions();
        mForcastConditions=new ForcastConditions();
        mnewCondition = new NewCondition();

        mWeatherDataSt.registerObserver(mCurrentConditions);
        mWeatherDataSt.registerObserver(mForcastConditions);
        mWeatherDataSt.registerObserver(mnewCondition);

        mWeatherDataSt.setData(30, 150, 40);
        mWeatherDataSt.removeObserver(mForcastConditions);
        mWeatherDataSt.setData(45, 120, 34);

    }

}
