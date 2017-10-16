package com.koshish.managementconstruction.service;


import com.koshish.managementconstruction.entity.Admin;
import com.koshish.managementconstruction.repository.AdminRepository;
import com.koshish.managementconstruction.service.IService.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("userService")
@Transactional
public class AdminService implements IAdminService{
    @Autowired
    private AdminRepository adminRepository;
    private List<Admin> adminList;
    private Admin admin;
    public List<Admin> getAll(){
        adminList=adminRepository.findAll();
        return adminList;
    }

    @Override
    public Admin insert(Admin admin) {
      return  adminRepository.saveAndFlush(admin);
    }

    public Admin getById(int id){

        return adminRepository.findOne(id);
    }

    @Override
    public int delete(int id) {
       adminRepository.delete(id);
       return id;
    }
}
