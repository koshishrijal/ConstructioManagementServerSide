package com.koshish.managementconstruction.service;

import com.koshish.managementconstruction.Business.model.ServiceDTO;
import com.koshish.managementconstruction.repository.ServiceRepository;
import com.koshish.managementconstruction.service.IService.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import java.util.List;

@Service("serviceService")
public class ServiceService implements IServiceService{
    @Autowired
    private ServiceRepository serviceRepository;
    private List<ServiceDTO> serviceDTOList;
    private List<com.koshish.managementconstruction.entity.Service> serviceList;
    private com.koshish.managementconstruction.entity.Service service;

    public  List<com.koshish.managementconstruction.entity.Service> getAll(){
      serviceList=serviceRepository.findAll();
      return serviceList;
    }
    public com.koshish.managementconstruction.entity.Service insert(com.koshish.managementconstruction.entity.Service s){
       service =serviceRepository.saveAndFlush(s);
       return service;
    }

    @Override
    public com.koshish.managementconstruction.entity.Service getById(int id)
    {
       return serviceRepository.findOne(id);
    }

    public int delete(int id){
        serviceRepository.delete(id);
        return id;
    }
}
