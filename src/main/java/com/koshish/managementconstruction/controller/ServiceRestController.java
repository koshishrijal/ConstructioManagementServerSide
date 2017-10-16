package com.koshish.managementconstruction.controller;

import com.koshish.managementconstruction.Business.model.ServiceDTO;
import com.koshish.managementconstruction.entity.Service;
import com.koshish.managementconstruction.service.ServiceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value="/api/services")
public class ServiceRestController {
@Autowired
private ServiceService serviceService;
private ModelMapper modelMapper=new ModelMapper();
private List<Service> serviceList;
private List<ServiceDTO> serviceDTOList;

@CrossOrigin(allowedHeaders="*",allowCredentials="true")
@RequestMapping(method= RequestMethod.GET)
    public List<ServiceDTO> findAll(){
    serviceList=serviceService.getAll();
         serviceDTOList=new ArrayList<>();
         for(Service service:serviceList){
             ServiceDTO serviceDTO=new ServiceDTO();
             serviceDTO=modelMapper.map(service,ServiceDTO.class);
             serviceDTOList.add(serviceDTO);
         }
   return serviceDTOList;
    }

    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/insert",method=RequestMethod.POST)
    public String  insertAndUpdate(@RequestBody Service service){
        service.setDateAdded(new Date());
   Service service1= serviceService.insert(service);
    return "inserted with id "+service1.getServiceId();
    }
    
    @RequestMapping(value="/delete/{serviceId}",method=RequestMethod.DELETE)
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    public String delete(@PathVariable int serviceId){
        serviceService.delete(serviceId);
        return "deleted with id "+serviceId;
    }
  
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public ServiceDTO getById(@PathVariable("id") int id){
      Service s=serviceService.getById(id);
      ServiceDTO serviceDTO=new ServiceDTO();
      serviceDTO=modelMapper.map(s,ServiceDTO.class);
      return serviceDTO;
    }
}
