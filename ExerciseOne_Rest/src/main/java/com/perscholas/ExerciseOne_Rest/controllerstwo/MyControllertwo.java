package com.perscholas.ExerciseOne_Rest.controllerstwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllertwo{
    @GetMapping({ "login"})   // either type '/' or index
    public String showIndex()
    {
        return "index";
    }
}
