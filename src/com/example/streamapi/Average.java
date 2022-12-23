package com.example.streamapi;

import java.util.Scanner;

class Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);// to take user input
        int choice;
        int a = 0, min = 0, max = 0, x;
        int n = args.length;
        System.out.println("1-sum");
        System.out.println("2-Average");
        System.out.println("3-Minimum");
        System.out.println("4-Maximum");
        System.out.println("Enter Ur Choice : ");
        choice = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a += Integer.parseInt(args[i]);//to convert string into Integer
        }
        switch (choice) {
            case 1:
                System.out.println("The sum is : " + a);
                break;
            case 2:
                System.out.println("The Average is : " + a / n);
                break;
            case 3:
                min= Integer.parseInt(args[0]);
                for (int i = 0; i < n; i++) {
                    x = Integer.parseInt(args[i]); //1 2
                    if (min > Integer.parseInt(args[i]))// 1<2 min=1 2<3 min =2
                    {
                        min=x;
                    }

                }
                System.out.println("The minimum is : " + min);
                break;
            case 4:
                for (int i = 0; i < n - 1; i++) {
                    x = Integer.parseInt(args[i]);
                    if (x > Integer.parseInt(args[i + 1]))
                        max = x;
                    else
                        max = Integer.parseInt(args[i + 1]);
                }
                System.out.println("The maximum is : " + max);

                break;
        }
    }
}