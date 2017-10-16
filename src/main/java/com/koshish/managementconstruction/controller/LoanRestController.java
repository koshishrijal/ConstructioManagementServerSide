/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koshish.managementconstruction.controller;

import com.koshish.managementconstruction.entity.Loan;
import com.koshish.managementconstruction.service.LoanService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Koshish Rijal
 */
@RestController
@RequestMapping(value = "/api/loans")
public class LoanRestController {

    @Autowired
    private LoanService loanService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Loan> getAll() {
        return loanService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Loan getById(@PathVariable("id") int id) {
        return loanService.getById(id);
    }
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/insert",method=RequestMethod.POST)
    public String insertAndUpdate(Loan loan) {
        Loan l = loanService.insert(loan);
        return "succesfully inserted with id " + l.getLoanId();
    }
  @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable("id") int id){
        loanService.delete(id);
        return "deleted with id ";
    }
    
}
