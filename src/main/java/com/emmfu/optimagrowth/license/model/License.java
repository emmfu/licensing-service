package com.emmfu.optimagrowth.license.model;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
public class License extends RepresentationModel<License> {
    private Long Id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;
}
