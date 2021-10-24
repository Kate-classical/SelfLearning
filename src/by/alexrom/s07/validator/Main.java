package by.alexrom.s07.validator;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1.6, 2020, null);
        System.out.println(car.isValid(car));

        Driver driver = new Driver("tolik", 18);
        System.out.println(driver.isValid(driver));
    }
}
