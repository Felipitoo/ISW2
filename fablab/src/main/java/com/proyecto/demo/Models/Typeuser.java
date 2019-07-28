package com.proyecto.demo.Models;


import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.*;

@Entity
@Table(name = "tbl_type_user")
public class Typeuser {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_TYPE_USER")
    private int id;

    @Column(name = "TYPE_NAME", length = 100)
    private String type;

    @ManyToMany (mappedBy = "typeusers", cascade = CascadeType.ALL)
    private Set<User> users;


    public Typeuser() {}

    public Typeuser(int id_type_user, String type_name, User users) {
        this.id = id_type_user;
        this.type = type_name;
        this.users = Stream.of(users).collect(Collectors.toSet());
        this.users.forEach(x -> x.setType_User(this));

    }

    public int getId_type_user() {
        return id;
    }

    public void setId_type_user(int id_type_user) {
        this.id = id_type_user;
    }

    public String getType_name() {
        return type;
    }

    public void setType_name(String type_name) {
        this.type = type_name;
    }

    @Override
    public String toString() {
        return "Typeuser [id_type_user=" + id + ", type_name=" + type + "]";
    }

    


 

}