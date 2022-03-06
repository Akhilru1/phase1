package com;

//call by value
class CallByValue{  
	 int data=50;  
	  
	 void change(CallByValue op){  
	 op.data=op.data+100;//changes will be in the instance variable  
	 }  
	     
	    
	 public static void main(String args[]){  
		 CallByValue op=new CallByValue();  
	  
	   System.out.println("Before change -> "+op.data);  
	   op.change(op);//passing object  
	   System.out.println("After change -> "+op.data);  
	  
	 }  
	}  



