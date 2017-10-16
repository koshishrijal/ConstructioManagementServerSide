/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koshish.managementconstruction.repository;

import com.koshish.managementconstruction.entity.Project;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Koshish Rijal
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer>{
    public List<Project> findAll();
    
    public Project findOne(int id);
    
    public void delete(int id);
    public Project saveAndFlush(Project project);
    
}
