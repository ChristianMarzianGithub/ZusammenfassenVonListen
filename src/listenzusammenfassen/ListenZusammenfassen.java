/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listenzusammenfassen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Christian
 */
public class ListenZusammenfassen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] herelisteFarben  = {"blau", "gelb", "grün", "schwarz", "pink"};
        List hereListeFarbenList = Arrays.asList(herelisteFarben);
                
        int [] listeNummern     = {1,2,3,4,5,6,7,8};
        List listeNummernList = Arrays.asList(listeNummern);
        
        String [] listeMaterialien = {"Beton", "Holz", "Stein"};
        List listeMaterialenList = Arrays.asList(listeMaterialien);
        
        String [] listeNamen       = {"Susi", "Klara", "Claire", "Moni"};
        List listeNamenList = Arrays.asList(listeNamen);
        
        
        ArrayList<Datensatz>listeKombinationen = new ArrayList<Datensatz>();        
        fuegeDatensatzhinzu(listeKombinationen);
        
        
        
        
    }   
    private static void fuegeDatensatzhinzu(ArrayList<Datensatz> KombinationenListe){
        Datensatz ds = generiereDatensatz();
        if(!DatensatzSchonVorhanden(ds,KombinationenListe)){
            KombinationenListe.add(ds);
        }else{
            fuegeDatensatzhinzu(KombinationenListe);
        }
    }
    private static Datensatz generiereDatensatz(){
        Datensatz x = new Datensatz();
        return x;
    }
    private static boolean DatensatzSchonVorhanden(Datensatz datensatz, ArrayList<Datensatz> liste){
        boolean datensatzSchonvorhanden = false;
        return datensatzSchonvorhanden;
    }
    
    
    
    
}
