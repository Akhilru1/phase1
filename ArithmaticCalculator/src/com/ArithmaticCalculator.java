package com;

import java.util.Scanner;
public class ArithmaticCalculator {
	public static void main(String[] args){

    //using User input
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the any value for num1?");
    int num1=sc.nextInt();
    System.out.println("Enter the any value for num2?");
    int num2=sc.nextInt();

  //Addition Operation
  int sum = num1 + num2;
  System.out.println("Sum is: " + sum);

  //Subtraction Operation
  int dif = num1 - num2;
  System.out.println("Difference is : " + dif);

  //Multiplication Operation
  double mul = num1 * num2;
  System.out.println("Multiplied value is : " + mul);

  //Division Operation
  double div = num1 / num2;
  System.out.println("Quotient is : " + div);

  //Modulus Operation
  int rem = num1 % num2;
  System.out.println("Remainder is : " + rem);
 }
}