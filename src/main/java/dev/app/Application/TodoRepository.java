package dev.app.Application;

//import org.springframework.stereotype.Component;
//
//@Component
//public class TodoRepository {
//    String getalltodos(){
//        return "todos";
//    }
//}

import dev.app.Application.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}