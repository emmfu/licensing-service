package com.emmfu.optimagrowth.license.model;

import lombok.Data;

@Data
public class License {
    private Long Id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;
}
