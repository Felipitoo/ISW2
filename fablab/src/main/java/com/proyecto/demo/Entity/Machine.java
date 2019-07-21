package com.proyecto.demo.Entity;

import com.proyecto.demo.Models.Group;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_machine")
public class Machine implements Serializable {
    @Id
    @Column(name = "ID_MACHINE")
    private int id_machine; //PK

    @Column(name = "USAGE_TIME")
    private int usage_time; //Horas

    @Column(name = "NAME")
    private String name;

    @Column(name = "AVAILABILITY")
    private int availability; // 0 No disponible, 1 Disponible

    @ManyToOne
    @JoinColumn
    private Group group;

    private static final long serialVersionUID = 1L;

    public Machine() {
    }

    public Machine (int id, int time, String name, int availability) {
        this.id_machine = id;
        this.usage_time = time;
        this.name = name;
        this.availability = availability;
    }

    public Machine(Machine mach) {
    }
}
