package com.designpatterns.graph.pattern.struct.adapter.objdapter;

/**
 * @author: jiangjiabin
 * @date: Create in 0:40 2021/11/1
 * @description:
 */
public class VoltageAdapter implements Voltage5Dst {

    private Voltage220Src voltage220Src;

    public VoltageAdapter(Voltage220Src voltage220Src) {
        this.voltage220Src = voltage220Src;
    }

    @Override
    public int output5() {
        return voltage220Src.output220() / 44;
    }

}
