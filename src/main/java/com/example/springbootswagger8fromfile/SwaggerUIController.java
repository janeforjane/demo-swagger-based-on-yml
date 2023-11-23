package com.example.springbootswagger8fromfile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/swagger")
public class SwaggerUIController {


    @GetMapping("/greeting")
    public String homePage() {

        return "Hi there! For Api - go to host:port/swagger-ui.html";
    }

}
