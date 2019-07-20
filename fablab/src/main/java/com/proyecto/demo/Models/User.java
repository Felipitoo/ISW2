package com.proyecto.demo.Models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tbl_user")
public class User { 
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID_USER")
    private int id; //PK

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "USER_NAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @ManyToMany
    private Set<Typeuser> typeusers;

    /*
    @ManyToOne
    @JoinColumn
    private Group group;*/

    @Transient
    private String passwordConfirm;

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public User() {}

    public User(User user) {}

    public User(int id_user, String name, String email, String user_name, String password) {
        this.id = id_user;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

	public Object setGroup(Group group2) {
		return null;
	}

	public Object setType_User(Typeuser typeuser2) {
		return null;
	}

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Typeuser> getTypeusers() {
        return typeusers;
    }

    public void setTypeusers(Set<Typeuser> typeusers) {
        this.typeusers = typeusers;
    }

    public void setId(int id_user) {
        this.id = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}