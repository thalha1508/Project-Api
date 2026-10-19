package dev.app.Application;

import dev.app.Application.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public Todo createTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public Todo getTodoById(Long id){
        return todoRepository.findById(id).orElseThrow(()-> new RuntimeException("Todo not found"));
    }

    public List<Todo> getTodos(){
        return todoRepository.findAll();
    }

    public Page<Todo> getalltodopages(int page,int size){
        Pageable pageable= PageRequest.of(page,size);
        return todoRepository.findAll(pageable);
    }

    public Todo updateTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id){
        todoRepository.delete(getTodoById(id));
    }

    public void deleteTodos(Todo todo){
        todoRepository.delete(todo);
    }

}

//    public TodoService(){
//        todoRepository=new TodoRepository();
//    }
//
//    public void printtodos(){
//        System.out.print(todoRepository.getalltodos());
//    }
//}
