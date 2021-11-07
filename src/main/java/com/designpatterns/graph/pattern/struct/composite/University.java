package com.designpatterns.graph.pattern.struct.composite;

import com.alibaba.fastjson.JSON;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jiangjiabin
 * @date: Create in 17:25 2021/11/7
 * @description:
 */
public class University extends OrganizationComponent {

    @Getter
    private List<OrganizationComponent> collages = new ArrayList<>();

    public University(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent collage) {
        collages.add(collage);
    }

    @Override
    public void delete(OrganizationComponent collage) {
        collages.remove(collage);
    }

    @Override
    public void list() {
        System.out.println(this.getName());
        collages.forEach(OrganizationComponent::list);
    }
}
