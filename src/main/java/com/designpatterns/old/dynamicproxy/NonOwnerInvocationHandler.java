package com.designpatterns.old.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 0:09 2019/2/20
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            return method.invoke(person, args);
        } else if (method.getName().equals("setHotOrNotRating")) {
            return method.invoke(person, args);

        } else if (method.getName().startsWith("set")) {
            return new IllegalAccessException();
        }
        return null;
    }

}
