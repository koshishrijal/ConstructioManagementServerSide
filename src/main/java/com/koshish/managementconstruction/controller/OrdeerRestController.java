package com.koshish.managementconstruction.controller;

import com.koshish.managementconstruction.entity.Ordeer;
import com.koshish.managementconstruction.service.OrdeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value="/api/ordeers")
public class OrdeerRestController {
    @Autowired
    private OrdeerService ordeerService;
@CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(method= RequestMethod.GET)
    public List<Ordeer> getAll(){
        return ordeerService.getAll();
    }
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/insert",method=RequestMethod.POST)
    public String insertAndUpdate(@RequestBody Ordeer ordeer){
        ordeer.setDateToStart(new Date());
        ordeer.setDateAdded(new Date());
        ordeerService.insert(ordeer);
        return "inserted";
    }
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public Ordeer getById(@PathVariable("id") int id){
        return ordeerService.getById(id);
    }
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public  String delete(@PathVariable("id") int id){
      ordeerService.delete(id);
      return "deleted with id "+id;
    }
}
