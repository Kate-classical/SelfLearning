package by.alexrom.s11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;

public class User {

    String firstname;
    String lastname;

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("firstname='" + firstname + "'")
                .add("lastname='" + lastname + "'")
                .toString();
    }

    public static void main(String[] args) {

        User user1= new User("tolik", "feduk");
        User user2= new User("tolik", "actronavt");
        User user3= new User("nikita", "korol");

        List <User> listOfUsers = new ArrayList();
        listOfUsers.add(user1);
        listOfUsers.add(user2);
        listOfUsers.add(user3);


    }
}

//class UserComparator implements Comparator<User> {
//
//    @Override
//    public int compare(User o1, User o2) {
//        int res = o1.firstname.compareTo(o2.firstname);
//        if(res == 0) {
//            res = o1.lastname.compareTo(o2.lastname);
//        }
//        return res;
//    }
//}

