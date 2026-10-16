package dev.app.Application;

import org.springframework.stereotype.Component;

@Component
public class TodoRepository {
    String getalltodos(){
        return "todos";
    }
}
