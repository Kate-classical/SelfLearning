package by.alexrom.pavel.DZ17.p7.library.service;

import by.alexrom.pavel.DZ17.p7.library.model.Book;
import by.alexrom.pavel.DZ17.p7.library.model.Reader;

import java.util.List;

public interface ILibraryReaderService {

    void addReader(Reader reader);

    List<Reader> getReaders();

    void takeBook(Book book, Reader reader);

    void returnBook(Book book, Reader reader);
}
