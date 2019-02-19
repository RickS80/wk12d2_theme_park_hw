package Attractions;

import Interfaces.ISecurity;
import Visitor.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name){
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        boolean result = false;
        if (visitor.getAge() < 15) {
            result = true;
        }
        return result;
    }



}
