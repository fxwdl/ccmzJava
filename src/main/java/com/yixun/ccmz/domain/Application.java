package com.yixun.ccmz.domain;

public class Application extends BaseModel {
    private String applicationId;

    private String applicationName;

    private String loweredApplicationName;

    private String description;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId == null ? null : applicationId.trim();
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName == null ? null : applicationName.trim();
    }

    public String getLoweredApplicationName() {
        return loweredApplicationName;
    }

    public void setLoweredApplicationName(String loweredApplicationName) {
        this.loweredApplicationName = loweredApplicationName == null ? null : loweredApplicationName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}