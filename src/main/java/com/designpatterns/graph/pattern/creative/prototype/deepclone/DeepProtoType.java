package com.designpatterns.graph.pattern.creative.prototype.deepclone;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;

/**
 * @author: jiangjiabin
 * @date: Create in 1:43 2021/10/31
 * @description:
 */
@Data
@AllArgsConstructor
public class DeepProtoType implements Serializable, Cloneable {

    private int id;
    private DeepCloneableTarget deepCloneableTarget;

    //重写clone()实现深拷贝
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //完成基本数据类型和String类型的克隆
        deep = super.clone();
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    //通过序列化实现深拷贝
    public DeepProtoType deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (DeepProtoType) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) bos.close();
                if (oos != null) oos.close();
                if (bis != null) bis.close();
                if (ois != null) ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }
}
