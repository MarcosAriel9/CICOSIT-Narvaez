package mx.edu.utez.geinma.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name" , nullable = false)
    private String name;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "sur_name", nullable = false)
    private String surName;

    @Column(name = "phone", nullable = false)
    private int  phone;

    @Column(name = "birthday", nullable = false)
    private Date birthday;

    @OneToOne(mappedBy = "person")
    private User user;

    public Person() {
    }

    public Person(long id, String name, String lastName, String surName, int phone, Date birthday, User user) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.surName = surName;
        this.phone = phone;
        this.birthday = birthday;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



}
