package MapCollection;

import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author NABILA
 */
public class MainMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,String> ibuKota = new HashMap<String,String>();
        
        addElements(ibuKota);
        displayElements(ibuKota);
        findElement(ibuKota,"Perancis");
    }
   
    static void addElements(HashMap<String,String> ibuKota){
        ibuKota.put("Indonesia", "Jakarta");
        ibuKota.put("Jepang", "Tokyo");
        ibuKota.put("Jerman", "Berlin");
        ibuKota.put("Perancis", "Paris");
    }
    
    static void displayElements(HashMap<String,String> ibuKota){
        for(HashMap.Entry<String,String> daerah : ibuKota.entrySet()){
            System.out.println("Negara: " + daerah.getKey()+ " - IbuKota: " + daerah.getValue());
        }
    }
    
    static void findElement(HashMap<String, String> ibuKota, String kota){
        if(ibuKota.containsKey(kota)){
            System.out.println("Ibu Kota: " + kota + " adalah " + ibuKota.get(kota));
        }
        else{
            System.out.println("Tidak ada " + kota + " dalam map");
        }
    }
}
