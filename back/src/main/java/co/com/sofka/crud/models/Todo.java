package co.com.sofka.crud.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private boolean completed;
    //private String groupListId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ListOfTodos")
    private ListOfTodos motherList;

    /*
    public String getGroupListId() {
        return groupListId;
    }

    public void setGroupListId(String groupListId) {
        this.groupListId = groupListId;
    }
    */
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public ListOfTodos getMotherList() {
        return motherList;
    }

    public void setMotherList(ListOfTodos motherList) {
        this.motherList = motherList;
    }    
}
