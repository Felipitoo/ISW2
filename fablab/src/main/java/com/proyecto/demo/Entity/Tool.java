package com.proyecto.demo.Entity;

import com.proyecto.demo.Models.Loan;
import com.proyecto.demo.Models.Storage;

import javax.persistence.*;
import java.io.Serializable;


@Table(name="Tool")
@Entity
public class Tool implements Serializable{
    private static final long serialVersionUID = 1L;

    public Tool (){}

    public Tool(int id_tool, String name, int availability) {
        this.id_tool = id_tool;
        this.name = name;
        this.availability = availability;
    }

    @Id
    @Column(name = "ID_TOOL")
    public int id_tool;

    @Column(name = "NAME")
    public String name;

    @Column(name = "AVAILABILITY")
    public int availability; //0 no disponible, 1 disponible

    @ManyToOne
    @JoinColumn
    private Storage storage;

    @ManyToOne
    @JoinColumn
    private Loan loan;

}
