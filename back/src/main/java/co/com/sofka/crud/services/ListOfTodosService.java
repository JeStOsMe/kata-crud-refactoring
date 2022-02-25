package co.com.sofka.crud.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.sofka.crud.models.ListOfTodos;
import co.com.sofka.crud.models.Todo;
import co.com.sofka.crud.repositories.ListOfTodosRepository;

@Service
public class ListOfTodosService {

    @Autowired
    private ListOfTodosRepository listRepo;

    public Iterable<ListOfTodos> list(){
        return listRepo.findAll();
    }

    public boolean saveTodo(Todo todo){
        Optional<ListOfTodos> motherList = listRepo.findById(todo.getMotherList());

        if(motherList.isPresent()){
            ListOfTodos _motherList = (ListOfTodos) motherList.get();
            _motherList.saveTodo(todo);
            return true;
        } else{
            return false;
        }
    }

    public ListOfTodos save(ListOfTodos list){
        return listRepo.save(list);
    }

    public void delete(Long id){
        listRepo.deleteById(id);
    }

    public ListOfTodos get(Long id){
        return listRepo.findById(id).orElseThrow();
    }
    
}
