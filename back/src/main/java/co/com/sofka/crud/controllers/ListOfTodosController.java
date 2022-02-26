package co.com.sofka.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.sofka.crud.models.ListOfTodos;
import co.com.sofka.crud.services.ListOfTodosService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ListOfTodosController {
    
    @Autowired
    private ListOfTodosService listService;

    @GetMapping("/api/list")
    public Iterable<ListOfTodos> list(){
        return listService.list();
    }

    @PostMapping("/api/list/save")
    public ListOfTodos save(@RequestBody ListOfTodos list){
        return listService.save(list);
    }

    @PutMapping("/api/list/update")
    public ListOfTodos update(@RequestBody ListOfTodos list){
        if (list.getId() != null){
            return listService.save(list);
        } else{
            throw new RuntimeException("No existe el id para actualizar");
        }
    }

    @DeleteMapping("/api/list/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        listService.delete(id);
    }

    @GetMapping("/api/list/{id}")
    public ListOfTodos get(@PathVariable("id") Long id){
        return listService.get(id);
    }


}
