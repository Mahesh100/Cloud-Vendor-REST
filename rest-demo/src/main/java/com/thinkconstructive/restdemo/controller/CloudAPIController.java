package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloud-vendor")  //context path
public class CloudAPIController {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String VendorId)
    {
            return cloudVendor; //new CloudVendor ("C1", "Mahesh","Address1", "123456");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody  CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return  "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String DeleteCloudVendorDetails(String vendorId){
        return "Vendor Deatils deleted Sccessfully";
    }


}
