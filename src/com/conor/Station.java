package com.conor;

/**
 * Created by conor on 3/24/16.
 */
public class Station implements Comparable<Station> {

    private String name;
    private double frequency;

    public Station(String name, double frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String toString() {
        return String.format("Name: %s, frequency %.1f FM", name, frequency);
    }

    //a negative integer, zero,
    // or a positive integer  as this object is less than the other objects,
    // equal to, or greater than the specified object.

    public int compareTo(Station otherStation) {
        if(this.frequency < otherStation.frequency) {
            return -1;
        }

        // But, if this object is 'less than' s,
        // and it should come before it in a list when sorted,
        // then return -1
        else if (this.frequency < otherStation.frequency) {
            return -1;
        }

        // If the two are equal, return 0.
        else {
            return 0;
        }
    }

}
