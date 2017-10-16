package com.koshish.managementconstruction.service;

import com.koshish.managementconstruction.entity.Asset;
import com.koshish.managementconstruction.repository.AssetRepository;
import com.koshish.managementconstruction.service.IService.IAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("assetService")
@Transactional
public class AssetService implements IAssetService{
    @Autowired
    private AssetRepository assetRepository;
     private List<Asset> assetList;
     private Asset asset;
    public List<Asset> getAll(){
       assetList=assetRepository.findAll();
       return assetList;
    }

    @Override
    public Asset insert(Asset asset) {
      return  assetRepository.saveAndFlush(asset);

    }

    @Override
    public Asset getById(int id)
    {
       return assetRepository.findOne(id);
    }

    @Override
    public int delete(int id) {
        assetRepository.delete(id);
        return id;
    }


}
