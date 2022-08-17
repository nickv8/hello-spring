package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    //now is found at localhost:8080/hello/goodbye
    @GetMapping("goodbye")
    public String goodBye() {
        return "GoodBye, Spring!";
    }

    //lives at hello/hello
    //handles request of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST })
        public String helloWithQueryParam(@RequestParam String name){
            return "Hello, " + name + "!";
        }


        //above does same as this
        //Handles request of the form /hello?name=LaunchCode
//    @GetMapping("")
//
//        public String helloWithQueryParam(@RequestParam String name){
//        return "Hello, " + name + "!";
//        }


        //Handles requests of the form /hello/LaunchCode
    @GetMapping("/{name}")
        public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    //lives at /hello/form
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method = 'post'/>" + //submit a request to /hello
                "<input type = 'text' value = 'Great Me!'/>" +
                "</form>" +
                "</body>" +
                "/html>";

}


}
