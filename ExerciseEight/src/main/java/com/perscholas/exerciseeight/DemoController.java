package com.perscholas.exerciseeight;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {
    @GetMapping("/get-info")
    public String getStringMessage() {
        return "Hi ! You will be able to monitor the health of the application !!" ;
    }
}
