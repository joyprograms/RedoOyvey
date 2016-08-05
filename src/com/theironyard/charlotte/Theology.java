package com.theironyard.charlotte;

/**
 * Created by guest on 8/4/16.
 */
public class Theology {
    String movementAssociated;
    int numberOfFollowersToday;
    boolean isTheologyPractical;

    public Theology(String movementAssociated, int numberOfFollowersToday, boolean isTheologyPractical) {
        this.movementAssociated = movementAssociated;
        this.numberOfFollowersToday = numberOfFollowersToday;
        this.isTheologyPractical = isTheologyPractical;
    }

    public String getMovementAssociated() {
        return movementAssociated;
    }

    public void setMovementAssociated(String movementAssociated) {
        this.movementAssociated = movementAssociated;
    }

    public int getNumberOfFollowersToday() {
        return numberOfFollowersToday;
    }

    public void setNumberOfFollowersToday(int numberOfFollowersToday) {
        this.numberOfFollowersToday = numberOfFollowersToday;
    }

    public boolean isTheologyPractical() {
        return isTheologyPractical;
    }

    public void setTheologyPractical(boolean theologyPractical) {
        isTheologyPractical = theologyPractical;
    }
}
