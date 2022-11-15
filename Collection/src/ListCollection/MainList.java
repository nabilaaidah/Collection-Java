package ListCollection;

import MapCollection.*;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author NABILA
 */
public class MainList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> belanja = new ArrayList();
        
        addCart(belanja);
        belanja.remove(2);
        belanja.add(1,"Sabun");
        displayBelanja(belanja);
    }
   
    static void addCart(ArrayList<String> belanja){
        belanja.add("Susu");
        belanja.add("Beras");
        belanja.add("Mie");
    }
    
    static void displayBelanja(ArrayList<String> belanja){
        for(String barang: belanja)
            System.out.println("Barang dibeli: " + barang);
    }
}
