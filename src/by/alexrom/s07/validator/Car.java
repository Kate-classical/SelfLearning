package by.alexrom.s07.validator;

public class Car implements Validator<Car>{
    private double engene;
    private int yearOfProduction;
    private String color;

    public Car(double engene, int yearOfProduction, String color) {
        this.engene = engene;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
    }

    boolean hasEngene (double engene){
        return this.engene == engene;
    }


    @Override
    public boolean isValid(Car obj) {
        return obj.hasEngene(engene) && obj.color!=null&& obj.yearOfProduction==yearOfProduction;
    }
}
