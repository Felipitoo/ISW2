package com.proyecto.demo.Models;

import java.sql.Date;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.*;

@Entity
@Table(name = "tbl_storage")
public class Storage {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_STORAGE")
    private int id;

    @Column(name = "DATE")
    private Date date;

    @ManyToOne
    @JoinColumn
    private Group group;

    @OneToMany(mappedBy = "storage", cascade = CascadeType.ALL)
    private Set<Tool> tools;

    public Storage() {}

    public Storage(int id, Date date, Tool tools) {
        this.id = id;
        this.date = date;
        this.tools = Stream.of(tools).collect(Collectors.toSet());
        this.tools.forEach(x -> x.setStorage(this));
    }

    public int getId_storage() {
        return id;
    }

    public void setId_storage(int id) {
        this.id = id;
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Object setGroup(Group group2) {
		return null;
	}


    
}