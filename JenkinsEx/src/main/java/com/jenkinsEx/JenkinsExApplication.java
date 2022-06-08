package com.jenkinsEx;

import java.util.Scanner;

public class JenkinsExApplication {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();
        System.out.println("tong = " + (a+b));
    }
}
