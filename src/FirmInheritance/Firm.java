package FirmInheritance;

import java.io.Serializable;

public abstract class Firm implements Comparable<Firm>, Serializable{  
    protected int id;  
    protected String name;
    protected String telephone;
    protected double grossSales;
    protected double rent;
    protected double cost;
    protected double profit;

    public Firm(String id, String name, String telephone, String grossSales) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.telephone = telephone;
        this.grossSales = Double.parseDouble(grossSales);
        
    }
    
    public Firm(String id, String name, String telephone) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.telephone = telephone;
    }

    public double getProfit() {
        return profit;
    }

    public int getId() { 
        return id;
    }

    
    public abstract void calcRent();
    public abstract double calcProfit();
    
    @Override
    public String toString() {
        return "Id=" + id + 
                "\nName=" + name + 
                "\nTelephone=" + telephone + 
                "\nGross Sales=" + grossSales + 
                "\nRent=" + rent + 
                "\nCost=" + cost + "\n";
    }
    
    
    @Override
    public int compareTo(Firm f) {
        return id - f.getId();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Firm other = (Firm) obj;
        return this.id == other.id;
    }
    
}
