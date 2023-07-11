package lt.monikos.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {

    // anna, bob, carol pw:test123
    @GetMapping("/users")
    public String users() {
        return "Hello USERS";
    }


    //  bob, carol pw:test123
    @GetMapping("/managers")
    public String managers() {
        return "Hello MANAGERS";
    }

    //  carol pw:test123
    @GetMapping("/admins")
    public String admins() {
        return "Hello ADMINS";
    }


}
