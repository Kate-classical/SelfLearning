package by.alexrom.pavel.DZ17.p7.library.service;

import by.alexrom.pavel.DZ17.p7.library.model.Book;
import by.alexrom.pavel.DZ17.p7.library.model.Library;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryBookServiceImpl implements ILibraryBookService {
    private Library library = new Library();

    public LibraryBookServiceImpl(Library library) {
        this.library = library;
    }

    @Override
    public void addBook(Book book) {
        library.getBooks().add(book);
    }

    @Override
    public List<Book> getBooksSortedByYear(List<Book> books) {
        List<Book> bookListSortedByYear = library.getBooks();
        return bookListSortedByYear.stream()
                .sorted(Comparator.comparingInt(Book::getProductionYear))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getBooks() {
        return library.getBooks();
    }
}
