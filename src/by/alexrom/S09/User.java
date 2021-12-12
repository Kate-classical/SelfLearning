package by.alexrom.S09;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class User implements Externalizable {

    private String firstname;
    private String lastname;

    public User() {
    }

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(getFirstname());
        out.writeObject(getLastname());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstname = (String) in.readObject();
        lastname = (String) in.readObject();
    }

    public static void main(String[] args) {

        User user = new User("Tolik", "Petrov");

        try(FileOutputStream fileWriter = new FileOutputStream("E:\\Downloads\\Java Torrent\\Jborn\\JBorn_08\\Java Core\\9 Ввод-Вывод\\TaskUser.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fileWriter)) {
                oos.writeObject(user);
        } catch(IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fileRead = new FileInputStream("E:\\Downloads\\Java Torrent\\Jborn\\JBorn_08\\Java Core\\9 Ввод-Вывод\\TaskUser.txt");
            ObjectInputStream ois = new ObjectInputStream(fileRead)) {
            ois.readObject();

        } catch(IOException |ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
