package com.designpatterns.graph.pattern.struct.adapter.objdapter;



/**
 * @author: jiangjiabin
 * @date: Create in 0:40 2021/11/1
 * @description:
 */
public class Phone {

    public void charging(Voltage5Dst voltage5Dst){
        int v = voltage5Dst.output5();
        if (v == 5) {
            System.out.println("可以充电！");
        } else {
            System.out.println("不可以充电！");
        }
    }

    public static void main(String[] args) {
        Phone p = new Phone();
        Voltage220Src v220 = new Voltage220Src();
        Voltage5Dst v = new VoltageAdapter(v220);

        p.charging(v);
    }
}
