package cn.tedu;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World!!!");

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("总数为: " + sum);
    }
}
