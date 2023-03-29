package mx.edu.utez.geinma.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_person", referencedColumnName = "id")
    private Person person;

    @OneToMany(mappedBy = "user")
    private List<Admin> admins;
    @OneToMany(mappedBy = "user")
    private List<LogBook> logBooks;

    public User() {
    }

    public User(long id, String userName, String password, String email, Rol rol, Person person, List<Admin> admins, List<LogBook> logBooks) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.rol = rol;
        this.person = person;
        this.admins = admins;
        this.logBooks = logBooks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }

    public List<LogBook> getLogBooks() {
        return logBooks;
    }

    public void setLogBooks(List<LogBook> logBooks) {
        this.logBooks = logBooks;
    }






}
