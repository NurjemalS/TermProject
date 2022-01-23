package FirmInheritance;

import java.io.Serializable;

public class Restaurant extends Firm implements Serializable{
    
    private static int restaurantCnt = 0;
    private int numOfSeats;
    private boolean isChimneyNeeded;
    private double rawFoodCost;

    public Restaurant(String id, String name, String telephone, String grossSales, String numOfSeats, 
            String isChimneyNeeded, String rawFoodCost) {
        super(id, name, telephone, grossSales);
        this.numOfSeats = Integer.parseInt(numOfSeats);
        this.rawFoodCost = Double.parseDouble(rawFoodCost);
        restaurantCnt++;
        if(isChimneyNeeded.equalsIgnoreCase("true"))
           this.isChimneyNeeded = true;
        else
            this.isChimneyNeeded = false;
    }

     public static int getRestCount(){
        return restaurantCnt;
    }
     
    @Override
    public String toString() {
        return "Restaurant\n" + super.toString()+
                "\nNumber Of Seats=" + numOfSeats + 
                "\nIs Chimney Needed=" + isChimneyNeeded + 
                "\nRaw Food Cost=" + rawFoodCost + "\n";
    }

    @Override
    public void calcRent() {
        if(isChimneyNeeded)
            rent = numOfSeats * 500;
        else
            rent = numOfSeats * 300;
    }
    
    @Override
    public double calcProfit() {
        cost = rawFoodCost + rent;
        profit = grossSales - cost;
        return profit;
    }
}
