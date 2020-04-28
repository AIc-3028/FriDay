package com.company;

import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

//        int x = 3;
//
//        if (x == 3) {
//
//            System.out.println(x);
////        }
////
//        Even or Odd Checker
//        Random random = new Random();
//        int ran = random.nextInt(100);
//        if (ran % 2 == 0) {
//                System.out.println(ran + " is Even");}
//        else {
//                System.out.println(ran + " is Odd");}

        // String Checker

        String A = "daniel";
        String B = "morales";

        System.out.println(A.length()+B.length());

        if (A.compareTo(B) > 1){
            System.out.println("Yes");}
        else {
            System.out.println("No");}
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(capA+" "+capB);
//
//        char grade = 'A';
//        String you = "You got a ";
//
//        switch (grade) {
//
//            case 'A':
//                System.out.println(you + "A!");
//                break;
//            case 'B':
//                System.out.println(you + "B!");
//                break;
//            case 'C':
//                System.out.println(you + "C!");
//                break;
//            case 'D':
//                System.out.println(you + "D!");
//                break;
//            case 'F':
//                System.out.println(you + "F!");
//                break;
//            default:
//                System.out.println("Not a Valid grade"
//                );
//                break;}
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("I'm in a for loop: " + i);
//        }
//
//        for (int i = 1; i <= 20; i++) {
//            System.out.println("Counter is " + i);
//        }
//
//        for (; ; ) {
//            System.out.println("INFINTE");
//            break;
//        }
//
//        int[] simpleArray = {1, 2, 3, 4, 6};
//
//        for (int i = 0; i < simpleArray.length; i++) {
//            System.out.println("Value of item in array: " + simpleArray[i]);
//        }
//
//        for (int item : simpleArray) {
//            System.out.println("Enhanced for loop item: " + item);
//        }
//
//        int y = 2;
//
//        while (y == 2) {
//            System.out.println(y);
//            break;}
//
////        do {
////            System.out.println("y is great");}
////            while (y == 2);
////            break;
//
//        char ch = 'c';
//
//        do{
//            System.out.println("Type q to stop");
//            ch = (char) System.in.read();} while (ch != 'q');
//
//        System.out.println("Command entered");

//        Random random = new Random();
//        int breakAt = random.nextInt(100);
//
//        for (int i = 0; i < 100; i++){
//            if (i == breakAt){
//            System.out.println("RAM: " + breakAt);
//        break;}
//
//        System.out.println("Index= " +i);}
//
//
//        outer:
//        for (int x = 1; x <= 5; x++){
//            System.out.println("Staring list " + x);
//        for (int i=0; i<100; i++){
//
//            if (i==breakAt){
//                System.out.println("Length of this list: "+ breakAt);
//                break outer;} else {break;}}}
//
//        // generate a random number between 0 and 100
//        random = new Random();
//        breakAt = random.nextInt(100);
//
//// print a 'list' of random length
//        for(int i=0; i<100; i++)
//        {
//            if ( i==breakAt)
//            {
//                System.out.println("Random number was: " + breakAt);
//                break;
//            }
//            // if number is even, skip to next iteration
//            if ( i%2==0)
//            {
//                continue;
//            }
//            System.out.println("Index: " + i);
//        }
//        System.out.println("After the loop");
//
//
//        // the snippet would print 5 'lists', each with the numbers 0-12 in them.
//        outer:
//        for(int i=0; i<5; i++)
//        {
//            System.out.println("List number: " + i);
//            for(int y=0; y<25; y++)
//            {
//                System.out.println("Index: " + y);
//                if ( y == 12)
//                {
//                    continue outer;
//                }
//            }
//        }



     }
}