package task3;

public class Car {
    String brand;
    String model;
    int yearOfProduction;
    String fuelType;
    double speed;

    public Car(String brand, String model, int yearOfProduction, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.fuelType = fuelType;
        this.speed = 0;
    }

    void speed(int value) {
        this.speed = this.speed + value;
        System.out.println("Suretiniz : " + this.speed);
        checkSpeed();
    }

    void slow(int value) {
        this.speed = this.speed - value;
        System.out.println("Suretiniz : " + this.speed);
    }

    void stop() {
        this.speed = 0;
        System.out.println("Masin dayandi");
    }

    void checkSpeed() {
        if (this.speed > 120) {
            System.out.println("Yavaslayin! Suretiniz 120-den yuxari olmamalidir!");
        }
    }
}


