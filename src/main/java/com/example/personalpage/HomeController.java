package com.example.personalpage;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {

        return "<html><body>"
                + "<h1>Jackson Frieze</h1>"
                + "<h2>Major: Mathematics</h2>"
                + "<h2>Server Time: " + LocalDateTime.now() + "</h2>"
                + "</body></html>";
    }
}
