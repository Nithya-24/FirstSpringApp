package com.example.firstspringapp.controller;

import org.springframework.web.bind.annotation.*;
import com.example.firstspringapp.model.User;

@RestController
@RequestMapping("/hello")
public class SpringRestController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello () {
        return "Hello from Bridgelabz!!";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello" + name +"!";
    }

    @GetMapping("param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello" + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + " " + user.getLastName() + "!";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName) {
        return "Hello" + firstName + " " + lastName + "!";
    }

}