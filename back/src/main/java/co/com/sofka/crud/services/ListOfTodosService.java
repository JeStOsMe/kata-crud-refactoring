package co.com.sofka.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.sofka.crud.models.ListOfTodos;
import co.com.sofka.crud.repositories.ListOfTodosRepository;

@Service
public class ListOfTodosService {

    @Autowired
    private ListOfTodosRepository listRepo;

    public Iterable<ListOfTodos> list(){
        return listRepo.findAll();
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
