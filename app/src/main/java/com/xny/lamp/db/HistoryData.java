package com.xny.lamp.db;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HistoryData implements Serializable {
    private String id;

    private Integer areaCode;

    private Integer concentratorCode;

    private Integer lampCode;

    private Integer batteryTotalVoltage;

    private Integer batteryChgCurrent;

    private Integer batteryDschCurrent;

    private Integer solarVoltage;

    private Integer faultStatusBit;

    private Integer soc;

    private Integer chargeDschControl;

    private Integer chargeDschStatusBit;

    private Integer monomerVoltage1;

    private Integer monomerVoltage2;

    private Integer monomerVoltage3;

    private Integer monomerVoltage4;

    private Integer monomerVoltage5;

    private Integer monomerVoltage6;

    private Integer monomerVoltage7;

    private Integer monomerVoltage8;

    private Integer batteryTemperature1;

    private Integer boardTemperature1;

    private Integer highTempProtectValue;

    private Integer lowTempProtectValue;

    private Integer chgOvercurrentProtectVal;

    private Integer dschOvercurrentProtectVal;

    private Integer batteryPackUndervoltageProtectValue;

    private Integer batteryPackOvervoltageProtectValue;

    private Integer monomerUndervoltageProtectValue;

    private Integer monomerOvervoltageProtectValue;

    private Integer failureProtectionValue;

    private Integer boardHighTempProtectValue;

    private Integer firstCryogenicProtectTempValue;

    private Integer firstCryogenicProtectCurrentValue;

    private Integer secondCryogenicProtectTempValue;

    private Integer secondCryogenicProtectCurrentValue;

    private Integer instanCurrent;

    private Integer highTempRecoveryValue;

    private Integer lowTempRecoveryValue;

    private Integer chgOvercurrentRecoveryValue;

    private Integer dschOvercurrentRecoveryValue;

    private Integer batteryPackUndervoltageRecoveryValue;

    private Integer batteryPackOvervoltageRecoveryValue;

    private Integer monomerUndervoltageRecoveryValue;

    private Integer singleOvervoltageRecoveryValue;

    private Integer failureRecoveryValue;

    private Integer boardHighTempRecovery;

    private Integer cryogenicRecoveryTemp1;

    private Integer cryogenicRecoveryI1;

    private Integer cryogenicRecoveryTemp2;

    private Integer cryogenicRecoveryI2;

    private Integer batterySleepOvervoltage;

    private Integer singleSleepOvervoltage;

    private Integer wakeUpCurrent;

    private Integer lightPower;

    private Integer lightTime;

    private Long proofreadingTime;

    private Integer controllerControl;

    private Integer regionVersionNumber;

    private Integer protocolVersionNumber;

    private Integer softwareVersionNumber;

    private Integer responseStatus;

    private Integer lightingTimeStage1;

    private Integer lightingPowerRatioStage1;

    private Integer lightingTimeStage2;

    private Integer lightingPowerRatioStage2;

    private Integer lightingTimeStage3;

    private Integer lightingPowerRatioStage3;

    private Integer lightingTimeStage4;

    private Integer lightingPowerRatioStage4;

    private Integer lightingTimeStage5;

    private Integer lightingPowerRatioStage5;

    private Integer lightingTimeStage6;

    private Integer lightingPowerRatioStage6;

    private Integer windVoltage;

    private Integer batteryDailyPowerConsumption;

    private Integer windDailyPowerGeneration;

    private Integer solarDailyPowerGeneration;

    private Integer batteryPowerConsumption;

    private Integer windPowerGeneration;

    private Integer solarPowerGeneration;

    private Long lightingStartTime;

    private Date createTime;

    private Date updateTime;

    private Lamp lamp;

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public Integer getBatteryTotalVoltage() {
        return batteryTotalVoltage;
    }

    public void setBatteryTotalVoltage(Integer batteryTotalVoltage) {
        this.batteryTotalVoltage = batteryTotalVoltage;
    }

    public Integer getBatteryChgCurrent() {
        return batteryChgCurrent;
    }

    public void setBatteryChgCurrent(Integer batteryChgCurrent) {
        this.batteryChgCurrent = batteryChgCurrent;
    }

    public Integer getBatteryDschCurrent() {
        return batteryDschCurrent;
    }

    public void setBatteryDschCurrent(Integer batteryDschCurrent) {
        this.batteryDschCurrent = batteryDschCurrent;
    }

    public Integer getSolarVoltage() {
        return solarVoltage;
    }

    public void setSolarVoltage(Integer solarVoltage) {
        this.solarVoltage = solarVoltage;
    }

    public Integer getFaultStatusBit() {
        return faultStatusBit;
    }

    public void setFaultStatusBit(Integer faultStatusBit) {
        this.faultStatusBit = faultStatusBit;
    }

    public Integer getSoc() {
        return soc;
    }

    public void setSoc(Integer soc) {
        this.soc = soc;
    }

    public Integer getChargeDschControl() {
        return chargeDschControl;
    }

    public void setChargeDschControl(Integer chargeDschControl) {
        this.chargeDschControl = chargeDschControl;
    }

    public Integer getChargeDschStatusBit() {
        return chargeDschStatusBit;
    }

    public void setChargeDschStatusBit(Integer chargeDschStatusBit) {
        this.chargeDschStatusBit = chargeDschStatusBit;
    }

    public Integer getMonomerVoltage1() {
        return monomerVoltage1;
    }

    public void setMonomerVoltage1(Integer monomerVoltage1) {
        this.monomerVoltage1 = monomerVoltage1;
    }

    public Integer getMonomerVoltage2() {
        return monomerVoltage2;
    }

    public void setMonomerVoltage2(Integer monomerVoltage2) {
        this.monomerVoltage2 = monomerVoltage2;
    }

    public Integer getMonomerVoltage3() {
        return monomerVoltage3;
    }

    public void setMonomerVoltage3(Integer monomerVoltage3) {
        this.monomerVoltage3 = monomerVoltage3;
    }

    public Integer getMonomerVoltage4() {
        return monomerVoltage4;
    }

    public void setMonomerVoltage4(Integer monomerVoltage4) {
        this.monomerVoltage4 = monomerVoltage4;
    }

    public Integer getMonomerVoltage5() {
        return monomerVoltage5;
    }

    public void setMonomerVoltage5(Integer monomerVoltage5) {
        this.monomerVoltage5 = monomerVoltage5;
    }

    public Integer getMonomerVoltage6() {
        return monomerVoltage6;
    }

    public void setMonomerVoltage6(Integer monomerVoltage6) {
        this.monomerVoltage6 = monomerVoltage6;
    }

    public Integer getMonomerVoltage7() {
        return monomerVoltage7;
    }

    public void setMonomerVoltage7(Integer monomerVoltage7) {
        this.monomerVoltage7 = monomerVoltage7;
    }

    public Integer getMonomerVoltage8() {
        return monomerVoltage8;
    }

    public void setMonomerVoltage8(Integer monomerVoltage8) {
        this.monomerVoltage8 = monomerVoltage8;
    }

    public Integer getBatteryTemperature1() {
        return batteryTemperature1;
    }

    public void setBatteryTemperature1(Integer batteryTemperature1) {
        this.batteryTemperature1 = batteryTemperature1;
    }

    public Integer getBoardTemperature1() {
        return boardTemperature1;
    }

    public void setBoardTemperature1(Integer boardTemperature1) {
        this.boardTemperature1 = boardTemperature1;
    }

    public Integer getHighTempProtectValue() {
        return highTempProtectValue;
    }

    public void setHighTempProtectValue(Integer highTempProtectValue) {
        this.highTempProtectValue = highTempProtectValue;
    }

    public Integer getLowTempProtectValue() {
        return lowTempProtectValue;
    }

    public void setLowTempProtectValue(Integer lowTempProtectValue) {
        this.lowTempProtectValue = lowTempProtectValue;
    }

    public Integer getChgOvercurrentProtectVal() {
        return chgOvercurrentProtectVal;
    }

    public void setChgOvercurrentProtectVal(Integer chgOvercurrentProtectVal) {
        this.chgOvercurrentProtectVal = chgOvercurrentProtectVal;
    }

    public Integer getDschOvercurrentProtectVal() {
        return dschOvercurrentProtectVal;
    }

    public void setDschOvercurrentProtectVal(Integer dschOvercurrentProtectVal) {
        this.dschOvercurrentProtectVal = dschOvercurrentProtectVal;
    }

    public Integer getBatteryPackUndervoltageProtectValue() {
        return batteryPackUndervoltageProtectValue;
    }

    public void setBatteryPackUndervoltageProtectValue(Integer batteryPackUndervoltageProtectValue) {
        this.batteryPackUndervoltageProtectValue = batteryPackUndervoltageProtectValue;
    }

    public Integer getBatteryPackOvervoltageProtectValue() {
        return batteryPackOvervoltageProtectValue;
    }

    public void setBatteryPackOvervoltageProtectValue(Integer batteryPackOvervoltageProtectValue) {
        this.batteryPackOvervoltageProtectValue = batteryPackOvervoltageProtectValue;
    }

    public Integer getMonomerUndervoltageProtectValue() {
        return monomerUndervoltageProtectValue;
    }

    public void setMonomerUndervoltageProtectValue(Integer monomerUndervoltageProtectValue) {
        this.monomerUndervoltageProtectValue = monomerUndervoltageProtectValue;
    }

    public Integer getMonomerOvervoltageProtectValue() {
        return monomerOvervoltageProtectValue;
    }

    public void setMonomerOvervoltageProtectValue(Integer monomerOvervoltageProtectValue) {
        this.monomerOvervoltageProtectValue = monomerOvervoltageProtectValue;
    }

    public Integer getFailureProtectionValue() {
        return failureProtectionValue;
    }

    public void setFailureProtectionValue(Integer failureProtectionValue) {
        this.failureProtectionValue = failureProtectionValue;
    }

    public Integer getBoardHighTempProtectValue() {
        return boardHighTempProtectValue;
    }

    public void setBoardHighTempProtectValue(Integer boardHighTempProtectValue) {
        this.boardHighTempProtectValue = boardHighTempProtectValue;
    }

    public Integer getFirstCryogenicProtectTempValue() {
        return firstCryogenicProtectTempValue;
    }

    public void setFirstCryogenicProtectTempValue(Integer firstCryogenicProtectTempValue) {
        this.firstCryogenicProtectTempValue = firstCryogenicProtectTempValue;
    }

    public Integer getFirstCryogenicProtectCurrentValue() {
        return firstCryogenicProtectCurrentValue;
    }

    public void setFirstCryogenicProtectCurrentValue(Integer firstCryogenicProtectCurrentValue) {
        this.firstCryogenicProtectCurrentValue = firstCryogenicProtectCurrentValue;
    }

    public Integer getSecondCryogenicProtectTempValue() {
        return secondCryogenicProtectTempValue;
    }

    public void setSecondCryogenicProtectTempValue(Integer secondCryogenicProtectTempValue) {
        this.secondCryogenicProtectTempValue = secondCryogenicProtectTempValue;
    }

    public Integer getSecondCryogenicProtectCurrentValue() {
        return secondCryogenicProtectCurrentValue;
    }

    public void setSecondCryogenicProtectCurrentValue(Integer secondCryogenicProtectCurrentValue) {
        this.secondCryogenicProtectCurrentValue = secondCryogenicProtectCurrentValue;
    }

    public Integer getInstanCurrent() {
        return instanCurrent;
    }

    public void setInstanCurrent(Integer instanCurrent) {
        this.instanCurrent = instanCurrent;
    }

    public Integer getHighTempRecoveryValue() {
        return highTempRecoveryValue;
    }

    public void setHighTempRecoveryValue(Integer highTempRecoveryValue) {
        this.highTempRecoveryValue = highTempRecoveryValue;
    }

    public Integer getLowTempRecoveryValue() {
        return lowTempRecoveryValue;
    }

    public void setLowTempRecoveryValue(Integer lowTempRecoveryValue) {
        this.lowTempRecoveryValue = lowTempRecoveryValue;
    }

    public Integer getChgOvercurrentRecoveryValue() {
        return chgOvercurrentRecoveryValue;
    }

    public void setChgOvercurrentRecoveryValue(Integer chgOvercurrentRecoveryValue) {
        this.chgOvercurrentRecoveryValue = chgOvercurrentRecoveryValue;
    }

    public Integer getDschOvercurrentRecoveryValue() {
        return dschOvercurrentRecoveryValue;
    }

    public void setDschOvercurrentRecoveryValue(Integer dschOvercurrentRecoveryValue) {
        this.dschOvercurrentRecoveryValue = dschOvercurrentRecoveryValue;
    }

    public Integer getBatteryPackUndervoltageRecoveryValue() {
        return batteryPackUndervoltageRecoveryValue;
    }

    public void setBatteryPackUndervoltageRecoveryValue(Integer batteryPackUndervoltageRecoveryValue) {
        this.batteryPackUndervoltageRecoveryValue = batteryPackUndervoltageRecoveryValue;
    }

    public Integer getBatteryPackOvervoltageRecoveryValue() {
        return batteryPackOvervoltageRecoveryValue;
    }

    public void setBatteryPackOvervoltageRecoveryValue(Integer batteryPackOvervoltageRecoveryValue) {
        this.batteryPackOvervoltageRecoveryValue = batteryPackOvervoltageRecoveryValue;
    }

    public Integer getMonomerUndervoltageRecoveryValue() {
        return monomerUndervoltageRecoveryValue;
    }

    public void setMonomerUndervoltageRecoveryValue(Integer monomerUndervoltageRecoveryValue) {
        this.monomerUndervoltageRecoveryValue = monomerUndervoltageRecoveryValue;
    }

    public Integer getSingleOvervoltageRecoveryValue() {
        return singleOvervoltageRecoveryValue;
    }

    public void setSingleOvervoltageRecoveryValue(Integer singleOvervoltageRecoveryValue) {
        this.singleOvervoltageRecoveryValue = singleOvervoltageRecoveryValue;
    }

    public Integer getFailureRecoveryValue() {
        return failureRecoveryValue;
    }

    public void setFailureRecoveryValue(Integer failureRecoveryValue) {
        this.failureRecoveryValue = failureRecoveryValue;
    }

    public Integer getBoardHighTempRecovery() {
        return boardHighTempRecovery;
    }

    public void setBoardHighTempRecovery(Integer boardHighTempRecovery) {
        this.boardHighTempRecovery = boardHighTempRecovery;
    }

    public Integer getCryogenicRecoveryTemp1() {
        return cryogenicRecoveryTemp1;
    }

    public void setCryogenicRecoveryTemp1(Integer cryogenicRecoveryTemp1) {
        this.cryogenicRecoveryTemp1 = cryogenicRecoveryTemp1;
    }

    public Integer getCryogenicRecoveryI1() {
        return cryogenicRecoveryI1;
    }

    public void setCryogenicRecoveryI1(Integer cryogenicRecoveryI1) {
        this.cryogenicRecoveryI1 = cryogenicRecoveryI1;
    }

    public Integer getCryogenicRecoveryTemp2() {
        return cryogenicRecoveryTemp2;
    }

    public void setCryogenicRecoveryTemp2(Integer cryogenicRecoveryTemp2) {
        this.cryogenicRecoveryTemp2 = cryogenicRecoveryTemp2;
    }

    public Integer getCryogenicRecoveryI2() {
        return cryogenicRecoveryI2;
    }

    public void setCryogenicRecoveryI2(Integer cryogenicRecoveryI2) {
        this.cryogenicRecoveryI2 = cryogenicRecoveryI2;
    }

    public Integer getBatterySleepOvervoltage() {
        return batterySleepOvervoltage;
    }

    public void setBatterySleepOvervoltage(Integer batterySleepOvervoltage) {
        this.batterySleepOvervoltage = batterySleepOvervoltage;
    }

    public Integer getSingleSleepOvervoltage() {
        return singleSleepOvervoltage;
    }

    public void setSingleSleepOvervoltage(Integer singleSleepOvervoltage) {
        this.singleSleepOvervoltage = singleSleepOvervoltage;
    }

    public Integer getWakeUpCurrent() {
        return wakeUpCurrent;
    }

    public void setWakeUpCurrent(Integer wakeUpCurrent) {
        this.wakeUpCurrent = wakeUpCurrent;
    }

    public Integer getLightPower() {
        return lightPower;
    }

    public void setLightPower(Integer lightPower) {
        this.lightPower = lightPower;
    }

    public Integer getLightTime() {
        return lightTime;
    }

    public void setLightTime(Integer lightTime) {
        this.lightTime = lightTime;
    }

    public Long getProofreadingTime() {
        return proofreadingTime;
    }

    public void setProofreadingTime(Long proofreadingTime) {
        this.proofreadingTime = proofreadingTime;
    }

    public Integer getControllerControl() {
        return controllerControl;
    }

    public void setControllerControl(Integer controllerControl) {
        this.controllerControl = controllerControl;
    }

    public Integer getRegionVersionNumber() {
        return regionVersionNumber;
    }

    public void setRegionVersionNumber(Integer regionVersionNumber) {
        this.regionVersionNumber = regionVersionNumber;
    }

    public Integer getProtocolVersionNumber() {
        return protocolVersionNumber;
    }

    public void setProtocolVersionNumber(Integer protocolVersionNumber) {
        this.protocolVersionNumber = protocolVersionNumber;
    }

    public Integer getSoftwareVersionNumber() {
        return softwareVersionNumber;
    }

    public void setSoftwareVersionNumber(Integer softwareVersionNumber) {
        this.softwareVersionNumber = softwareVersionNumber;
    }

    public Integer getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(Integer responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Integer getLightingTimeStage1() {
        return lightingTimeStage1;
    }

    public void setLightingTimeStage1(Integer lightingTimeStage1) {
        this.lightingTimeStage1 = lightingTimeStage1;
    }

    public Integer getLightingPowerRatioStage1() {
        return lightingPowerRatioStage1;
    }

    public void setLightingPowerRatioStage1(Integer lightingPowerRatioStage1) {
        this.lightingPowerRatioStage1 = lightingPowerRatioStage1;
    }

    public Integer getLightingTimeStage2() {
        return lightingTimeStage2;
    }

    public void setLightingTimeStage2(Integer lightingTimeStage2) {
        this.lightingTimeStage2 = lightingTimeStage2;
    }

    public Integer getLightingPowerRatioStage2() {
        return lightingPowerRatioStage2;
    }

    public void setLightingPowerRatioStage2(Integer lightingPowerRatioStage2) {
        this.lightingPowerRatioStage2 = lightingPowerRatioStage2;
    }

    public Integer getLightingTimeStage3() {
        return lightingTimeStage3;
    }

    public void setLightingTimeStage3(Integer lightingTimeStage3) {
        this.lightingTimeStage3 = lightingTimeStage3;
    }

    public Integer getLightingPowerRatioStage3() {
        return lightingPowerRatioStage3;
    }

    public void setLightingPowerRatioStage3(Integer lightingPowerRatioStage3) {
        this.lightingPowerRatioStage3 = lightingPowerRatioStage3;
    }

    public Integer getLightingTimeStage4() {
        return lightingTimeStage4;
    }

    public void setLightingTimeStage4(Integer lightingTimeStage4) {
        this.lightingTimeStage4 = lightingTimeStage4;
    }

    public Integer getLightingPowerRatioStage4() {
        return lightingPowerRatioStage4;
    }

    public void setLightingPowerRatioStage4(Integer lightingPowerRatioStage4) {
        this.lightingPowerRatioStage4 = lightingPowerRatioStage4;
    }

    public Integer getLightingTimeStage5() {
        return lightingTimeStage5;
    }

    public void setLightingTimeStage5(Integer lightingTimeStage5) {
        this.lightingTimeStage5 = lightingTimeStage5;
    }

    public Integer getLightingPowerRatioStage5() {
        return lightingPowerRatioStage5;
    }

    public void setLightingPowerRatioStage5(Integer lightingPowerRatioStage5) {
        this.lightingPowerRatioStage5 = lightingPowerRatioStage5;
    }

    public Integer getLightingTimeStage6() {
        return lightingTimeStage6;
    }

    public void setLightingTimeStage6(Integer lightingTimeStage6) {
        this.lightingTimeStage6 = lightingTimeStage6;
    }

    public Integer getLightingPowerRatioStage6() {
        return lightingPowerRatioStage6;
    }

    public void setLightingPowerRatioStage6(Integer lightingPowerRatioStage6) {
        this.lightingPowerRatioStage6 = lightingPowerRatioStage6;
    }

    public Integer getWindVoltage() {
        return windVoltage;
    }

    public void setWindVoltage(Integer windVoltage) {
        this.windVoltage = windVoltage;
    }

    public Integer getBatteryDailyPowerConsumption() {
        return batteryDailyPowerConsumption;
    }

    public void setBatteryDailyPowerConsumption(Integer batteryDailyPowerConsumption) {
        this.batteryDailyPowerConsumption = batteryDailyPowerConsumption;
    }

    public Integer getWindDailyPowerGeneration() {
        return windDailyPowerGeneration;
    }

    public void setWindDailyPowerGeneration(Integer windDailyPowerGeneration) {
        this.windDailyPowerGeneration = windDailyPowerGeneration;
    }

    public Integer getSolarDailyPowerGeneration() {
        return solarDailyPowerGeneration;
    }

    public void setSolarDailyPowerGeneration(Integer solarDailyPowerGeneration) {
        this.solarDailyPowerGeneration = solarDailyPowerGeneration;
    }

    public Integer getBatteryPowerConsumption() {
        return batteryPowerConsumption;
    }

    public void setBatteryPowerConsumption(Integer batteryPowerConsumption) {
        this.batteryPowerConsumption = batteryPowerConsumption;
    }

    public Integer getWindPowerGeneration() {
        return windPowerGeneration;
    }

    public void setWindPowerGeneration(Integer windPowerGeneration) {
        this.windPowerGeneration = windPowerGeneration;
    }

    public Integer getSolarPowerGeneration() {
        return solarPowerGeneration;
    }

    public void setSolarPowerGeneration(Integer solarPowerGeneration) {
        this.solarPowerGeneration = solarPowerGeneration;
    }

    public Long getLightingStartTime() {
        return lightingStartTime;
    }

    public void setLightingStartTime(Long lightingStartTime) {
        this.lightingStartTime = lightingStartTime;
    }

    public String getCreateTime() {
        return createTime==null?null:new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createTime);
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return  updateTime==null?null:new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(updateTime);
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}