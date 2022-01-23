package by.alexrom.pavel.DZ17.p7.library.service;

import by.alexrom.pavel.DZ17.p7.library.model.EmailAddres;
import by.alexrom.pavel.DZ17.p7.library.model.Library;
import by.alexrom.pavel.DZ17.p7.library.model.Reader;

import java.util.ArrayList;
import java.util.List;

public class MessagingServiceImpl implements IMessagingService {

    private Library library = new Library();

    @Override
    public List<EmailAddres> getAllEmails() {
        List<EmailAddres> messagingList = new ArrayList<>();
        List<Reader> readers = library.getReaders();
        for(Reader reader : readers) {
            messagingList.add(reader.getEmail());
        }
        return messagingList;
    }

    @Override
    public List<EmailAddres> getEmailsWhoAgreeForMessaging() {
        List<EmailAddres> messagingList = new ArrayList<>();
        List<Reader> readers = library.getReaders();
        for(Reader reader : readers) {
            boolean agreementForMailing = reader.isAgreementForMailing();
            if(agreementForMailing) {
                EmailAddres email = reader.getEmail();
                messagingList.add(email);
            }
        }
        return messagingList;
    }

    private boolean hasOneOrMoreBooks() {
        List<Reader> readers = library.getReaders();
        for(Reader reader : readers) {
            boolean empty = reader.getBooksList().isEmpty();
            if(empty) {
                return true;
            }
        }
        return false;
    }
}

