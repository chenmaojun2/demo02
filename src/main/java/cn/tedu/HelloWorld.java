package cn.tedu;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World!!!");

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("总数为: " + sum);


        ArrayList<String> list = new ArrayList<String>();


        String s = "hao123";
        String s1 = "jd321";
        list.add(s);
        list.add(s1);
        System.out.println(list);

    }
}
