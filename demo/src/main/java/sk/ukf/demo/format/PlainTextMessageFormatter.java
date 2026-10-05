package sk.ukf.demo.format;

import org.springframework.stereotype.Component;

@Component("plainText")
public class PlainTextMessageFormatter implements MessageFormatter {
    @Override
    public String format(String message) {
        return message;
    }
}