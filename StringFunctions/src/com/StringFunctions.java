package com;

public class StringFunctions {

	public static void main(String[] args) {
		String name="Akhil";
		StringBuffer sb=new StringBuffer(name);
		sb.append(" R U");
		System.out.println("my full name is "+sb);
		StringBuffer sb1=new StringBuffer("I am eating idli");
		sb1.insert(12, "Butter ");
		System.out.println(sb1);
		sb1.replace(12, 19, "masala ");
		System.out.println(sb1);
		sb1.delete(12,18);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		System.out.println("======================================");
		System.out.println("String builder");
		
		StringBuilder sb2=new StringBuilder(name);
		sb2.append(" R U");
		System.out.println("my full name is "+sb2);
		StringBuilder sb3=new StringBuilder("I am eating idli");
		sb3.insert(12, "Butter ");
		System.out.println(sb3);
		sb3.replace(12, 19, "masala ");
		System.out.println(sb3);
		sb3.delete(12,18);
		System.out.println(sb3);
		
		sb3.reverse();
		System.out.println(sb3);	

	}

}