package project_alpha;
import java.util.Arrays;

import java.util.*;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        /*
        System.out.println("Hello java!!");
//        sout+tab
        String name = "yogesh";
        String neighbour = "boss";
        int age = 30;
        String friend = neighbour;
        /* byte -128 - 127
            float -4
            long
            double -8
            char -4
            boolean -1

        byte phone = 30;
        int mobile = 922234037;
        long hello = 9222340376L;
        char word = '@';
        boolean isMard = true;

        /* non-primitive type


        String newname = "yogesh";
        System.out.println(name.length());

//        concatenate
        String name1 = name + newname;
        System.out.println(name.charAt(1));
//        String name2 = name.replace()
        String namenew = "hello my friend";
//        System.out.println(namenew.substring(0,8));
        int[] marks = n
        int[][] finalMarks = {{13,14,15}, {14,13,13}};
        marks[0] = 66;
        marks[1] = 44;
        marks[2] = 98;
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(finalMarks[0][1]);ew int[3];

         /*
        int p = 100;
        int fp = p + (int)18;
        System.out.println(fp);

        double price = 120;
        double finalPrice = price + 18;
        System.out.println(finalPrice);
        // constants

        int age = 30;
        age = 31;
        age = 32;

        final float pi = 3.14F;

 */
/*      operators
        int a = 1;
        int b = 2;
        int sum = a+b;
        System.out.println(sum);
        int diff = a-b;
        System.out.println(diff);
        int mul = a*b;
        System.out.println(mul);
        double div = a / b;
        System.out.println(div);
        double modulo = a%b ;
        System.out.println(modulo);

        assignment operator "="


        int number = 1;
        System.out.println(number++);
        System.out.println(number);

       MATHS CLASS
    max, min, random

        System.out.println(Math.max(5,9));
        System.out.println(Math.min(5,9));
        System.out.println((int)(Math.random()*100));

        Scanner sc = new Scanner(System.in);
        System.out.println("input your Name : ");
//        float age = sc.nextFloat()
//        System.out.println(age);
//        String names = sc.next();
        String names2 = sc.nextLine();
//        System.out.println(names);
        System.out.println(names2);

*/
        // LOOPS
//        boolean areyouMard = true;
//        if(areyouMard == true)
//            System.out.println("you are a true Mard");
//        else
//            System.out.println("you are NaMard");
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Are You Mard - TRUE OR FALSE :");
        String answer = sc.next();
        if( answer.equals("true") ) or if(answer)
            System.out.println("you are a true mard");
        else
            System.out.println("you are a namard");

        int a = 6;
        int b = 9;

        if(a<10 || b>10 )
            System.out.println("you win");

        if(a<10 && b< 10 )
            System.out.println("you winss");


        Scanner sc = new Scanner(System.in);

        System.out.println("how much money do you have");
        int cash = sc.nextInt();

        if(cash < 10 ){
            System.out.println("you cannot buy anything");
            System.out.println("get more cash");
        }
        else if (cash >10 && cash < 50) {
            System.out.println("can get 1 thing");
        }
        else {
            System.out.println("can buy anyfucking thing you want");
        }
//    switch


        int day = 2;
        switch (day){
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            default :
                System.out.println("holiday");

 */
        // Loops

//        for(int i = 100; i >= 1; i -- ){
//            System.out.println(i);
//        }
        //while loop
//        int i = 14;
//        while(i >= 1){
//            System.out.println(i);
//            i = i-2;
//        }
        //dowhile
//        int k = 420;
//        do {
//            System.out.println(k);
//            k = k-1;
//        }while(k >= 1);
/*
        //do while loop to get input again and again
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("input a number");
            number = sc.nextInt();
            System.out.println("here is your number");
            System.out.println(number);
        }while(number >=0);
        System.out.println("Fuck off");

// print a list of nos without 3
     int i = 0;
        while(true){
            if(i ==3 ){
                i = i+1;
                continue;
            }
            System.out.println(i);
            i = i+1;
            if(i >5){
                break;
            }

            int [] marks = {14, 13, 15};
            System.out.println(marks[4]);
        */
//        nested loops
//        4 start rectangle
        /*
        for(int i =1 ; i<=4; i++){
            for(int j =1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }


//        hollow  rectangle
        int y = 4;
        int x = 5;
        for(int i = 1; i<=y; i++){
            for(int j = 1; j<=x; j++){
                if(i == 1 || j == 1 || i== y || j== x ) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i =1; i<=y; i++){
            for(int j= 1; j<=x; j++){
                if(i ==1 || j==1 || i ==y || j ==x) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


//        half pyramid
        int y = 4;

        for(int i =1 ; i <=y; i++){
            for (int j =1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


//        inverted half pyramid
//        inverting code above ( i= n to 1 and i-- ; j is same as j= 1 to i; j++)
        int n = 4;

        for (int i =n; i>=1; i--){
            for (int j = 1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int n = 4;
        for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Printing asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }



//        printing the pattern in java
        int n = 5;
        for(int i =1 ; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();


//      pattern of number without reapeating
        int n =5;
        int number =1 ;
        for (int i =1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(number +" ");
                number++;
            }
            System.out.println();

//        pattern of 0 and 1
        int n =5;
        int number = 1;
        for (int i = 1; i <=n; i++){
            for (int j = 1; j<=i ; j++){
                int sum = i +j ;
                if(sum % 2  == 0){
                System.out.print("1 ");
            }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        int x = 5;
        for (int k = 1; k <=x ; k++){
            for (int l =1 ; l<=k; l++){
                int sum = k +l;
                if (sum %2 ==0 ){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();

        //        printing butterfly pattern
        int n = 5 ;
        // outer loop
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space = 2*i
            // starts => for int j to i
            int spaces = 2 *(n-i);
            for(int j = 1; j<= spaces; j++){
                System.out.print(" ");
            }
            //2nd part(right half)
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space = 2*i
            // starts => for int j to i
            int spaces = 2 *(n-i);
            for(int j = 1; j<= spaces; j++){
                System.out.print(" ");
            }
            //2nd part(right half)
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // ||Done||
---------------------------------------------------------
        //Solid Rhombus
        int n = 5;

        for (int i =1; i<=n; i++){
            int spaces = n-i;
            for(int j = 1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
------------------------------------------------------------------


        // print pattern of pyramid

        int n=5;
        for(int i =1 ; i<=n; i++){
            int spaces = n-i;
            for(int j =1 ; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

------------------------------------------------------------------

        // palindromic pattern
//spaces = n-i; +
// number in reverse order +
// number in serial order +
        int n = 5;
        for (int i=1; i<= n; i++){
            int spaces = n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=i ; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2 ; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
----------------------------------------------------------------

// Diamond Pattern
// space + star + mirror
        int n = 4;
        for(int i =1 ; i<=n; i++){
            int spaces = n-i;
            for(int j =1 ; j<=spaces; j++){
                System.out.print(" ");
            }
            int stars = 2*i-1;
            for (int j = 1; j<=stars; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i = n ; i>=1; i--){
            int spaces = n-i;
            for(int j =1 ; j<=spaces; j++){
                System.out.print(" ");
            }
            int stars = 2*i-1;
            for (int j = 1; j<=stars; j++){
                System.out.print("*");
            }

            System.out.println();
        }

--------------------------------------------------------------------------
        */
        // functions and methods
    }
}


