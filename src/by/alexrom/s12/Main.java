package by.alexrom.s12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        User user = new User();
        user.setAge(19);
        user.setPhoneNumber(1);
        user.setFirstName(null);
        user.setAddress(Arrays.asList("Lenina 50", "Ctalina 10"));
        Validator validator = new Validator();
        System.out.println(validator.validate(user));
    }
}
