package com.conor;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Station kfai = new Station("KFAI", 89.3);
        Station radioK = new Station("RADIOK", 770);
        Station kqrs = new Station("KQRS", 92.5);

        ArrayList<Station> stations = new ArrayList<Station>();

        stations.add(kfai);
        stations.add(radioK);
        stations.add(kqrs);

        Collections.sort(stations);

        System.out.println("All radio stations, in ascending frequency order");
        System.out.println(stations);
    }
}
