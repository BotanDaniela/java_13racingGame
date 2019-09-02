package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;



        // this is a one-line comment
        Car car = new Car(engine);
        car.name = "Dacia";
        car.fuelLevel = 60;
        car.mileage = 8.5;
        car.doorCount = 5;
        car.maxSpeed = 180;
        car.fuelType = "Gasoline";


        System.out.println(car.name);
        System.out.println(car.running);
        System.out.println(car.traveledDistance);
        System.out.println(car.engine);

        car.accelerate(60, 1);

        Engine engine2 = new Engine();
        engine2.manufacturer = "VW";
        engine2.capacity = 1600;

        Car car2 = new Car(engine2);
        car2.name = "Golf";
        car.fuelLevel = 70;
        car.doorCount = 2;
        car.maxSpeed = 190;
        car.fuelType = "Benzina";
        car.mileage = 9.5;

        car.name = "Skoda";
//        car.name = null;

       // concatenation
        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car1 name: " + car.name);

        car = car2;







    }
}
