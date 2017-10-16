package com.koshish.managementconstruction.service;

import com.koshish.managementconstruction.entity.Loan;
import com.koshish.managementconstruction.repository.LoanRepository;
import com.koshish.managementconstruction.service.IService.ILoanService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loanService")
public class LoanService implements ILoanService {
    @Autowired
    private LoanRepository loanRepository;
    @Override
    public List<Loan> getAll() {
     return loanRepository.findAll();
    }

    @Override
    public Loan insert(Loan loan) {
      return loanRepository.saveAndFlush(loan);
    }

    @Override
    public Loan getById(int id) {
     return  loanRepository.findOne(id);
    }

    @Override
    public int delete(int id) {
        loanRepository.delete(id);
        return id;
    }
}
