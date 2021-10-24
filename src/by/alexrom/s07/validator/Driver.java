package by.alexrom.s07.validator;

public class Driver implements Validator<Driver> {
    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean isValid(Driver obj) {
        return obj.name != null && obj.age >= 18;
    }
}
