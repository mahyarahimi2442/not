package ir.ac.notification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @GetMapping
    public String test() {
        return "test";
    }

    @GetMapping("/firebase-messaging-sw.js")
    public String firebaseMessagingSwJs() {
        return "firebaseMessagingSwJs";
    }

}
