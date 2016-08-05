package com.theironyard.charlotte;

/**
 * Created by guest on 8/4/16.
 */


public class Artist {
    String rhythm;
    String typicalTopics;
    int yearsInFlow;

    public Artist(String rhythm, String typicalTopics, int yearsInFlow) {
        this.rhythm = rhythm;
        this.typicalTopics = typicalTopics;
        this.yearsInFlow = yearsInFlow;
    }

    public String getRhythm() {
        return rhythm;
    }

    public void setRhythm(String rhythm) {
        this.rhythm = rhythm;
    }

    public String getTypicalTopics() {
        return typicalTopics;
    }

    public void setTypicalTopics(String typicalTopics) {
        this.typicalTopics = typicalTopics;
    }

    public int getYearsInFlow() {
        return yearsInFlow;
    }

    public void setYearsInFlow(int yearsInFlow) {
        if (yearsInFlow <= 0)

        {
            System.out.println("Sowwy! Artists must have at least one day of experience to be stored");
        } else if  (yearsInFlow > 1);
            this.yearsInFlow = yearsInFlow;
        }
    }
