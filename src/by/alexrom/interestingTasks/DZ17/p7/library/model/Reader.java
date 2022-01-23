package by.alexrom.pavel.DZ17.p7.library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Reader {

    private String firstName;
    private String lastName;
    private EmailAddres email;
    private boolean agreementForMailing;
    private List<Book> booksList = new ArrayList<>();

    public Reader() {
    }

    public Reader(String firstName, String lastName, EmailAddres email, boolean agreementForMailing) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.agreementForMailing = agreementForMailing;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public EmailAddres getEmail() {
        return email;
    }

    public boolean isAgreementForMailing() {
        return agreementForMailing;
    }

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Reader.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("email='" + email + "'")
                .add("agreementForMailing=" + agreementForMailing)
                .add("booksList=" + booksList)
                .toString();
    }
}
