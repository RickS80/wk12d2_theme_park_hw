package Attractions;

import Interfaces.ITicketed;
import Visitor.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name){
        super(name);
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double defaultPrice = 4.50;
        if (visitor.getAge() <= 12){
            defaultPrice = 2.25;
        };
        return defaultPrice;
    }


}
