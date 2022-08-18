package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@Controller
@ResponseBody
@RequestMapping(value = "hello")
public class HelloController {


    @RequestMapping(value = "hello", method ={RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }
        //figure out how to add parameters to html
//            return "<html>" +
//                    "<body>" +
//                    "<h1></h1>" +
//                    "</body>" +
//                    "</html>";
       return createMessage(name, language);
    }


        public static String createMessage(String n, String l) {
            String greeting = "";

            if (l.equals("English")){
                greeting = "Hello";
            }

            if (l.equals("Spanish")) {
                greeting = "Hola";
            }

            if (l.equals("French")) {
                greeting = "Bonjour";
            }

            if (l.equals("Italian")) {
                greeting = "Caio";
            }

            if (l.equals("German")) {
                greeting = "Hallo";
            }

            return greeting + " " + n;
        }




    //lives at /hello/form
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action = 'hello'/>" + //submit a request to /hello
                "<input type = 'text' name = 'name'/>" +
                "<input type = 'submit' value = 'Greet Me!'/>" +
                "<select name='language'>" +
                "<option value = 'English'>English</option>" +
                "<option value = 'Spanish'>Spanish</option>" +
                "<option value = 'French'>French</option>" +
                "<option value = 'Italian'>Italian</option>" +
                "<option value = 'German'>German</option>" +
                "</select>" +
                "</form>" +
                "</body>" +
                "</html>";

}

    }
