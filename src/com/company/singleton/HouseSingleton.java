package src.com.company.singleton;

import src.com.company.builder.House;

public class HouseSingleton {
    private static House house;

    private HouseSingleton() {
        house = House.newBuilder().build();
        // this.house = House.newBuilder().build();
    }

    public static House getMyHouse() {
        if (house == null) {
            System.out.println("Esta es mi primer casa");
            house = House.newBuilder().build(); // new House
        }

        return house;
    }
}
