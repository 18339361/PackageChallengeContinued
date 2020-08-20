package com.newpackage.test;

import com.company.mylibrary.Series;

public class Main {

    public static void main(String[] args) {

        System.out.println("***** Testing nSum() *****");
	    for(int i=0; i<=10; i++){
            System.out.println(Series.nSum(i));
        }

        System.out.println("\n***** Testing factorial() *****");
        for(int i=0; i<=10; i++){
            System.out.println(Series.factorial(i));
        }

        System.out.println("\n***** Testing fibonacci() *****");
        for(int i=0; i<=10; i++){
            System.out.println(Series.fibonacci(i));
        }
    }
}
