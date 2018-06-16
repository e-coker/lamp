package com.xny.lamp.db;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LampConcentrator implements Serializable {
    private String id;

    private String areaId;

    private Integer areaCode;

    private Integer concentratorCode;

    private String concentratorName;

    private String concentratorAddress;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public Integer getConcentratorCode() {
        return concentratorCode;
    }

    public void setConcentratorCode(Integer concentratorCode) {
        this.concentratorCode = concentratorCode;
    }

    public String getConcentratorName() {
        return concentratorName;
    }

    public void setConcentratorName(String concentratorName) {
        this.concentratorName = concentratorName == null ? null : concentratorName.trim();
    }

    public String getConcentratorAddress() {
        return concentratorAddress;
    }

    public void setConcentratorAddress(String concentratorAddress) {
        this.concentratorAddress = concentratorAddress == null ? null : concentratorAddress.trim();
    }

    public String getCreateTime() {
        return createTime==null?null:new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createTime);
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime==null?null:new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(updateTime);
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}