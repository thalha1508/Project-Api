package dev.app.Application;

import dev.app.Application.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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



    @GetMapping("")
    String gettodobyidparam(@RequestParam("clgid") long id) {
        return "This is my id " + id;
    }

    @GetMapping("/create")
    String gettodobyidpara(@RequestParam String userid,@RequestParam String password) {
        return "This is my id " + userid +" " + "This is my password "+ password ;
    }
//    @GetMapping("/{id}")
//    ResponseEntity<Todo> gettodobyid(@RequestParam long id) {
//        try {
//            Todo createTodo = todoService.gettodobyid(id);
//            return new ResponseEntity<>(createTodo,HttpStatus.OK);
//        } catch (RuntimeException exception){
//            return new ResponseEntity<>((HttpHeaders) null, HttpStatus.NOT_FOUND);
//        }
//    }

    @PostMapping("/db")
    ResponseEntity<Todo> creatuser(@RequestBody Todo todo){
    return new ResponseEntity<>(todoService.createTodo(todo), HttpStatus.CREATED) ;
    }

    @PostMapping("/secret")
    String secret(@RequestBody String body){
        return body;
    }

    @PutMapping("/{id}")
    String updateid(@PathVariable long id){
        return "Updated id: "+id;
    }

    @DeleteMapping("/{id}")
    String deleteid(@PathVariable long id){
        return "Deleted value: " +id;
    }
}