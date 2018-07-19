package com.yixun.ccmz.domain;

public class Role extends BaseModel {
    private String roleId;

    private String applicationId;

    private String roleName;

    private String loweredRoleName;

    private String description;

    private Boolean level1;

    private Boolean level2;

    private Boolean level3;

    private Boolean level4;

    private Boolean hosiptal_Flag;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId == null ? null : applicationId.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getLoweredRoleName() {
        return loweredRoleName;
    }

    public void setLoweredRoleName(String loweredRoleName) {
        this.loweredRoleName = loweredRoleName == null ? null : loweredRoleName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Boolean getLevel1() {
        return level1;
    }

    public void setLevel1(Boolean level1) {
        this.level1 = level1;
    }

    public Boolean getLevel2() {
        return level2;
    }

    public void setLevel2(Boolean level2) {
        this.level2 = level2;
    }

    public Boolean getLevel3() {
        return level3;
    }

    public void setLevel3(Boolean level3) {
        this.level3 = level3;
    }

    public Boolean getLevel4() {
        return level4;
    }

    public void setLevel4(Boolean level4) {
        this.level4 = level4;
    }

    public Boolean getHosiptal_Flag() {
        return hosiptal_Flag;
    }

    public void setHosiptal_Flag(Boolean hosiptal_Flag) {
        this.hosiptal_Flag = hosiptal_Flag;
    }
}