package task3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2008, "Gasoline");

        car.speed(100);
        car.speed(20);
        car.speed(2);
        car.slow(50);
        car.speed(100);
        car.stop();
        car.speed(60);
    }
}
