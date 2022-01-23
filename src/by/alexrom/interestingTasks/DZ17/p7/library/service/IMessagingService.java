package by.alexrom.pavel.DZ17.p7.library.service;

import by.alexrom.pavel.DZ17.p7.library.model.EmailAddres;

import java.util.List;

public interface IMessagingService {

    List<EmailAddres> getAllEmails();
    List<EmailAddres> getEmailsWhoAgreeForMessaging();

}
