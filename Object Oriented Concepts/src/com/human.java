package com;

public class human
{
    // Instance Variables
    String name;
    String hairColor;
    int age;
    String Occupation;
 
    // Constructor Declaration of Class
    public human(String name, String hairColor,
                   int age, String occupation)
    {
        this.name = name;
        this.hairColor = hairColor;
        this.age = age;
        this.Occupation = occupation;
    }
 
    // method 1
    public String getName()
    {
        return name;
    }
 
    // method 2
    public String getHairColor()
    {
        return hairColor;
    }
 
    // method 3
    public int getAge()
    {
        return age;
    }
 
    // method 4
    public String getOccupation()
    {
        return Occupation;
    }
 
    @Override
    public String toString()
    {
        return("Hi My Name is "+ this.getName()+
               ".\nMy hairColor,age and Occupation is " +
               this.getHairColor()+"," + this.getAge()+
               ","+ this.getOccupation());
    }
 
    public static void main(String[] args)
    {
        human we = new human("AKHIL","BLACK", 21, "SOFT. ENGG.");
        System.out.println(we.toString());
    }
}