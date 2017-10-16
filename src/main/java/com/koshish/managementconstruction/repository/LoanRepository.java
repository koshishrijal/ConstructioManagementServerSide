package com.koshish.managementconstruction.repository;

import com.koshish.managementconstruction.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan,Integer> {
    public List<Loan> findAll();
    public Loan findOne(int id);
    public void delete(int id);
    public Loan saveAndFlush(Loan loan);
}
