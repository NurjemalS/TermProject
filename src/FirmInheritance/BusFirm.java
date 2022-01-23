package FirmInheritance;

import BusFirmHasA.Booth;
import java.io.Serializable;
import java.util.ArrayList;

public class BusFirm extends Firm implements Serializable {
    
    private static int busFirmCnt = 0;
    private ArrayList<Booth> booths = new ArrayList<>();
    private double busFuelCost;

    public BusFirm(String id, String name, String telephone, String busFuelCost, ArrayList<Booth> booths) {
        super(id, name, telephone);  
        this.busFuelCost = Double.parseDouble(busFuelCost);
        this.booths = booths;
        busFirmCnt++;
    }

    public void setBooths(ArrayList<Booth> booths) {
        this.booths = booths;
    }
    
    public static int getBusFirmCount(){
        return busFirmCnt;
    }

    @Override
    public String toString() {
        
        String output = "";
        for (int i=0; i < booths.size(); i++) {
           output += booths.get(i).toString() + "\n";
        }
        return "\nBusFirm: " + super.toString() + "\nbusFuelCost=" + busFuelCost + output;
                
    }
    
    public  String calcGrossSales(){
        double sum = 0;
        for(int i=0; i < booths.size(); i++)
            sum += booths.get(i).calcTotalTicketPrice();
        grossSales = sum;
        return sum + "";
    }

    @Override
    public void calcRent() {
        rent = booths.size() * 100;
    }

    @Override
    public double calcProfit() {
        cost = busFuelCost + rent;
        profit = grossSales - cost;
        return profit;
    }
}
