package by.alexrom.pavel.DZ17.p7.library.service;

import by.alexrom.pavel.DZ17.p7.library.model.Book;

import java.util.List;

public interface ILibraryBookService {

    void init(Book book);
    void addBook(Book book);
    List<Book> getBooksSortedByYear(List<Book> books);
    List<Book> getBooks();
}
