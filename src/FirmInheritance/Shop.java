package FirmInheritance;

import java.io.Serializable;

public class Shop extends Firm implements Serializable{
    
    private static int shopCnt = 0;
    private double area;
    private String type;
    private String workingHours; //10.00-12.00
    private double inventoryCost;

    public Shop(String id, String name, String telephone, String grossSales, String area, String type, String workingHours, String inventoryCost)
    {
        super(id, name, telephone, grossSales); 
        this.area = Double.parseDouble(area);
        this.type = type;
        this.workingHours = workingHours;
        this.inventoryCost = Double.parseDouble(inventoryCost);
        shopCnt++;
    }
    
     public static int getShopCount(){
        return shopCnt;
    }

    @Override
    public String toString() {
        return "\nShop: " + super.toString() + "\nArea=" + area + "\nType=" + type 
                + "\nWorkingHours=" + workingHours + "\nInventory=" + inventoryCost ;
    }

    @Override
    public void calcRent() {
        if(type.equalsIgnoreCase("BookStore"))
            rent = 500;
        else if(type.equalsIgnoreCase("ConvenientStore"))
            rent = 300;
        else if(type.equalsIgnoreCase("Pharmacy"))
            rent = 600;
        else if(type.equalsIgnoreCase("RetailStore"))
            rent = 800;
        else if(type.equalsIgnoreCase("TechnologyStore"))
            rent = 900;
        else
            rent = 400;
        
        rent += area * 10;
        
        String[] wH = workingHours.split("-");
        double wh1 = Double.parseDouble(wH[0]);
        double wh2 = Double.parseDouble(wH[1]);
        
        rent *= (wh2 - wh1)/10 + 0.5;
    }

    @Override
    public double calcProfit() {
        cost = inventoryCost + rent;
        profit = grossSales - cost;
        return profit;
    }
}
