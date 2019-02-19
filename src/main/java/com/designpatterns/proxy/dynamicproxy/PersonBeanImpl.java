package com.designpatterns.proxy.dynamicproxy;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 0:03 2019/2/20
 */
public class PersonBeanImpl implements PersonBean {

    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingcount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if (ratingcount == 0) return 0;
        return (rating / ratingcount);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating = rating;
        ratingcount++;
    }

}
