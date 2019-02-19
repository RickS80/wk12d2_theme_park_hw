package Stalls;

import Interfaces.ISecurity;
import Visitor.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        boolean result = false;
        if(visitor.getAge() >= 18){
        result = true;}
        return result;
    }


    @Override
    public double defaultPrice() {
        return 6.6;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 6.6;
    }
}
