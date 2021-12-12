package by.alexrom.pavel.DZ17.p7.library.service;

import by.alexrom.pavel.DZ17.p7.library.model.Book;
import by.alexrom.pavel.DZ17.p7.library.model.Library;
import by.alexrom.pavel.DZ17.p7.library.model.Reader;
import java.util.List;

public class LibraryReaderServiceImpl implements ILibraryReaderService {


    private Library library = new Library();
    private Reader reader = new Reader();

    public LibraryReaderServiceImpl(Library library) {
        this.library = library;
    }

    @Override
    public void addReader(Reader reader) {
        library.getReaders().add(reader);
    }

    @Override
    public List<Reader> getReaders() {
        return library.getReaders();
    }


    @Override
    public void takeBook(Book book, Reader reader) {
        boolean contains = library.getBooks().contains(book);
        if(contains) {
            reader.getBooksList().add(book);
            library.getBooks().remove(book);
        } else {
            System.out.println("We don't have this book");
        }
    }

    @Override
    public void returnBook(Book book, Reader reader) {
        boolean contains = reader.getBooksList().contains(book);
        if(contains) {
            library.getBooks().add(book);
            reader.getBooksList().remove(book);
        }
    }
}
