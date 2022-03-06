package com;

import java.util.Stack;  
public class StackEx  
{  
public static void main(String[] args)   
{  
  
	Stack<Integer> stk= new Stack<>();  
 
	boolean result = stk.empty();  
	System.out.println("Is the stack empty? " + result);  

	stk.push(42);  
	stk.push(38);  
	stk.push(262);  
	stk.push(670);  
 
	System.out.println("Elements in Stack: " + stk);  
	result = stk.empty();  
	System.out.println("Is the stack empty? " + result);  
}  
}  