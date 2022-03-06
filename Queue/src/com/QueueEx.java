package com;

import java.util.LinkedList;
import java.util.Queue;
 
public class QueueEx {
 
    public static void main(String[] args)
    {
        Queue<Integer> q
            = new LinkedList<>();
 
        for (int i = 0; i < 7; i++)
            q.add(i);
 
       
        System.out.println("Elements of queue "
                           + q);
 
        System.out.println("==========================");
        int removedele = q.remove();
        System.out.println("Removed element -> "
                           + removedele);
 
        System.out.println(q);
 
        System.out.println("==========================");
        int head = q.peek();
        System.out.println("Head of queue -> "
                           + head);
 
        
        int size = q.size();
        System.out.println("Size of queue -> "
                           + size);
    }
}