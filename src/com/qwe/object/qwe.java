package com.qwe.object;

import java.util.Scanner;

public class qwe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";//62个
        String str = ""; //放6个字符
        for (int i = 0; i < 6; i++) {
            char s = a.charAt((int) (Math.random() * 62)); //随机生成字符(m-n)+m
            str += s; //字符累加
        }
        System.out.println("随机生成的验证码为:" + str);
        System.out.println("请输入验证码");

        if ((scanner.nextLine().trim()).equalsIgnoreCase(str)) { //键盘输入字符串,字符串比较函数
            System.out.println("验证成功");
            return;
        } else {
            System.out.println("验证失败");
            return;
        }
    }
}
