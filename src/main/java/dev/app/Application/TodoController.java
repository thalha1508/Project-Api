package dev.app.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skct/2027")
public class TodoController {
    @Autowired
    private TodoService todoService;
    @GetMapping("/name")
    String gettodo() {
        todoService.printtodos();
        return "Name is john";
    }


//    @GetMapping("/{id:\\d+}")
//    String gettodobyid(@PathVariable long id) {
//        return "This is my id " + id;
//    }
    @GetMapping("")
    String gettodobyidparam(@RequestParam("clgid") long id) {
        return "This is my id " + id;
    }

    @GetMapping("/create")
    String gettodobyidpara(@RequestParam String userid,@RequestParam String password) {
        return "This is my id " + userid +" " + "This is my password "+ password ;
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