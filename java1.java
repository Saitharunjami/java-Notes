package com.Tharun;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// MY FIRST JAVA CODE
        System.out.println("Hello java");
    // shotcut for print statement is type sout + tab key


    //variables
    String name = "tharun";
    String neighbour = "bro";
    int age = 45;

    String friend = neighbour;
        System.out.println(friend);

    /* byte - 1 [-128 - 127]
       shot - 2
       int  - 4 (integers)
       long - 8
       float- 4 (3.14,2.45,1.33,..)
       double-8
       char - 2 (a,b,c....)
       boolean- 1  ( true and false only)   */

    byte age1 = 30;
    int phone = 92367245;
    long phone2 = 6423874367L;
    float pi = 3.14F;
    char letter = 'a';
    boolean isadult = false;

    //Non-primitive types
        String name3 = "captain";
        System.out.println(name3.length());

    //concatenate
    String name1 = "tony";
    String name2 = "stark";
    String name4 = name1 +" "+ name2;
        System.out.println(name4);

    //charAt
        String name5 = "tharun2";
        System.out.println(name5.charAt(3));
    //length
        System.out.println(name5.length());
    //replace
    String name6 = name5.replace('t','m');
        System.out.println(name6);
        System.out.println(name5);
        /*strings in java are immutable, we should create new string
        to replace it
         */
    //substring
        String name7 = "ironman and captain";
        System.out.println(name7.substring(0,7));

    //arrays
        int phy = 97;
        int che = 98;
        int eng =95;

        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        System.out.println(marks[0]);
        //length
        System.out.println(marks.length); //output will be the length of array
        //sort (makes ascending order)
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        // we can notice difference before and  after sorting


        // 2D arrays
        int[][] finalmarks = {{97, 98, 95}, {95, 94, 98}}; // use curly braces for multiple inputs
        System.out.println(finalmarks[1][1]); // printing 2nd student 2nd subject marks

        //casting
        double price = 100.00;
        double finalprice1 = price + 18; //implicit casting (adding small size to larger one)
        System.out.println(finalprice1);

        int p = 100;
        int fp = p + (int)18.0; //Explicit casting (double adding to int)
        System.out.println(fp); //in explicit casting we lose data
        int fp1 = p + (int)18.12;
        System.out.println(fp1); //we lose decimal data ,output = 118 only

        //constants
        //use final keyword to fix a constant value
        final float pi2 = 3.14F;
        System.out.println(pi2);
    }
}
