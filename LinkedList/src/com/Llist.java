package com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Llist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> llist=new LinkedList<String>();
        llist.add("Apple");
        llist.add("Orange");// if you miss an index then exception arises
        llist.add(2,"Banana");
        printLinkedList(llist);
        llist.remove(0);
        System.out.println("after removal");
        printLinkedList(llist);
        
        LinkedList<String>llist2=new LinkedList<String>();
        //going to fill this linkedlist using function in a sorted way
        
        sortLinkedList(llist2,"Akhil");
        sortLinkedList(llist2,"Abhi");
        sortLinkedList(llist2,"Anish");
        sortLinkedList(llist2,"Ayesh");
        sortLinkedList(llist2,"Ayush");
        sortLinkedList(llist2,"Akul");
        sortLinkedList(llist2,"Arun");
        sortLinkedList(llist2,"Mahadev");
        sortLinkedList(llist2,"Madhu");
        sortLinkedList(llist2,"Karthik");
        sortLinkedList(llist2,"Aditya");
        printLinkedList(llist2);



    }
    public static void printLinkedList(LinkedList<String> llist){
        Iterator<String> i=llist.iterator();
        while(i.hasNext()){
            System.out.println("The entries are "+i.next());
        }
        System.out.println("-----------------------------------------");
    }

    public static boolean sortLinkedList(LinkedList<String> llist, String item){
        ListIterator<String> li=llist.listIterator();
        while(li.hasNext()){
            int compare=li.next().compareTo(item);
            //System.out.println("The value of compare is "+compare);
            System.out.println("The item is currently "+item);
            System.out.println("=====================================================");
            if(compare==0){
                System.out.println(item+" is already added");
                return false;
            }else if(compare>0){
                li.previous();// go to the previous item
                li.add(item);//add the item
                return true;
            }else if(compare<0){
             //move on
            }
        }
        li.add(item);//leftover items added
        return true;

    }


	}
