package com.ifmo.lesson2;

import java.util.Scanner;

public class DigitsSum {
    /*
    Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех
    его цифр (заранее не известно сколько цифр будет в числе).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int digitSum = digitSum(n);

        System.out.println(digitSum);
    }

    private static void recurs(int n) {
        int a;

        while (a != 0)
            a = n / 10;
        recurs (n);
    }


    public static int digitSum(int n) {
        // TODO implement

        return 0;
    }
}
