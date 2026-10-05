package sk.ukf.demo.format;

import org.springframework.stereotype.Component;

@Component("upperCase")
public class UpperCaseMessageFormatter implements MessageFormatter {
    @Override
    public String format(String message) {
        return message.toUpperCase();
    }
}