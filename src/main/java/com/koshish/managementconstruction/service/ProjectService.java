/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koshish.managementconstruction.service;

import com.koshish.managementconstruction.entity.Project;
import com.koshish.managementconstruction.repository.ProjectRepository;
import com.koshish.managementconstruction.service.IService.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Koshish Rijal
 */
@Service("projectService")
public class ProjectService implements IProjectService {

    @Autowired
    private ProjectRepository projectRepository;
    private List<Project> projectList;
    
    @Override
    public List<Project> getAll() {
       return  projectRepository.findAll();        

    }
    
    @Override
    public Project insert(Project p) {
        return projectRepository.saveAndFlush(p);
    }
    
    @Override
    public Project getById(int id) {
        return projectRepository.findOne(id);
    }
    
    @Override
    public int delete(int id) {
        projectRepository.delete(id);
        return id;
    }
    
}
