package com.yi.lianjia.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *  链家房屋数据表
 * @author YI 2019-12-26
 */
@Data
public class LianjiaInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 小区名称
     */
    private String villageName;

    /**
     * 所在区域
     */
    private String area;

    /**
     * 单价
     */
    private Integer unitPrice;

    /**
     * 总价
     */
    private Integer totalPrices;

    /**
     * 房屋户型
     */
    private String apartments;

    /**
     * 所在楼层
     */
    private String floor;

    /**
     * 建筑面积
     */
    private String coveredArea;

    /**
     * 户型结构
     */
    private String familyStructure;

    /**
     * 套内面积
     */
    private String planimeter;

    /**
     * 建筑类型
     */
    private String architectureType;

    /**
     * 房屋朝向
     */
    private String orientationOfRoom;

    /**
     * 建筑结构
     */
    private String buildingStructure;

    /**
     * 装修状况
     */
    private String decorationSituation;

    /**
     * 梯户比例
     */
    private String proportionElevatorHouseholds;

    /**
     * 配备电梯
     */
    private String equippedWithElevator;

    /**
     * 产权年限
     */
    private String periodInt;

    /**
     * 挂牌时间
     */
    private Date listingTime;

    /**
     * 上次交易时间
     */
    private Date lastTradingTime;

    public LianjiaInfo() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getTotalPrices() {
        return totalPrices;
    }

    public void setTotalPrices(Integer totalPrices) {
        this.totalPrices = totalPrices;
    }

    public String getApartments() {
        return apartments;
    }

    public void setApartments(String apartments) {
        this.apartments = apartments;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(String coveredArea) {
        this.coveredArea = coveredArea;
    }

    public String getFamilyStructure() {
        return familyStructure;
    }

    public void setFamilyStructure(String familyStructure) {
        this.familyStructure = familyStructure;
    }

    public String getPlanimeter() {
        return planimeter;
    }

    public void setPlanimeter(String planimeter) {
        this.planimeter = planimeter;
    }

    public String getArchitectureType() {
        return architectureType;
    }

    public void setArchitectureType(String architectureType) {
        this.architectureType = architectureType;
    }

    public String getOrientationOfRoom() {
        return orientationOfRoom;
    }

    public void setOrientationOfRoom(String orientationOfRoom) {
        this.orientationOfRoom = orientationOfRoom;
    }

    public String getBuildingStructure() {
        return buildingStructure;
    }

    public void setBuildingStructure(String buildingStructure) {
        this.buildingStructure = buildingStructure;
    }

    public String getDecorationSituation() {
        return decorationSituation;
    }

    public void setDecorationSituation(String decorationSituation) {
        this.decorationSituation = decorationSituation;
    }

    public String getProportionElevatorHouseholds() {
        return proportionElevatorHouseholds;
    }

    public void setProportionElevatorHouseholds(String proportionElevatorHouseholds) {
        this.proportionElevatorHouseholds = proportionElevatorHouseholds;
    }

    public String getEquippedWithElevator() {
        return equippedWithElevator;
    }

    public void setEquippedWithElevator(String equippedWithElevator) {
        this.equippedWithElevator = equippedWithElevator;
    }

    public String getPeriodInt() {
        return periodInt;
    }

    public void setPeriodInt(String periodInt) {
        this.periodInt = periodInt;
    }

    public Date getListingTime() {
        return listingTime;
    }

    public void setListingTime(Date listingTime) {
        this.listingTime = listingTime;
    }

    public Date getLastTradingTime() {
        return lastTradingTime;
    }

    public void setLastTradingTime(Date lastTradingTime) {
        this.lastTradingTime = lastTradingTime;
    }
}
