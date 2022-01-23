package by.alexrom.pavel.DZ17.p7.library.service;

import by.alexrom.pavel.DZ17.p7.library.model.Book;
import by.alexrom.pavel.DZ17.p7.library.model.EmailAddres;
import by.alexrom.pavel.DZ17.p7.library.model.Library;
import by.alexrom.pavel.DZ17.p7.library.model.Reader;

import java.util.List;

public class LibraryManager implements IMessagingService, ILibraryReaderService, ILibraryBookService {

    private LibraryBookServiceImpl libraryBookService;
    private LibraryReaderServiceImpl libraryReaderService;
    private MessagingServiceImpl messagingService;

    //    public LibraryManager(LibraryBookServiceImpl libraryBookService,
    //            LibraryReaderServiceImpl libraryReaderService,
    //            MessagingServiceImpl messagingService) {
    //        this.libraryBookService = libraryBookService;
    //        this.libraryReaderService = libraryReaderService;
    //        this.messagingService = messagingService;
    //    }

    public LibraryManager() {
//        libraryBookService = new LibraryBookServiceImpl();
//        libraryReaderService = new LibraryReaderServiceImpl();
        messagingService = new MessagingServiceImpl();
    }

    @Override
    public void addBook(Book book) {
        libraryBookService.addBook(book);
    }

    @Override
    public List<Book> getBooksSortedByYear(List<Book> books) {
        return libraryBookService.getBooksSortedByYear(books);
    }

    @Override
    public List<Book> getBooks() {
        return libraryBookService.getBooks();
    }

    @Override
    public void addReader(Reader reader) {
        libraryReaderService.addReader(reader);
    }

    @Override
    public List<Reader> getReaders() {
        return libraryReaderService.getReaders();
    }

    @Override
    public void takeBook(Book book, Reader reader) {
        libraryReaderService.takeBook(book, reader);
    }

    @Override
    public void returnBook(Book book, Reader reader) {
        libraryReaderService.returnBook(book, reader);
    }

    @Override
    public List<EmailAddres> getAllEmails() {
        return messagingService.getAllEmails();
    }

    @Override
    public List<EmailAddres> getEmailsWhoAgreeForMessaging() {
        return messagingService.getEmailsWhoAgreeForMessaging();
    }
}
