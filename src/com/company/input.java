package com.company;
import java.util.Scanner;
import java.util.*;

public class input {
    public static void main(String []args)
    {
        Scanner myObj = new Scanner(System.in);
        String input;


        System.out.println("Enter input" +"\n");
        input = myObj.nextLine();

        System.out.println("input=" +input+"\n");

        String a=input.substring(0,3);
        System.out.println(a);

        String b=input.substring(3,4);
        System.out.println(b);

        String c=input.substring(4,7);
        System.out.println(c+"\n");

        String d= a+b+c;

        System.out.println("\n"+"Output="+"("+a+")"+b+"("+c+")");


    }

}
