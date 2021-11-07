package com.designpatterns.graph.pattern.struct.proxy.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: jiangjiabin
 * @date: Create in 23:06 2021/11/7
 * @description:
 */
public class ProxyFactory implements MethodInterceptor {


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }
}
