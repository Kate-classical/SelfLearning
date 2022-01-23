package by.alexrom.pavel.DZ17.p7;

import by.alexrom.pavel.DZ17.p7.library.model.Book;
import by.alexrom.pavel.DZ17.p7.library.model.EmailAddres;
import by.alexrom.pavel.DZ17.p7.library.model.Library;
import by.alexrom.pavel.DZ17.p7.library.model.Reader;
import by.alexrom.pavel.DZ17.p7.library.service.ILibraryBookService;
import by.alexrom.pavel.DZ17.p7.library.service.ILibraryReaderService;
import by.alexrom.pavel.DZ17.p7.library.service.LibraryBookServiceImpl;
import by.alexrom.pavel.DZ17.p7.library.service.LibraryManager;
import by.alexrom.pavel.DZ17.p7.library.service.LibraryReaderServiceImpl;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        LibraryManager libraryManager= new LibraryManager();
        ILibraryBookService libraryBooksService = new LibraryBookServiceImpl(library);
        ILibraryReaderService libraryReaderService = new LibraryReaderServiceImpl(library);

        Book book1 = new Book("Jack London", "A Daughter of the Snows", 1902);
        Book book2 = new Book("Paulo Coelho", "O Alquimista", 1988);
        Book book3 = new Book("Arthur Conan Doyle", "The Coming of the Fairies", 1921);
        Book book4 = new Book("Antoine de Saint-Exupéry", "Le petit prince", 1943);

        Reader reader1 = new Reader("Tolik", "Ebolik",
                new EmailAddres("wdfsdg@mail.ru"), true);

        Reader reader2 = new Reader("Elma", "SodakaSytylay",
                new EmailAddres("dog@mail.ru"), true);



        libraryBooksService.addBook(book1);
        libraryBooksService.addBook(book2);
        libraryBooksService.addBook(book3);

        libraryReaderService.addReader(reader1);
        libraryReaderService.addReader(reader2);

        System.out.println(libraryBooksService.getBooks());
        libraryReaderService.takeBook(book1,reader1);
        System.out.println(library.getBooks());
        System.out.println(reader1.getBooksList());
        //        System.out.println(libraryBooksService.getBooksSortedByYear(libraryBooksService.getBooks()));


    }
}


