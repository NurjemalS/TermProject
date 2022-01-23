package SystemAndMain;

import FirmInheritance.Firm;
import FirmInheritance.Restaurant;
import FirmInheritance.BusFirm;
import FirmInheritance.Shop;
import Comparator.ComparatorFirmProfit;
import BusFirmHasA.Booth;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FirmSys {
   
    private static HashSet<Firm> firmSet = new  HashSet<>();
    private static TreeSet<Firm> firmSetSortedId = new TreeSet<>(); //default Sort
    private static TreeSet<Firm> firmSetSortedProfit = new TreeSet<>(new ComparatorFirmProfit()); 

    public static boolean addFirm(String firmType, String id, String name,  
        String telephone, String grossSales, String numOfSeats,
        String isChimneyNeeded, String rawFoodCost, 
        String area, String type, String workingHours, 
        String inventoryCost, String busFuelCost, ArrayList<Booth> booths){
        BusFirm bf;
        Shop sp;
        Restaurant rst;
        
        for(Firm f: firmSet)
            if(f.getId() == Integer.parseInt(id))
                return false;
        
        if(firmType.equalsIgnoreCase("BusFirm"))
        {
            //String id, String name, String telephone, ArrayList<Booth> booths
            bf = new BusFirm(id, name, telephone, busFuelCost,  booths);
            firmSet.add(bf);
            bf.calcGrossSales();
            bf.calcRent();
            bf.calcProfit();
        }
        else if(firmType.equalsIgnoreCase("Shop"))
        {
            sp = new Shop(id, name, telephone, grossSales, area, type, workingHours, inventoryCost);
            sp.calcRent();
            sp.calcProfit();
            firmSet.add(sp);
        }
        else if(firmType.equalsIgnoreCase("Restaurant"))
        {
            rst = new Restaurant(id, name, telephone, grossSales, numOfSeats, isChimneyNeeded, rawFoodCost);
            rst.calcRent();
            rst.calcProfit();
            firmSet.add(rst);
        }
        
        
        return true;  
    }
    
	
    public static Firm removeFirm(int id){ 
        
        for(Firm f: firmSet)
            if(f.getId() == id){
                firmSet.remove(f);
                return f;
            }
        return null;
    }
    
    public static Firm searchFirm(int id){  
        
        for(Firm f: firmSet)
            if(f.getId() == id){
                return f;
            }
        return null;
    }
    
    public static String calcAllProfit(){
        double calc = 0;
       for(Firm f: firmSet){
           calc += f.calcProfit();
       }
       return calc + "";
    } 
    
    public static void writeToFile(){ 
        File file = new File("firms.bin");
        try {
            if(file.exists()){
                file.delete();
                file = new File("firms.bin");
            }
            ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(file));
            ob.writeObject(firmSet);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FirmSys.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FirmSys.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public static boolean readFromFile() { 
           ObjectInputStream ob = null;
        try {
           
            File file = new File("firms.bin");
            ob = new ObjectInputStream(new FileInputStream(file));
            firmSet = (HashSet<Firm>)ob.readObject();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FirmSys.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(FirmSys.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FirmSys.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                ob.close();
            } catch (IOException ex) {
                Logger.getLogger(FirmSys.class.getName()).log(Level.SEVERE, null, ex);
            } 
            return true;
        }
    }

    public static HashSet<Firm> getFirmSet() {
        return firmSet;
    }

    public static void setFirmSet(HashSet<Firm> firmSet) {
        FirmSys.firmSet = firmSet;
    }
    
    
    
    public static String displayAllFirmsById(){  
        String output = "";
        firmSetSortedId.addAll(firmSet);
         for(Firm f: firmSetSortedId){
             output += f.toString() +"\n";
         }
        return output;
    }
     
    public static String displayAllFirmsByProfit(){ 
        String output = "";
        firmSetSortedProfit.addAll(firmSet);
        
         for(Firm f: firmSetSortedProfit){
             output += f.toString() +"\n";
         }
        return output;
    }
      
 

    
    
}
