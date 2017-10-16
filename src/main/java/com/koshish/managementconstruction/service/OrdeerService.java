package com.koshish.managementconstruction.service;

import com.koshish.managementconstruction.entity.Ordeer;
import com.koshish.managementconstruction.repository.OrdeerRepository;
import com.koshish.managementconstruction.service.IService.IOrdeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("ordeerService")
@Transactional
public class OrdeerService implements IOrdeerService{

    @Autowired
    private OrdeerRepository ordeerRepository;

    public Ordeer insert(Ordeer ordeer){
        ordeerRepository.saveAndFlush(ordeer);
        return ordeer;
    }

    @Override
    public Ordeer getById(int id)
    {
       return ordeerRepository.findOne(id);
    }

    @Override
    public int delete(int id) {
       ordeerRepository.delete(id);
       return id;
    }

    public List<Ordeer> getAll(){

        return ordeerRepository.findAll();
    }

}
