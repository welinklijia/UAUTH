package com.boco.unitive.rule.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "TFA_GAIA_RULE_SUB_ALARM")
public class TfaGaiaRuleSubAlarm {
    @Column(name = "SER_FILE_ID")
    private BigDecimal serFileId;

    @Column(name = "SUB_ALARM_NAME")
    private String subAlarmName;

    @Column(name = "FILTER_NAME")
    private String filterName;

    @Column(name = "RELATION")
    private String relation;

    @Column(name = "RELATION_NAME")
    private String relationName;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "IS_EXIST")
    private Short isExist;

    @Column(name = "PRIORITY")
    private Long priority;

    @Column(name = "IS_MAIN_ALARM")
    private Short isMainAlarm;

    @Column(name = "EXTEND_KEY")
    private String extendKey;

    @Column(name = "CLEAR_ALARM_JOIN")
    private Short clearAlarmJoin;

    @Column(name = "FILTER_CONDITION")
    private String filterCondition;

    /**
     * @return SER_FILE_ID
     */
    public BigDecimal getSerFileId() {
        return serFileId;
    }

    /**
     * @param serFileId
     */
    public void setSerFileId(BigDecimal serFileId) {
        this.serFileId = serFileId;
    }

    /**
     * @return SUB_ALARM_NAME
     */
    public String getSubAlarmName() {
        return subAlarmName;
    }

    /**
     * @param subAlarmName
     */
    public void setSubAlarmName(String subAlarmName) {
        this.subAlarmName = subAlarmName == null ? null : subAlarmName.trim();
    }

    /**
     * @return FILTER_NAME
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * @param filterName
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName == null ? null : filterName.trim();
    }

    /**
     * @return RELATION
     */
    public String getRelation() {
        return relation;
    }

    /**
     * @param relation
     */
    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    /**
     * @return RELATION_NAME
     */
    public String getRelationName() {
        return relationName;
    }

    /**
     * @param relationName
     */
    public void setRelationName(String relationName) {
        this.relationName = relationName == null ? null : relationName.trim();
    }

    /**
     * @return LOCATION
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * @return IS_EXIST
     */
    public Short getIsExist() {
        return isExist;
    }

    /**
     * @param isExist
     */
    public void setIsExist(Short isExist) {
        this.isExist = isExist;
    }

    /**
     * @return PRIORITY
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * @param priority
     */
    public void setPriority(Long priority) {
        this.priority = priority;
    }

    /**
     * @return IS_MAIN_ALARM
     */
    public Short getIsMainAlarm() {
        return isMainAlarm;
    }

    /**
     * @param isMainAlarm
     */
    public void setIsMainAlarm(Short isMainAlarm) {
        this.isMainAlarm = isMainAlarm;
    }

    /**
     * @return EXTEND_KEY
     */
    public String getExtendKey() {
        return extendKey;
    }

    /**
     * @param extendKey
     */
    public void setExtendKey(String extendKey) {
        this.extendKey = extendKey == null ? null : extendKey.trim();
    }

    /**
     * @return CLEAR_ALARM_JOIN
     */
    public Short getClearAlarmJoin() {
        return clearAlarmJoin;
    }

    /**
     * @param clearAlarmJoin
     */
    public void setClearAlarmJoin(Short clearAlarmJoin) {
        this.clearAlarmJoin = clearAlarmJoin;
    }

    /**
     * @return FILTER_CONDITION
     */
    public String getFilterCondition() {
        return filterCondition;
    }

    /**
     * @param filterCondition
     */
    public void setFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition == null ? null : filterCondition.trim();
    }
}