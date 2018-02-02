package com.company;

public class Main {

    public static void main(String[] args) {
        SystemOutput systemOutput = new SystemOutput();
        PassagersInStation pIS = new PassagersInStation();
        InputData inputData = new InputData();

        int a[]= inputData.a;
        int numberOfPlaces = inputData.numberOfPlaces;
        int numberOfRequest = inputData.numberOfRequest;
        int stationQuantity = inputData.stationQuantity;

        pIS.TrainRoad(stationQuantity);

        for (int z = 1; z <= numberOfRequest; z++) {
            pIS.placesMap(a[3 * z], a[(3 * z) + 1], a[(3 * z) + 2]);
            System.out.println(pIS.station);
            if (pIS.checkAvailablePlaces() <= numberOfPlaces)
            systemOutput.systemAnswer.add("yes");
            else systemOutput.systemAnswer.add("no");
        }
        //checking:
        for (int x = 0; x <= numberOfRequest - 1; x++) {
            System.out.println(systemOutput.systemAnswer.get(x));
        }
    }
}