package Attractions;

import Interfaces.IReviewed;

public abstract class Attraction implements IReviewed {

    private String name;
    int rating;

    public Attraction(String name){
        this.name = name;
        int rating = 0;
    }

    public String getName() {
        return name;
    }

    public int getRating(){
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }
}
