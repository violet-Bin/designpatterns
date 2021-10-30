package com.designpatterns.graph.pattern.creative.prototype.deepclone;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: jiangjiabin
 * @date: Create in 1:42 2021/10/31
 * @description:
 */
@Data
@AllArgsConstructor
public class DeepCloneableTarget implements Serializable, Cloneable {

    private int id;
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
