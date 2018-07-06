package com.yixun.ccmz.domain;

public class DictGovermentDept extends BaseModel {
    private String fullCode;

    private String code;

    private String name;

    private Integer level;

    private String parentFullCode;

    private Boolean isDeleted;

    public String getFullCode() {
        return fullCode;
    }

    public void setFullCode(String fullCode) {
        this.fullCode = fullCode == null ? null : fullCode.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getParentFullCode() {
        return parentFullCode;
    }

    public void setParentFullCode(String parentFullCode) {
        this.parentFullCode = parentFullCode == null ? null : parentFullCode.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}