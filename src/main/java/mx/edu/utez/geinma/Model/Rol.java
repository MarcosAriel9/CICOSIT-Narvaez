package mx.edu.utez.geinma.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, name = "description")
    private String description;
    @OneToMany(mappedBy = "rol")
    @JsonIgnore
    private List<User> userList;


    public Rol() {
    }

    public Rol(long id, String description, List<User> userList) {
        this.id = id;
        this.description = description;
        this.userList = userList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }


}
