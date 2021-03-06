package Stalls;

import Interfaces.IReviewed;
import Interfaces.ITicketed;

public abstract class Stall implements IReviewed, ITicketed {

    private String name;
    private String ownerName;
    private int parkingSpot;
    int rating;

    public Stall(String name, String ownerName, int parkingSpot){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(int parkingSpot) {
        this.parkingSpot = parkingSpot;
    }


}
