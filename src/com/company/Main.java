package com.company;

import java.util.*;

public class Main {

    private List<String> systemAnswer;
    private Map<Integer, Integer> station = new HashMap<>();

    public static void main(String[] args) {
        LinkedList<String> systemAnswer = new LinkedList();
        Map<Integer, Integer> station;

        Main main = new Main();

        int a[] = {
                4, 6, 4,
                1, 4, 2,
                1, 3, 2,
                2, 4, 3,
                1, 2, 3};

        int stationQuantity = a[0]; //4
        int numberOfPlaces = a[1]; //6
        int numberOfRequest = a[2]; //4

        main.TrainRoad(stationQuantity);

        for (int z = 1; z <= numberOfRequest; z++) {
            main.placesMap(a[3 * z], a[(3 * z) + 1], a[(3 * z) + 2]);
            System.out.println(main.station);
            if (main.createOutputSystem() <= numberOfPlaces)
                systemAnswer.add("yes");
            else systemAnswer.add("no");
        }
        //checking:
        for (int x = 0; x <= numberOfRequest - 1; x++) {
            System.out.println(systemAnswer.get(x));
        }
    }

    private int createOutputSystem() {
        int maxValueInMap = (Collections.max(station.values()));  // This will return max value in the Hashmap
        for (Map.Entry<Integer, Integer> entry : station.entrySet()) {  // Itrate through hashmap
            if (entry.getValue() == maxValueInMap) {

            }
        }
        System.out.println("MAX VALUE" + maxValueInMap);
        return maxValueInMap;
    }

    //create Road
    private void TrainRoad(int stationNumber) {
        for (int a = 0; a <= stationNumber; a++) {
            station.put(a, 0);
        }
    }
    //Train run
    private void placesMap(int startStationNumber, int endStationNumber, int passagersNumber) {
        for (int a = startStationNumber; a <= endStationNumber; a++) {
            station.put(a, station.get(a) + passagersNumber);

        }
    }
   private List<String> systemAnswer(String answer) {
        return systemAnswer;
    }
}