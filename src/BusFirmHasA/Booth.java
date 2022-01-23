package BusFirmHasA;

import Interface.FirmInterface;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Booth implements FirmInterface, Serializable{
    private int id;
    private Map<String, Double> tickets = new HashMap<String, Double>();

    public Booth(String id, HashMap<String, Double> tickets) {
        this.id = Integer.parseInt(id);
        this.tickets = tickets;
    }

    @Override
    public double calcTotalTicketPrice() {
        double sum = 0;
        for (Map.Entry<String,Double> entry : tickets.entrySet())
                sum += entry.getValue();
        return sum;
    }

    @Override
    public String toString() {
        Set<String> keys = tickets.keySet();
        String out = "";
        for (String key : keys) {
            out += key + ":" + tickets.get(key) + "\n";
        }
        return "\nBooth: " + "\nid=" + id + "\n\ttickets=" + out + '\n';
    }       
            
}