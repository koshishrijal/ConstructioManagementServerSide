package com.koshish.managementconstruction.repository;

import com.koshish.managementconstruction.entity.Ordeer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrdeerRepository extends JpaRepository<Ordeer,Integer> {
    @Override
   public  List<Ordeer> findAll();

    public Ordeer saveAndFlush(Ordeer ordeer);

    @Override
   public void delete(Integer ordeerId);

    @Override
    Ordeer findOne(Integer ordeerId);
}
