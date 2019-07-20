package com.proyecto.demo.Models;

import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.*;

@Entity
@Table(name = "tbl_loan")
public class Loan {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "LOAN_NUMBER")
    private int id;

    @Column(name = "LOAN_DATE")
    private Date loan_date;

    @OneToMany
    public Set<External> external;

    @OneToMany
    public Set<Tool> tool;

    public Loan() {}

    public Loan(int loan_number, Date loan_date, External external, Tool tool) {
        this.id = loan_number;
        this.loan_date = loan_date;
        this.external = Stream.of(external).collect(Collectors.toSet());
        this.external.forEach(x -> ((External) x).setLoan(this));
        this.tool = Stream.of(tool).collect(Collectors.toSet());
        this.tool.forEach(x -> ((Tool) x).setLoan(this));
    }

    public int getLoan_number() {
        return id;
    }

    public void setLoan_number(int loan_number) {
        this.id = loan_number;
    }
    
    


}