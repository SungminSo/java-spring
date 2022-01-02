package ch19;

public class Car {
    private static int carNum = 1000;

    private int carId;

    public Car() {
        carNum++;
        carId = carNum;
    }

    public int getCarNum() {
        return carId;
    }
}
