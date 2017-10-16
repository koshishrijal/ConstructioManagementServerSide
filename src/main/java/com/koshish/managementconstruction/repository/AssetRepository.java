package com.koshish.managementconstruction.repository;

import com.koshish.managementconstruction.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface AssetRepository extends JpaRepository<Asset,Integer> {
    public List<Asset> findAll();
    public Asset findOne(int assetId);
    public void delete(int assetId);
    public Asset saveAndFlush(Asset asset);
}
