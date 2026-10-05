package sk.ukf.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MojController {

    private final NotificationService emailNotification;
    private final NotificationService smsNotification;
    private final NotificationService pushNotification;

    @Autowired
    public MojController(
            @Qualifier("emailNotification") NotificationService emailNotification,
            @Qualifier("smsNotification") NotificationService smsNotification,
            @Qualifier("pushNotification") NotificationService pushNotification) {
        this.emailNotification = emailNotification;
        this.smsNotification = smsNotification;
        this.pushNotification = pushNotification;
    }

    @GetMapping("/email")
    public String sendEmail() {
        return emailNotification.send("Používateľ sa prihlásil.");
    }

    @GetMapping("/sms")
    public String sendSms() {
        return smsNotification.send("Používateľ sa prihlásil.");
    }

    @GetMapping("/push")
    public String sendPush() {
        return pushNotification.send("Používateľ sa prihlásil.");
    }
}