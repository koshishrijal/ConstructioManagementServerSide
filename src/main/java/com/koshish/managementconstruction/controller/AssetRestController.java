package com.koshish.managementconstruction.controller;

import com.koshish.managementconstruction.entity.Asset;
import com.koshish.managementconstruction.service.AssetService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/assets")
public class AssetRestController {
    @Autowired
    private AssetService assetService;
@CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(method= RequestMethod.GET)
    public List<Asset> findAllAsset()
    {
   return assetService.getAll();
    }
@CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public Asset getById(@PathVariable int id){
      return  assetService.getById(id);
    }
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    public String delete(@PathVariable("id") int id){
        assetService.delete(id);
       return "deleted with id "+id;
    }
    @CrossOrigin(allowedHeaders="*",allowCredentials="true")
    @RequestMapping(value="/insert",method=RequestMethod.POST)
    public String saveAndUpdate(@RequestBody Asset asset){
      Asset a= assetService.insert(asset);
     return "inserted with id "+a.getAssetId();
    }
}
