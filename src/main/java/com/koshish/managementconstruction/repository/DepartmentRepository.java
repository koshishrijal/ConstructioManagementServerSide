package com.koshish.managementconstruction.repository;

import com.koshish.managementconstruction.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
    public List<Department> findAll();
    public Department findOne(int departmentId);
    public Department saveAndFlush(Department department);
    public void delete(int departmentId);

}
