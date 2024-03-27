package OOPS_JAVA;

public class Main_Car {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        // car.acc();
        // car.brake();
        // car.stop();
        Media carmedia = new Car();
        carmedia.stop();
        NiceCar car1 = new NiceCar();
        car1.start();
        car1.startmusic();
        car1.stop();
        car1.upgradeEngine();
        car1.start();
    }

}
