package Comparator;

import FirmInheritance.Firm;
import java.util.Comparator;

public class ComparatorFirmProfit implements Comparator<Firm> {

    @Override
    public int compare(Firm o1, Firm o2) {
        return (int)(o1.getProfit() - o2.getProfit());
        
    }
    
}