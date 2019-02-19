package Attractions;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Visitor.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name){
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        boolean result = false;
        if(visitor.getHeight() >= 145 && visitor.getAge() >= 12) {
            result = true;
        }
        return result;
    }


    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double defaultPrice = 8.40;
        if (visitor.getHeight() > 200){
            defaultPrice = 16.80;
        };
        return defaultPrice;
    }

}
