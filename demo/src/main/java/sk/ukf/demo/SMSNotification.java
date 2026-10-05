package sk.ukf.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sk.ukf.demo.format.MessageFormatter;

@Component("smsNotification")
public class SMSNotification implements NotificationService {

    private final MessageFormatter messageFormatter;

    public SMSNotification(@Qualifier("plainText") MessageFormatter messageFormatter) {
        this.messageFormatter = messageFormatter;
    }

    @Override
    public String send(String message) {
        return "SMS notifikácia: " + messageFormatter.format(message);
    }
}