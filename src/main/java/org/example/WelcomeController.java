package org.example;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class WelcomeController {


    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome Page";
    }
}

//http://localhost:8080/api/welcome         http://localhost/app.html

