package dev.app.Application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApplicationController {

    @GetMapping("/abu")
    String App(){
        return "THIS IS OUR APPLICATION";
    }


}
