package com.designpatterns.old.observer.observer;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 15:19 2019/2/19
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
