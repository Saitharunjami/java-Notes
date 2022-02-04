package com.Tharun;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* java operators
	* arithmetic operators
	* assignment operators
	* logical operators
	* comparison operators */

    //arithmetic operators
    int a = 8;
    int b = 6;
    int sum = a + b; //addition
    int mul = a *  b; //multiplication
    int div = a / b; // division
    int sub = a - b; // subtraction
    int modulo = a % b; //modulus gives remainder as output
        System.out.println(modulo);

    //assignment operators
    int num = 6;
        System.out.println(++num);// '++' adds 1 to the value
    int num1 = 3;
        System.out.println(--num1);// '--' reduce the value by 1

    //maths class
    // let 2 numbers 5, 8
        System.out.println(Math.max(5, 8));//gives maximum value,8
        System.out.println(Math.min(5, 8));//gives minimun value,5
        System.out.println(Math.random());//gives a random number
        System.out.println((int)(Math.random()*100));//gives an integer multiplied by 100

    // taking input
      /*  Scanner sc = new Scanner(System.in); //in for input
        System.out.println("input age : ");
        float age = sc.nextFloat();
        System.out.println(age); */

    //comparison operators
    // a == b (if a equal to b gives true, else false)
    // a != b (a not equal to b gives true, else false)
    // a < b
    // a > b
    // a <= b
    // a >= b


    // conditional statements
    boolean isSunUp = true;
    if(isSunUp == true)
        System.out.println("day");
    else
        System.out.println("night");  // output = day, isSunUp = true

    int age =34;
    if(age <= 18)
        System.out.println("Minor");
    else
        System.out.println("Major");

    //logical operators (analyse multiple statements)
    int m = 30;
    int n = 40;
    if(a < 50 && b < 50) //&& both should satisfy (and,and) )
        System.out.println("both less than 50");
    else
        System.out.println("not less than 50");

    // || (atleast one should satisfy)
     if(a < 45 || b > 50)
         System.out.println("atleast one less than 50");
     // '!' makes negative
        boolean isAdult = false;
        if(!isAdult)
            System.out.println("is adult");
        else
            System.out.println("not adult"); // output = isadult due to (!)


      //example code
      //cost of pen= 10, cost of book=50

      /*Scanner sc = new Scanner(System.in);
      int cash = sc.nextInt();
      if(cash < 10) {
          System.out.println("cannot buy anyything");
          System.out.println("bring more cash");
      }
      else if(cash >10 && cash < 49)
          System.out.println("can buy pen");
      else if(cash >= 50 && cash < 60 )
          System.out.println("can buy book or pen of your choice");
      else if(cash >= 60)
          System.out.println("can buy both");  */ //try this code

   //conditional statements- SWITCH
   int day =1;
   switch(day) {
       case 1 :
           System.out.println("monday");
           break;
       case 2 :
           System.out.println("tuesday");
           break;
       default:
           System.out.println("wed - sun");
   }

   //loops
   // for loop
   //printing 1-100
    for(int i = 1; i <= 10; i = i + 1) {
        System.out.println(i); //output as 1,2,3......
    }
    // printing 100-1
        for(int i = 10; i >= 10; i = i - 1) {
            System.out.println(i);
        }
    //while loop
    int j = 10;
    while(j >= 1) {
        System.out.println(j);
        j = j - 1;
    }

    //do while
        int k = 10;
    do {
        System.out.println(k);
        k = k - 1;
    } while(k >= 1);


//example
 /*Scanner sc = new Scanner(System.in);
 int number = 0;

 do {
     System.out.println("input a number");
     number = sc.nextInt();
     System.out.println("here is your number");
     System.out.println(number);
 } while(number >= 0);
        System.out.println("THE END"); */

//break and continue
  int l = 0;
  while(true) {
      if(l == 3) {
          l = l + 1;
          continue;
      }
      System.out.println(l);
      l = l + 1;
      if(l > 5){
          break;
      }

  }

  //TRY - CATCH in EXCEPTION HANDLING
  int[] marks = {97, 98, 95};
  try {
      System.out.println(marks[5]);
  } catch(Exception exception) {
      //do something after catching
  }
        System.out.println("his name is tharun");
       }
}
