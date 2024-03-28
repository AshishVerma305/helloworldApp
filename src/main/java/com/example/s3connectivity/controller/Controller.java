package com.example.s3connectivity.controller;




import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class Controller {
    @GetMapping("/hello")
    public String redis()
    {

        return "welcome";
    }
}
