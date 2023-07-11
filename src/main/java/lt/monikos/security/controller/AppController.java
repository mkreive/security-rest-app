package lt.monikos.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {

    @GetMapping("/users")
    public String users() {
        return "Hello USERS";
    }

    @GetMapping("/managers")
    public String managers() {
        return "Hello MANAGERS";
    }

    @GetMapping("/admins")
    public String admins() {
        return "Hello ADMINS";
    }


}
