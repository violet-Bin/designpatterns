package com.designpatterns.old.decorator.jdk;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 18:03 2019/2/19
 */
public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new UpperCaseInputStream(new BufferedInputStream(
                    new FileInputStream("E:\\SoftWare\\IDEA\\ideaProjects\\designpatterns\\src\\main\\java\\com\\designpatterns\\decorator\\jdk\\test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
