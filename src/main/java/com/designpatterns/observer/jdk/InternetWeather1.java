package com.designpatterns.observer.jdk;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 16:28 2019/2/19
 */
public class InternetWeather1 {

    public static void main(String[] args) {
        CurrentConditions mCurrentConditions;
        ForcastConditions mForcastConditions;
        WeatherData mWeatherData;

        mCurrentConditions=new CurrentConditions();
        mForcastConditions=new ForcastConditions();
        mWeatherData=new WeatherData();

        mWeatherData.addObserver(mCurrentConditions);
        mWeatherData.addObserver(mForcastConditions);
        mWeatherData.setData(30, 150, 40);

        mWeatherData.deleteObserver(mCurrentConditions);
        mWeatherData.setData(35, 150, 60);
    }
}
