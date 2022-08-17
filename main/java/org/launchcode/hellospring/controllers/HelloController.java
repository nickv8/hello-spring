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
<<<<<<< HEAD
//    @GetMapping("")
//
//        public String helloWithQueryParam(@RequestParam String name){
//        return "Hello, " + name + "!";
//        }


        //Handles requests of the form /hello/LaunchCode
    @GetMapping("/{name}")
=======
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
>>>>>>> 41d66b33a28c662c3fa4b2a5ef560a9d27485c9e
        public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

<<<<<<< HEAD
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
=======
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
>>>>>>> 41d66b33a28c662c3fa4b2a5ef560a9d27485c9e


}
