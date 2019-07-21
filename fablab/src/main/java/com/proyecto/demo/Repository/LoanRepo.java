package com.proyecto.demo.Repository;


import com.proyecto.demo.Models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("LoanRepo")
public interface LoanRepo extends JpaRepository <Loan, Integer> {

}