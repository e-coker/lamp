package com.xny.lamp.db;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LampPara implements Serializable {
    private String id;

    private Integer offset;

    private Integer length;

    private String name;

    private String egName;

    private Integer decimalDigits;

    private Integer magnification;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEgName() {
        return egName;
    }

    public void setEgName(String egName) {
        this.egName = egName == null ? null : egName.trim();
    }

    public Integer getDecimalDigits() {
        return decimalDigits;
    }

    public void setDecimalDigits(Integer decimalDigits) {
        this.decimalDigits = decimalDigits;
    }

    public Integer getMagnification() {
        return magnification;
    }

    public void setMagnification(Integer magnification) {
        this.magnification = magnification;
    }

    public String getCreateTime() {
        return createTime ==null?null:new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createTime);
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}