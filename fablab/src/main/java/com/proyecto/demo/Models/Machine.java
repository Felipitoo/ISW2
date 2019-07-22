package com.proyecto.demo.Models;


import com.proyecto.demo.Repository.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "tbl_machine")
public class Machine {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID_MACHINE")
    private int id; //PK

    @Column(name = "USAGE_TIME")
    private int usage_time; //Horas

    @Column(name = "NAME")
    private String name;

    @Column(name = "AVAILABILITY")
    private int availability; // 0 No disponible, 1 Disponible

    @ManyToOne
    @JoinColumn
    private Group group;


    public Machine() {}

    public Group getGroup() {
        return group;
    }

    public Machine (int id, int time, String name, int availability) {
        this.id = id;
        this.usage_time = time;
        this.name = name;
        this.availability = availability;
    }

    public Machine(Machine mach) {
        this.id = mach.getId();
        this.usage_time = mach.getUsage_time();
        this.name = mach.getName();
        this.availability = mach.getAvailability();
        this.group = mach.getGroup();
    }

    public int getUsage_time() {
        return usage_time;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsage_time(int usage_time) {
        this.usage_time = usage_time;
    }

	public Object setGroup(Group group2) {
		return null;
	}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}