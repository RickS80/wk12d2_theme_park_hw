package Stalls;

import Visitor.Visitor;

public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    @Override
    public double defaultPrice() {
        return 2.8;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 2.8;
    }
}
