package com.designpatterns.graph.pattern.creative.prototype;

import com.designpatterns.graph.pattern.creative.prototype.deepclone.DeepCloneableTarget;
import com.designpatterns.graph.pattern.creative.prototype.deepclone.DeepProtoType;

/**
 * @author: jiangjiabin
 * @date: Create in 0:49 2021/10/31
 * @description:
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep0 = new Sheep("MiMi", "White");
        Sheep clone1 = (Sheep) sheep0.clone();
        Sheep clone2 = (Sheep) sheep0.clone();
        Sheep clone3 = (Sheep) sheep0.clone();
        Sheep clone4 = (Sheep) sheep0.clone();

        // 浅拷贝 hashCode相等
        System.out.println(clone1.hashCode() + " " + clone2.hashCode()
                + " " + clone3.hashCode() + " " + clone4.hashCode());

        //深拷贝方式一
        DeepCloneableTarget deepCloneableTarget = new DeepCloneableTarget(2, "canglaoshi");
        DeepProtoType deepProtoType = new DeepProtoType(1, deepCloneableTarget);
        DeepProtoType deepClone1 = (DeepProtoType) deepProtoType.clone();
        System.out.println(deepCloneableTarget.hashCode() + " " + deepClone1.hashCode());

        //深拷贝方式二
        DeepProtoType deepClone2 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(deepCloneableTarget.hashCode() + " " + deepClone2.hashCode());

    }
}
