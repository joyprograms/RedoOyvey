package com.theironyard.charlotte;

/**
 * Created by guest on 8/4/16.
 */
public class Home {
    String neighborhood;
    int ageOfHome;
    boolean occupied;

    public String getNeighborhood() {
        return neighborhood;
    }

    public Home(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getAgeOfHome() {
        return ageOfHome;
    }

    public Home(int ageOfHome) {
        this.ageOfHome = ageOfHome;
    }

    public void setAgeOfHome(int ageOfHome) {
        this.ageOfHome = ageOfHome;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public Home(boolean occupied) {
        this.occupied = occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
