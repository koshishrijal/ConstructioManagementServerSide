/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koshish.managementconstruction.controller;

import com.koshish.managementconstruction.entity.Project;
import com.koshish.managementconstruction.service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Koshish Rijal
 */
@RestController
@RequestMapping(value="/api/projects")
public class ProjectRestController {
    @Autowired
    private ProjectService projectService;
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(method=RequestMethod.GET)
    public List<Project> getAll(){
        return projectService.getAll();
    }
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/{id}")
    public Project getById(@PathVariable("id") int id){
        return projectService.getById(id);
    }
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/insert",method=RequestMethod.POST)
    public String insertAndUpdate(@RequestBody Project project){
        Project p=projectService.insert(project);
        return "inserted with id"+p.getProjectId();
    }
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable("id") int id){
        projectService.delete(id);
        return "deleted with id "+id;
    }
    
    
}
