public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 580000.99;
    boolean isRunning=false;

    void start(){
        isRunning=true;
        System.out.println("You start the engine.");
    }

    void stop(){
        isRunning=false;
        System.out.println("You stop the engine.");
    }
    void drive(){
        isRunning=true;
        System.out.println("You drive the "+ model);
    }
    void brake(){
        isRunning=false;
        System.out.println("You brake the "+ model);
    }
}
