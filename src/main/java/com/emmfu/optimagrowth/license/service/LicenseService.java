package com.emmfu.optimagrowth.license.service;

import com.emmfu.optimagrowth.license.model.License;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LicenseService {

    public License getLicense(String licenseId, String organizationId) {
        License license = new License();
        license.setId(new Random().nextLong());
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setDescription("Software Product License");
        license.setProductName("Ostock");
        license.setLicenseType("full");

        return license;
    }

    public String createLicense(License license, String organizationId) {
        String responseMessage = null;
        if(license != null) {
            license.setOrganizationId(organizationId);;
            responseMessage = String.format("This is the post and the object is %s", license.toString());
        }
        return responseMessage;
    }

    public String updateLicense(License license, String organizatoinId) {
        String responseMessage = null;
        if(license != null) {
            license.setOrganizationId(organizatoinId);
            responseMessage = String.format("This is the put and the object is %s", license.toString());
        }
        return responseMessage;
    }

    public String deleteLicense(String licenseId, String organizationId) {
        String responseMessage = null;
        responseMessage = String.format("Delete license with id %s for the organization %s", licenseId, organizationId);

        return responseMessage;
    }
}
