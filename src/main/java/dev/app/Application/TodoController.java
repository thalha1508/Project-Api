package dev.app.Application;

import dev.app.Application.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skct/2027")
public class TodoController {
    @Autowired
    private TodoService todoService;
    @GetMapping("/name")
    String gettodo() {
//        todoService.printtodos();
        return "Name is john";
    }



//    @GetMapping("")
//    String gettodobyidparam(@RequestParam("clgid") long id) {
//        return "This is my id " + id;
//    }

    @GetMapping("/create")
    String gettodobyidpara(@RequestParam String userid,@RequestParam String password) {
        return "This is my id " + userid +" " + "This is my password "+ password ;
    }
    @GetMapping("/{id}")
     ResponseEntity<Todo> getTodoById(@PathVariable long id) {
        try {
            Todo createTodo = todoService.getTodoById(id);
            return new ResponseEntity<>(createTodo,HttpStatus.OK);
        } catch (RuntimeException exception){
            return ResponseEntity.notFound().build();
        }
   }

   @GetMapping
   ResponseEntity<List<Todo>> getTodos(){
        return new ResponseEntity<List<Todo>>(todoService.getTodos(),HttpStatus.OK);
   }



   @GetMapping("/page")
   ResponseEntity<Page<Todo>> getAllTodoPages(@RequestParam int page, @RequestParam int size){
        return new ResponseEntity<>(todoService.getalltodopages(page,size),HttpStatus.OK);
   }



//    @GetMapping("/{id}")
//    ResponseEntity<Todo>getTodoById(@PathVariable long id){
//        return new ResponseEntity<>(todoService.getTodoById(id),HttpStatus.OK);
//    }

    @PostMapping("/db")
    ResponseEntity<Todo> creatuser(@RequestBody Todo todo){
    return new ResponseEntity<>(todoService.createTodo(todo), HttpStatus.CREATED) ;
    }

    @PostMapping("/secret")
    String secret(@RequestBody String body){
        return body;
    }

    @PutMapping
    ResponseEntity<Todo> updateTodoById(@RequestBody Todo todo){
        return new ResponseEntity<>(todoService.updateTodo(todo),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteTodoById(@PathVariable long id){
        todoService.deleteTodoById(id);
    }
}