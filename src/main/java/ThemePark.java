import Attractions.Attraction;
import Interfaces.IReviewed;
import Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviews;

    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public int getNumberOfAttractions() {
        return this.attractions.size();
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public int getNumbersOfStalls(){
       return this.stalls.size();
    }

    public void addReview(IReviewed review){
        this.reviews.add(review);
    }

    public int getNumberOfReviews(){
        return this.reviews.size();
    }



}
