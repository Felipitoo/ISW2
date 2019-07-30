package com.proyecto.demo.Models;


import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.*;

@Entity
@Table(name = "tbl_group")
public class Group {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_GROUP")
    private int id_group; //PK

    @Column(name = "NAME_GROUP", length = 100)
    private String name_group;


    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private Set<User> users;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private Set<Machine> machines;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private Set<Storage> storages;

    public Group() {}
    
    public Group(int id_group, String name_group, User users, Machine machines, Storage storages) {
        this.id_group = id_group;
        this.name_group = name_group;
        this.users = Stream.of(users).collect(Collectors.toSet());
        this.users.forEach(x -> x.setGroup(this));
        this.machines = Stream.of(machines).collect(Collectors.toSet());
        this.machines.forEach(x -> x.setGroup(this));
        this.storages = Stream.of(storages).collect(Collectors.toSet());
        this.storages.forEach(x -> x.setGroup(this));
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Machine> getMachines() {
        return machines;
    }

    public void setMachines(Set<Machine> machines) {
        this.machines = machines;
    }

    public Set<Storage> getStorages() {
        return storages;
    }

    public void setStorages(Set<Storage> storages) {
        this.storages = storages;
    }

    public Group(Group group) {
        this.id_group = group.getId_group();
        this.name_group = group.getName_group();
	}

	public int getId_group() {
        return id_group;
    }

    public void setId_group(int id_group) {
        this.id_group = id_group;
    }

    public String getName_group() {
        return name_group;
    }

    public void setName_group(String name_group) {
        this.name_group = name_group;
    }

    @Override
    public String toString() {
        return "Group [id_group=" + id_group + ", name_group=" + name_group + "]";
    }

    

}
