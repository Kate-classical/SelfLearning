package by.alexrom.pavel.DZ17.p7.library.model;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Reader> readers = new ArrayList<>();
    private List<Book> books = new ArrayList<>();

    public List<Reader> getReaders() {
        return readers;
    }

    public List<Book> getBooks() {
        return books;
    }

//    public void setReaders(List<Reader> readers) {
//        this.readers = readers;
//    }
//
//    public void setBooks(List<Book> books) {
//        this.books = books;
//    }
}
