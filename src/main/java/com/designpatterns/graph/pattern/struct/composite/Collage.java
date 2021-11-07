package com.designpatterns.graph.pattern.struct.composite;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jiangjiabin
 * @date: Create in 17:25 2021/11/7
 * @description:
 */
public class Collage extends OrganizationComponent {

    private List<OrganizationComponent> departments = new ArrayList<>();


    public Collage(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent department) {
        departments.add(department);
    }

    @Override
    public void delete(OrganizationComponent department) {
        departments.remove(department);
    }

    @Override
    public void list() {
        System.out.println(this.getName());
        departments.forEach(OrganizationComponent::list);
    }
}
