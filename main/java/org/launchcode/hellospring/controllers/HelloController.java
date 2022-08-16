package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    //Handles request at /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodBye() {
        return "GoodBye, Spring!";
    }

    @RequestMapping(value="hellogoodbye", method = {RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
        public String helloGoodbye(){
            return "Hello and Goodbye together";
        }


        //Handles request of the form /hello?name=LaunchCode
//    @GetMapping("hello")
//    @ResponseBody
//        public String helloWithQueryParam(@RequestParam String name){
//        return "Hello, " + name + "!";
//        }

        //Handles to GET and POST requests at /hello?name=LaunchCode
        @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
        @ResponseBody
        public String helloUsingPost(@RequestParam String name){
            return "Hello, " + name + "!";
        }


        //Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
        public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    @ResponseBody
        public String helloForm(){
            return "<html>" +
                    "<body>" +
                    "<form action='hello'>" + //submit request to hello
                    "<input type='text' name='name'/>" +
                    "<input type='submit' value='Greet Me'/>" +
                    "</form>" +
                    "</body>" +
                    "</html>";
    }


}
