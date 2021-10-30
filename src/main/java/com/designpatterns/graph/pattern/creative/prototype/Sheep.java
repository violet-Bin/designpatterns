package com.designpatterns.graph.pattern.creative.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: jiangjiabin
 * @date: Create in 0:47 2021/10/31
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sheep implements Cloneable, Serializable {

    private String name;
    private String color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
