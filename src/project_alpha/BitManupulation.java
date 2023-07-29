package project_alpha;

import java.util.Scanner;
public class BitManupulation {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int operations = sc.nextInt();

        // get bit => & operator to check it's pos

        /* GEt BIT operation
        1. bit mask 1<<i
        2. operation AND
        3. compare the number after AND and original number
         */
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        if ((bitMask & n) ==0 ){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }



        //operator AND and NOT
//---------------------------------------------
        //set bit
//        bit mask 1<<i => operation OR
        int number = bitMask | n;
        System.out.println(number);

//--------------------------------------------
        //clear bit
//        AND with NOT
        int notBitmask = ~(bitMask);
        int newNumber = notBitmask & n;
        System.out.println(newNumber);

//---------------------------------------------
        //UPDATE bit
        //int operation = 1;  update bit to 0
        // int operation = 0; // update bit to 1
        //set oper
        int bitmask = 1 << 1;
        if( operations ==1) {
            //set

            int numbers = bitmask | n;
            System.out.println(numbers);
        }else{
            //clear
            int newBitmask = ~(bitmask);
            int numbers  = bitmask & newBitmask;
            System.out.println(numbers);

        }


    }

}
