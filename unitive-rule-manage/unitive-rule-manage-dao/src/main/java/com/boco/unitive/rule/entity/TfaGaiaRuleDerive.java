package com.boco.unitive.rule.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "TFA_GAIA_RULE_DERIVE")
public class TfaGaiaRuleDerive {
    @Id
    @Column(name = "SER_FILE_ID")
    private BigDecimal serFileId;

    @Column(name = "DERIVE_TITLE_TEXT")
    private String deriveTitleText;

    @Column(name = "DERIVE_ORG_SEVERITY")
    private BigDecimal deriveOrgSeverity;

    @Column(name = "DERIVE_ORG_TYPE")
    private BigDecimal deriveOrgType;

    @Column(name = "DERIVE_CLR_RULE")
    private BigDecimal deriveClrRule;

    @Column(name = "TIME_OUT")
    private String timeOut;

    @Column(name = "EFFECT_NE")
    private String effectNe;

    @Column(name = "EFFECT_SERVICE")
    private String effectService;

    @Column(name = "COUNT_THRESHOLD_TYPE")
    private Short countThresholdType;

    @Column(name = "ALARM_TEXT")
    private String alarmText;

    @Column(name = "DERIVE_STANDARD_ALARM_ID")
    private String deriveStandardAlarmId;

    @Column(name = "OTHER_FIELD")
    private String otherField;

    @Column(name = "DERIVE_STANDARD_ALARM_NAME")
    private String deriveStandardAlarmName;

    @Column(name = "PROFESSIONAL_TYPE")
    private BigDecimal professionalType;

    @Column(name = "VENDOR_ID")
    private BigDecimal vendorId;

    @Column(name = "EQP_OBJECT_CLASS")
    private BigDecimal eqpObjectClass;

    @Column(name = "OBJECT_CLASS")
    private BigDecimal objectClass;

    @Column(name = "ACTIVE_TIMEOUT")
    private String activeTimeout;

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
     * @return DERIVE_TITLE_TEXT
     */
    public String getDeriveTitleText() {
        return deriveTitleText;
    }

    /**
     * @param deriveTitleText
     */
    public void setDeriveTitleText(String deriveTitleText) {
        this.deriveTitleText = deriveTitleText == null ? null : deriveTitleText.trim();
    }

    /**
     * @return DERIVE_ORG_SEVERITY
     */
    public BigDecimal getDeriveOrgSeverity() {
        return deriveOrgSeverity;
    }

    /**
     * @param deriveOrgSeverity
     */
    public void setDeriveOrgSeverity(BigDecimal deriveOrgSeverity) {
        this.deriveOrgSeverity = deriveOrgSeverity;
    }

    /**
     * @return DERIVE_ORG_TYPE
     */
    public BigDecimal getDeriveOrgType() {
        return deriveOrgType;
    }

    /**
     * @param deriveOrgType
     */
    public void setDeriveOrgType(BigDecimal deriveOrgType) {
        this.deriveOrgType = deriveOrgType;
    }

    /**
     * @return DERIVE_CLR_RULE
     */
    public BigDecimal getDeriveClrRule() {
        return deriveClrRule;
    }

    /**
     * @param deriveClrRule
     */
    public void setDeriveClrRule(BigDecimal deriveClrRule) {
        this.deriveClrRule = deriveClrRule;
    }

    /**
     * @return TIME_OUT
     */
    public String getTimeOut() {
        return timeOut;
    }

    /**
     * @param timeOut
     */
    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut == null ? null : timeOut.trim();
    }

    /**
     * @return EFFECT_NE
     */
    public String getEffectNe() {
        return effectNe;
    }

    /**
     * @param effectNe
     */
    public void setEffectNe(String effectNe) {
        this.effectNe = effectNe == null ? null : effectNe.trim();
    }

    /**
     * @return EFFECT_SERVICE
     */
    public String getEffectService() {
        return effectService;
    }

    /**
     * @param effectService
     */
    public void setEffectService(String effectService) {
        this.effectService = effectService == null ? null : effectService.trim();
    }

    /**
     * @return COUNT_THRESHOLD_TYPE
     */
    public Short getCountThresholdType() {
        return countThresholdType;
    }

    /**
     * @param countThresholdType
     */
    public void setCountThresholdType(Short countThresholdType) {
        this.countThresholdType = countThresholdType;
    }

    /**
     * @return ALARM_TEXT
     */
    public String getAlarmText() {
        return alarmText;
    }

    /**
     * @param alarmText
     */
    public void setAlarmText(String alarmText) {
        this.alarmText = alarmText == null ? null : alarmText.trim();
    }

    /**
     * @return DERIVE_STANDARD_ALARM_ID
     */
    public String getDeriveStandardAlarmId() {
        return deriveStandardAlarmId;
    }

    /**
     * @param deriveStandardAlarmId
     */
    public void setDeriveStandardAlarmId(String deriveStandardAlarmId) {
        this.deriveStandardAlarmId = deriveStandardAlarmId == null ? null : deriveStandardAlarmId.trim();
    }

    /**
     * @return OTHER_FIELD
     */
    public String getOtherField() {
        return otherField;
    }

    /**
     * @param otherField
     */
    public void setOtherField(String otherField) {
        this.otherField = otherField == null ? null : otherField.trim();
    }

    /**
     * @return DERIVE_STANDARD_ALARM_NAME
     */
    public String getDeriveStandardAlarmName() {
        return deriveStandardAlarmName;
    }

    /**
     * @param deriveStandardAlarmName
     */
    public void setDeriveStandardAlarmName(String deriveStandardAlarmName) {
        this.deriveStandardAlarmName = deriveStandardAlarmName == null ? null : deriveStandardAlarmName.trim();
    }

    /**
     * @return PROFESSIONAL_TYPE
     */
    public BigDecimal getProfessionalType() {
        return professionalType;
    }

    /**
     * @param professionalType
     */
    public void setProfessionalType(BigDecimal professionalType) {
        this.professionalType = professionalType;
    }

    /**
     * @return VENDOR_ID
     */
    public BigDecimal getVendorId() {
        return vendorId;
    }

    /**
     * @param vendorId
     */
    public void setVendorId(BigDecimal vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * @return EQP_OBJECT_CLASS
     */
    public BigDecimal getEqpObjectClass() {
        return eqpObjectClass;
    }

    /**
     * @param eqpObjectClass
     */
    public void setEqpObjectClass(BigDecimal eqpObjectClass) {
        this.eqpObjectClass = eqpObjectClass;
    }

    /**
     * @return OBJECT_CLASS
     */
    public BigDecimal getObjectClass() {
        return objectClass;
    }

    /**
     * @param objectClass
     */
    public void setObjectClass(BigDecimal objectClass) {
        this.objectClass = objectClass;
    }

    /**
     * @return ACTIVE_TIMEOUT
     */
    public String getActiveTimeout() {
        return activeTimeout;
    }

    /**
     * @param activeTimeout
     */
    public void setActiveTimeout(String activeTimeout) {
        this.activeTimeout = activeTimeout == null ? null : activeTimeout.trim();
    }
}