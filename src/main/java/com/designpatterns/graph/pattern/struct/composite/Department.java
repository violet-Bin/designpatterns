package com.designpatterns.graph.pattern.struct.composite;

import com.alibaba.fastjson.JSON;

/**
 * @author: jiangjiabin
 * @date: Create in 17:26 2021/11/7
 * @description:
 */
public class Department extends OrganizationComponent{

    public Department(String name) {
        super(name);
    }

    @Override
    public void list() {
        System.out.println(this.getName());
    }
}
