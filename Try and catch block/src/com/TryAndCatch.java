package com;

public class TryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("The answer is"+c);
		}catch(Exception e){
			System.out.println(e);
		}

	}

}