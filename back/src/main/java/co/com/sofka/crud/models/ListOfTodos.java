package co.com.sofka.crud.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ListOfTodos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String listName;

    private List<Todo> todosInList;

    public ListOfTodos() {
    }

    public ListOfTodos(String listName) {
        this.listName = listName;
        this.todosInList = new ArrayList<Todo>();
    }

    public boolean saveTodo(Todo todo){
        return this.todosInList.add(todo);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public List<Todo> getTodosInList() {
        return todosInList;
    }

    public void setTodosInList(List<Todo> todosInList) {
        this.todosInList = todosInList;
    }

    
    
}
