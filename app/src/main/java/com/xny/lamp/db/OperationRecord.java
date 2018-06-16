package com.xny.lamp.db;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OperationRecord implements Serializable {
    private String id;

    private Integer type;

    private Integer areaCode;

    private Integer concentratorCode;

    private Integer lampCode;

    private String paraId;

    private Integer lampCmd;

    private Long paraData;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public String getParaId() {
        return paraId;
    }

    public void setParaId(String paraId) {
        this.paraId = paraId == null ? null : paraId.trim();
    }

    public Integer getLampCmd() {
        return lampCmd;
    }

    public void setLampCmd(Integer lampCmd) {
        this.lampCmd = lampCmd;
    }

    public Long getParaData() {
        return paraData;
    }

    public void setParaData(Long paraData) {
        this.paraData = paraData;
    }

    public String getCreateTime() {
        return createTime==null?null:new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createTime);
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}