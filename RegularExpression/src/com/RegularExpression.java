package com;

import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		String str="Akhil";
		
		System.out.println("Returns true if 'Akhil' matches 'Akhil' :"+
		Pattern.matches(str, "Akhil")); //False
		
		System.out.println("Returns true if 'Akhil' or 'Akhil' matches 'Akhil' : "+
		Pattern.matches("[Aa]khil", "Akhil")); //True
		
		//System.out.println("Returns true if the string matches exactly 'Spidey' or 'spidey' or 'Hulk' or 'hulk' with 'Hulk' : "+
		//Pattern.matches("[Ss]pidey | [Hh]ulk", "Hulk"));//True
		
		System.out.println("returns true if the string contains more than one 'A' or 'a' in the beginning of the string 'AaAkhil78@gmail.com' : " +
		Pattern.matches(".*[Aa+]khil.*", "AaAkhil78@gmail.com"));//True
		
		System.out.println( "returns true if the '9678abhi' have number in the beginning : "+
		Pattern.matches("[\\d].*", "9678abhi")); //True
	// "^[^\\d]" means does not contain number 0-9 in the beginning
	// "[^\\d]" means does not contain number at all	
	// "[\\d]" means contain number 0-9  it can also be written as [0-9]
	// ".*[\\d]^" means does not contain number in the end	
		
		System.out.println("returns true if the string does not have number in the beginning : " +
		Pattern.matches("^[^\\d].*", "ajeesh9678")); //True
		
		System.out.println("returns true if the string does not have number in the end : " +
		Pattern.matches(".*[^\\d]^", "ajeesh9678"));//false

	}

}