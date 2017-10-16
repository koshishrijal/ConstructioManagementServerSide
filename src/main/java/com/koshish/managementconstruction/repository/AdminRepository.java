package com.koshish.managementconstruction.repository;

import com.koshish.managementconstruction.entity.Admin;
import com.koshish.managementconstruction.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface AdminRepository extends JpaRepository<Admin,Integer> {
   public List<Admin> findAll();
   public Admin findOne(int adminId);
   public void delete(int adminId);
   public Asset saveAndFlush(Asset asset);

}
