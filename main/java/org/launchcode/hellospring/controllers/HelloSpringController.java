package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloSpringController {

    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!"; //this variable will be second parameter in line below
        model.addAttribute("greeting", greeting); //second parameter has to match String variable
        return "hello";
    }


        //Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
        public String helloAgain(@PathVariable String name, Model model){
        model.addAttribute("greeting", "Hello, " + name + "!"); //adding the value w/o creating a variable
        return "hello";
    }

    @GetMapping("form")
        public String helloForm(){
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("Nick");
        names.add("Diane");
        names.add("Sophia");
        names.add("Gianna");
        model.addAttribute("names", names);
        return "hello-list";
    }


}
