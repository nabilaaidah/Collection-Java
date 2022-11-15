package SetCollection;

import MapCollection.*;
import java.util.HashMap;
import java.util.HashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author NABILA
 */
public class MainSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<Buku> rak = new HashSet<Buku>();
        
        Buku Buku1 = new Buku(1);
        Buku Buku2 = new Buku(2);
        Buku Buku3 = new Buku(3);
        Buku Buku4 = new Buku(4);
        Buku Buku5 = new Buku(5);
        
        rak.add(Buku1);
        rak.add(Buku2);
        rak.add(Buku3);
        rak.add(Buku4);
        rak.add(Buku5);
        
        findBook(rak, Buku2);
        display(rak);
    }
  
    static void findBook(HashSet<Buku> rak, Buku buku){
        if(rak.contains(buku))
            System.out.println("Buku " + buku.getDenom() + " tersedia");
        else
            System.out.println("Buku " + buku.getDenom() + " tidak tersedia");
    }
    
    static void display(HashSet<Buku> rak){
        if(rak.isEmpty())
            System.out.println("Tidak ada buku dalam rak");
        else{
            System.out.println("Terdapat sejumlah " + rak.size() + " di dalam rak");
        }
    }
}
