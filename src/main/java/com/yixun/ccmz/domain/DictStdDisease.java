package com.yixun.ccmz.domain;

public class DictStdDisease extends BaseModel {
    private String code;

    private String name;

    private String shortName;

    private String category;

    private String memo;

    private Integer RT_ID;

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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getRT_ID() {
        return RT_ID;
    }

    public void setRT_ID(Integer RT_ID) {
        this.RT_ID = RT_ID;
    }
}