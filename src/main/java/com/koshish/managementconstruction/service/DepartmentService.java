package com.koshish.managementconstruction.service;

import com.koshish.managementconstruction.entity.Department;
import com.koshish.managementconstruction.repository.DepartmentRepository;
import com.koshish.managementconstruction.service.IService.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("departmentService")
public class DepartmentService implements IDepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public List<Department> getAll() {
       return departmentRepository.findAll();
    }

    @Override
    public Department insert(Department department) {
        department.setDateAdded(new Date());
        return departmentRepository.saveAndFlush(department);
    }

    @Override
    public Department getById(int id) {
       return departmentRepository.findOne(id);
    }

    @Override
    public int delete(int id) {
        departmentRepository.delete(id);
        return id;
    }
}
