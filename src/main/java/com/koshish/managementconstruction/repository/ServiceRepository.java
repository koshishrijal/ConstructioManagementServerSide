package com.koshish.managementconstruction.repository;

import com.koshish.managementconstruction.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ServiceRepository extends JpaRepository<Service,Integer> {
   public  List<Service> findAll();
    public Service saveAndFlush(Service service);
    public void delete(int serviceId);
    public Service findOne(int serviceId);
}
