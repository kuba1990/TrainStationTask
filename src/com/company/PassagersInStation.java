package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PassagersInStation {

    public Map<Integer, Integer> station = new HashMap<>();

    //find value above number of available places 
    public int checkAvailablePlaces() {
        int maxValueInMap = (Collections.max(station.values()));  // This will return max value in the Hashmap
        for (Map.Entry<Integer, Integer> entry : station.entrySet()) {  // Itrate through hashmap
            if (entry.getValue() == maxValueInMap) {

            }
        }
        return maxValueInMap;
    }
    //create Road
    public void TrainRoad(int stationNumber) {
        for (int a = 0; a <= stationNumber; a++) {
            station.put(a, 0);
        }
    }
    //Train run
    public void placesMap(int startStationNumber, int endStationNumber, int passagersNumber) {
        for (int a = startStationNumber; a <= endStationNumber; a++) {
            station.put(a, station.get(a) + passagersNumber);

        }
    }

}
