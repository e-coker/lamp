package com.xny.lamp.db;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lamp implements Serializable {
    private String id;

    private String areaId;

    private String concentratorId;

    private Integer areaCode;

    private Integer concentratorCode;

    private Integer lampCode;

    private String lampName;

    private String lampAddress;

    private String lampLat;

    private String lampLon;

    private Date createTime;

    private Integer lampOrder;

    private Integer lampAround;

    private String lampDirection;

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

    public String getConcentratorId() {
        return concentratorId;
    }

    public void setConcentratorId(String concentratorId) {
        this.concentratorId = concentratorId == null ? null : concentratorId.trim();
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

    public Integer getLampCode() {
        return lampCode;
    }

    public void setLampCode(Integer lampCode) {
        this.lampCode = lampCode;
    }

    public String getLampName() {
        return lampName;
    }

    public void setLampName(String lampName) {
        this.lampName = lampName == null ? null : lampName.trim();
    }

    public String getLampAddress() {
        return lampAddress;
    }

    public void setLampAddress(String lampAddress) {
        this.lampAddress = lampAddress == null ? null : lampAddress.trim();
    }

    public String getLampLat() {
        return lampLat;
    }

    public void setLampLat(String lampLat) {
        this.lampLat = lampLat == null ? null : lampLat.trim();
    }

    public String getLampLon() {
        return lampLon;
    }

    public void setLampLon(String lampLon) {
        this.lampLon = lampLon == null ? null : lampLon.trim();
    }

    public String getCreateTime() {
        return createTime==null?null:new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createTime);
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLampOrder() {
        return lampOrder;
    }

    public void setLampOrder(Integer lampOrder) {
        this.lampOrder = lampOrder;
    }

    public Integer getLampAround() {
        return lampAround;
    }

    public void setLampAround(Integer lampAround) {
        this.lampAround = lampAround;
    }

    public String getLampDirection() {
        return lampDirection;
    }

    public void setLampDirection(String lampDirection) {
        this.lampDirection = lampDirection == null ? null : lampDirection.trim();
    }
}