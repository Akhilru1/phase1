package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Float> map = new HashMap<String, Float>();   
		map.put("Idli with chatni",  50.8f);  
		map.put("Pizza with Extra cheese", 200.23f);   
		map.put("Sandwich with milkshake", 150.00f);   
		map.put("Fries with sauce", 50.89f);   
		for (Map.Entry<String,Float> entry : map.entrySet()) 
		{    
		System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());   
		}
		
		
		Map<String,String> map1=new HashMap<String, String>();
		map1.put("Mahadev", "prshanth");
		map1.put("Arun", "sunkad");
		map1.put("Abhi", "Ram");
		map1.put("Ayush", "Jain");
		map1.put("Akul", "Chowdary");
		
		for (String name: map1.keySet())         
		{  
		String lastname=map1.get(name);   
		System.out.println("Key: " + name + ", Value: " + lastname);   
		}     
	}
}
