package Attractions;

import Interfaces.ISecurity;
import Visitor.Visitor;

public class RollerCoaster extends Attraction implements ISecurity {

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



}
