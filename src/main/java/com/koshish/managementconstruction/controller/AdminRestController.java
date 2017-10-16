package com.koshish.managementconstruction.controller;

import com.koshish.managementconstruction.entity.Admin;
import com.koshish.managementconstruction.entity.Asset;
import com.koshish.managementconstruction.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/admins")
public class AdminRestController {

    @Autowired
    private AdminService adminService;

@CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(method= RequestMethod.GET)
    public List<Admin> getAll()
    {
      return adminService.getAll();
    }
@CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    public Admin findById(@PathVariable("id") int id){

        return adminService.getById(id);
    }
@CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable("id") int id){
        adminService.delete(id);
        return "delete with id "+id;
    }
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/insert",method=RequestMethod.POST)
    public String insertAndUpdate(@RequestBody Admin admin){
        adminService.insert(admin);
        return "saved with id "+admin.getAdminId();
    }
}
