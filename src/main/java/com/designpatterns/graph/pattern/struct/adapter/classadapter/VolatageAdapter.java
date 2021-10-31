package com.designpatterns.graph.pattern.struct.adapter.classadapter;

/**
 * @author: jiangjiabin
 * @date: Create in 0:40 2021/11/1
 * @description:
 */
public class VolatageAdapter extends Voltage220Src implements Voltage5Dst {

    @Override
    public int output5() {
        return output220() / 44;
    }

}
