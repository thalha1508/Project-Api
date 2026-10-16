package dev.app.Application;

import dev.app.Application.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public Todo createTodo(Todo todo){
        return todoRepository.save(todo);
    }
//
//    public Todo gettodobyid(Long id){
//        return todoRepository.findById(id).orElseThrow(()-> new RuntimeException("Todo not found"));
//    }

}

//    public TodoService(){
//        todoRepository=new TodoRepository();
//    }
//
//    public void printtodos(){
//        System.out.print(todoRepository.getalltodos());
//    }
//}
