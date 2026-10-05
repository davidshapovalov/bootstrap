package sk.ukf.demo.format;

import org.springframework.stereotype.Component;

@Component("html")
public class HtmlMessageFormatter implements MessageFormatter {

    @Override
    public String format(String message) {
        return "<html><body><h1>" + message + "</h1></body></html>";
    }
}