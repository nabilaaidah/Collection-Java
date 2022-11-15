package LinkedListCollecrion;

import ListCollection.*;
import MapCollection.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author NABILA
 */
public class MainLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String> hurufQ = new LinkedList<String>();
        
        hurufQ.add("Z");
        hurufQ.add("X");
        hurufQ.add("C");
        hurufQ.add("V");
        
        System.out.println("Linked list : " + hurufQ);
        System.out.println("Queue size : " + hurufQ.size());
        while(!hurufQ.isEmpty()){
            System.out.println(hurufQ.removeFirst());
        }
        System.out.println("Linked list : " + hurufQ);
        
        LinkedList <String> hurufS = new LinkedList<String>();
        
        hurufS.push("Z");
        hurufS.push("X");
        hurufS.push("C");
        hurufS.push("V");
        
        
        System.out.println("Linked list : " + hurufS);
        System.out.println("Stack size : " + hurufS.size());
        while(!hurufS.isEmpty()){
            System.out.println(hurufS.removeFirst());
        }
        System.out.println("Linked list : " + hurufS);
    }
   
}
