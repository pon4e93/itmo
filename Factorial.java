package com.ifmo.lesson2;

import java.util.Scanner;

public class Factorial {
    /*
     Создайте программу, вычисляющую факториал натурального числа n, которое
     пользователь введёт с клавиатуры.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long factorial = factorial(n);

        System.out.println(factorial);
    }

    public static long factorial(int n)
    {
        // TODO implement
        int a;

        while (n >= 0)
            a = (n - 1) * n;

        return 0;

    }
