package dev.app.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

//    public TodoService(){
//        todoRepository=new TodoRepository();
//    }

    public void printtodos(){
        System.out.print(todoRepository.getalltodos());
    }
}
