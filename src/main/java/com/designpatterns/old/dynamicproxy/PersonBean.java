package com.designpatterns.old.dynamicproxy;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 0:01 2019/2/20
 */
public interface PersonBean {

    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);

}
