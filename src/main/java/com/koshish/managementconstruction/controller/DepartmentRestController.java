package com.koshish.managementconstruction.controller;

import com.koshish.managementconstruction.entity.Department;
import com.koshish.managementconstruction.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/departments")
public class DepartmentRestController {

    @Autowired
    private DepartmentService departmentService;
@CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(method= RequestMethod.GET)
    public List<Department> getAll(){
        return departmentService.getAll();
    }
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public Department getById(@PathVariable("id")  int id){
        return departmentService.getById(id);
    }
    
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/insert",method=RequestMethod.POST)
    public String insertAndUpdate( @RequestBody  Department department){
       Department d= departmentService.insert(department);
       return "inserted with id "+d.getDepartmentId();
    }
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public String delete( @PathVariable("id") int id){
        departmentService.delete(id);
        return "deleted with id "+id;
    }
}
