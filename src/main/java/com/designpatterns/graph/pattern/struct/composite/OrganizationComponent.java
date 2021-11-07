package com.designpatterns.graph.pattern.struct.composite;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: jiangjiabin
 * @date: Create in 17:25 2021/11/7
 * @description:
 */
public abstract class OrganizationComponent {

    @Getter @Setter
    private String name;

    public void add(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }

    public void delete(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }

    public abstract void list();

    public OrganizationComponent(String name) {
        this.name = name;
    }
}
