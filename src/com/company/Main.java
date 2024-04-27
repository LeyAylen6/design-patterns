package src.com.company;

import src.com.company.builder.House;
import src.com.company.singleton.HouseSingleton;

import static src.com.company.builder.House.newBuilder;

public class Main {
    public static void main(String[] args) {
        House.Builder newHouse = newBuilder()
                .withTecho("Soy un techo")
                .withPared("SOY UNA PARED");
        newHouse.withPileta("SOY UNA Pileta");

        House newHouse2 = newBuilder()
                .withTecho("Soy un techo")
                .withPared("SOY UNA PARED")
                .withPileta("SOY UNA Pileta")
                .build();
        House myHouse = newHouse.build();

        System.out.println(myHouse.getPared());
        System.out.println(myHouse);
        System.out.println(newHouse2);

        HouseSingleton.getMyHouse();
        System.out.println("MI CASA 1: " + HouseSingleton.getMyHouse()); // comentar el toString() para ver direccion de memoria
        System.out.println("MI CASA 2: " + HouseSingleton.getMyHouse());
        System.out.println("MI CASA 3: " + HouseSingleton.getMyHouse());
        System.out.println("MI CASA 4: " + HouseSingleton.getMyHouse());
    }
}