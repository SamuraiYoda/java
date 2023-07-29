package project_alpha;

import java.util.Scanner;

public class functions {
    public static void printMyName(String name){
        System.out.println(name);

    }
    public  static int sumOftwo(int num1,int num2){
        int sums = ( num1 + num2);
        return sums;
    }
    public static int multiplyTwo(int a , int b){
        int multiply = a*b;
        return multiply;
    }
    public static int facTorial(int a){
        if(a ==0 || a ==1){
            return 1;
        }
        int fact = a*facTorial(a-1);
        return fact;
    }


    public static void main(String args[]){

//
//        Scanner scn = new Scanner(System.in);
//        int num1 = scn.nextInt();
//        int num2 = scn.nextInt();
//
//        int sum = sumOftwo(num1,num2);
//        int multi = multiplyTwo(num1 , num2);
//        System.out.println(multi);

        int fact = facTorial(3);
        System.out.println(fact);
    }
}
