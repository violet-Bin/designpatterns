package com.designpatterns.graph.pattern.struct.composite;

/**
 * @author: jiangjiabin
 * @date: Create in 18:07 2021/11/7
 * @description:
 */
public class Client {

    public static void main(String[] args) {

        OrganizationComponent tsinghua = new University("tsinghua");

        OrganizationComponent culture = new Collage("culture");
        OrganizationComponent science = new Collage("science");

        OrganizationComponent computer = new Department("computer");
        OrganizationComponent art = new Department("art");

        tsinghua.add(culture);
        tsinghua.add(science);

        culture.add(art);
        culture.add(computer);

        computer.list();

        System.out.println("=====");
        tsinghua.list();

    }
}
