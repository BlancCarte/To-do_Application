package com.Todo_Application.Todo_Application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

    //pr용 주석추가
    @GetMapping("/")
    public String ToDo(){
        return "To-do Application !";
    }
}
