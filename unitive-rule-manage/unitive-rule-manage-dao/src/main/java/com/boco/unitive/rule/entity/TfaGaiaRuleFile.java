package com.boco.unitive.rule.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "TFA_GAIA_RULE_FILE")
public class TfaGaiaRuleFile {
    @Id
    @Column(name = "SER_FILE_ID")
    private BigDecimal serFileId;

    @Column(name = "DIRECTORYS")
    private String directorys;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "OPT_PERSON")
    private String optPerson;

    @Column(name = "NEW_FILE")
    private String newFile;

    @Column(name = "CHANGE_TIME")
    private Date changeTime;

    @Column(name = "IN_USE")
    private String inUse;

    @Column(name = "ALARM_ID_NUM")
    private BigDecimal alarmIdNum;

    @Column(name = "RULE_NAME")
    private String ruleName;

    @Column(name = "RELATION_TYPE")
    private BigDecimal relationType;

    @Column(name = "PROFESSIONAL_TYPE")
    private BigDecimal professionalType;

    @Column(name = "VENDOR_ID")
    private BigDecimal vendorId;

    @Column(name = "RULEDESC")
    private String ruledesc;

    @Column(name = "USER_ID")
    private BigDecimal userId;

    @Column(name = "IS_LOCAL_RULE")
    private String isLocalRule;

    @Column(name = "RELATION_CONDITION")
    private String relationCondition;

    @Column(name = "RELATION_POSITION_INFO")
    private String relationPositionInfo;

    @Column(name = "USE_RESOURCES")
    private String useResources;

    @Column(name = "PRO_RESCONFIG")
    private String proResconfig;

    @Column(name = "EXT_RESCONFIG")
    private String extResconfig;

    @Column(name = "ALARM_CONTENT")
    private String alarmContent;

    @Column(name = "RULE_DEF_USER")
    private String ruleDefUser;

    @Column(name = "RULE_DEF_PHONE")
    private String ruleDefPhone;

    @Column(name = "EQP_OBJECT_CLASS")
    private String eqpObjectClass;

    @Column(name = "TOPIC_IDLIST")
    private String topicIdlist;

    @Column(name = "FILTER_ID")
    private String filterId;

    @Column(name = "PHONE_NUM")
    private String phoneNum;

    @Column(name = "FIRE_POINT")
    private Short firePoint;

    @Column(name = "ACTIVE_TIME_OUT")
    private String activeTimeOut;

    @Column(name = "COUNT_TYPE")
    private Short countType;

    @Column(name = "THRESH_HOLD")
    private BigDecimal threshHold;

    @Column(name = "THRESH_HOLD_REFER_SQL")
    private String threshHoldReferSql;

    @Column(name = "CHANGE_STATUS")
    private BigDecimal changeStatus;

    @Column(name = "PROJECT_SURPRESS")
    private Short projectSurpress;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "DEALED_PROCESS_ALIAS")
    private String dealedProcessAlias;

    @Column(name = "RELATION_NAME")
    private String relationName;

    @Column(name = "BLACKLIST_PROVINCE")
    private String blacklistProvince;

    @Column(name = "WHITELIST_PROVINCE")
    private String whitelistProvince;

    @Column(name = "REASON_TYPE")
    private BigDecimal reasonType;

    @Column(name = "RULE_CONTENT")
    private String ruleContent;

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
     * @return DIRECTORYS
     */
    public String getDirectorys() {
        return directorys;
    }

    /**
     * @param directorys
     */
    public void setDirectorys(String directorys) {
        this.directorys = directorys == null ? null : directorys.trim();
    }

    /**
     * @return FILE_NAME
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * @return OPT_PERSON
     */
    public String getOptPerson() {
        return optPerson;
    }

    /**
     * @param optPerson
     */
    public void setOptPerson(String optPerson) {
        this.optPerson = optPerson == null ? null : optPerson.trim();
    }

    /**
     * @return NEW_FILE
     */
    public String getNewFile() {
        return newFile;
    }

    /**
     * @param newFile
     */
    public void setNewFile(String newFile) {
        this.newFile = newFile == null ? null : newFile.trim();
    }

    /**
     * @return CHANGE_TIME
     */
    public Date getChangeTime() {
        return changeTime;
    }

    /**
     * @param changeTime
     */
    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    /**
     * @return IN_USE
     */
    public String getInUse() {
        return inUse;
    }

    /**
     * @param inUse
     */
    public void setInUse(String inUse) {
        this.inUse = inUse == null ? null : inUse.trim();
    }

    /**
     * @return ALARM_ID_NUM
     */
    public BigDecimal getAlarmIdNum() {
        return alarmIdNum;
    }

    /**
     * @param alarmIdNum
     */
    public void setAlarmIdNum(BigDecimal alarmIdNum) {
        this.alarmIdNum = alarmIdNum;
    }

    /**
     * @return RULE_NAME
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * @param ruleName
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    /**
     * @return RELATION_TYPE
     */
    public BigDecimal getRelationType() {
        return relationType;
    }

    /**
     * @param relationType
     */
    public void setRelationType(BigDecimal relationType) {
        this.relationType = relationType;
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
     * @return RULEDESC
     */
    public String getRuledesc() {
        return ruledesc;
    }

    /**
     * @param ruledesc
     */
    public void setRuledesc(String ruledesc) {
        this.ruledesc = ruledesc == null ? null : ruledesc.trim();
    }

    /**
     * @return USER_ID
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * @return IS_LOCAL_RULE
     */
    public String getIsLocalRule() {
        return isLocalRule;
    }

    /**
     * @param isLocalRule
     */
    public void setIsLocalRule(String isLocalRule) {
        this.isLocalRule = isLocalRule == null ? null : isLocalRule.trim();
    }

    /**
     * @return RELATION_CONDITION
     */
    public String getRelationCondition() {
        return relationCondition;
    }

    /**
     * @param relationCondition
     */
    public void setRelationCondition(String relationCondition) {
        this.relationCondition = relationCondition == null ? null : relationCondition.trim();
    }

    /**
     * @return RELATION_POSITION_INFO
     */
    public String getRelationPositionInfo() {
        return relationPositionInfo;
    }

    /**
     * @param relationPositionInfo
     */
    public void setRelationPositionInfo(String relationPositionInfo) {
        this.relationPositionInfo = relationPositionInfo == null ? null : relationPositionInfo.trim();
    }

    /**
     * @return USE_RESOURCES
     */
    public String getUseResources() {
        return useResources;
    }

    /**
     * @param useResources
     */
    public void setUseResources(String useResources) {
        this.useResources = useResources == null ? null : useResources.trim();
    }

    /**
     * @return PRO_RESCONFIG
     */
    public String getProResconfig() {
        return proResconfig;
    }

    /**
     * @param proResconfig
     */
    public void setProResconfig(String proResconfig) {
        this.proResconfig = proResconfig == null ? null : proResconfig.trim();
    }

    /**
     * @return EXT_RESCONFIG
     */
    public String getExtResconfig() {
        return extResconfig;
    }

    /**
     * @param extResconfig
     */
    public void setExtResconfig(String extResconfig) {
        this.extResconfig = extResconfig == null ? null : extResconfig.trim();
    }

    /**
     * @return ALARM_CONTENT
     */
    public String getAlarmContent() {
        return alarmContent;
    }

    /**
     * @param alarmContent
     */
    public void setAlarmContent(String alarmContent) {
        this.alarmContent = alarmContent == null ? null : alarmContent.trim();
    }

    /**
     * @return RULE_DEF_USER
     */
    public String getRuleDefUser() {
        return ruleDefUser;
    }

    /**
     * @param ruleDefUser
     */
    public void setRuleDefUser(String ruleDefUser) {
        this.ruleDefUser = ruleDefUser == null ? null : ruleDefUser.trim();
    }

    /**
     * @return RULE_DEF_PHONE
     */
    public String getRuleDefPhone() {
        return ruleDefPhone;
    }

    /**
     * @param ruleDefPhone
     */
    public void setRuleDefPhone(String ruleDefPhone) {
        this.ruleDefPhone = ruleDefPhone == null ? null : ruleDefPhone.trim();
    }

    /**
     * @return EQP_OBJECT_CLASS
     */
    public String getEqpObjectClass() {
        return eqpObjectClass;
    }

    /**
     * @param eqpObjectClass
     */
    public void setEqpObjectClass(String eqpObjectClass) {
        this.eqpObjectClass = eqpObjectClass == null ? null : eqpObjectClass.trim();
    }

    /**
     * @return TOPIC_IDLIST
     */
    public String getTopicIdlist() {
        return topicIdlist;
    }

    /**
     * @param topicIdlist
     */
    public void setTopicIdlist(String topicIdlist) {
        this.topicIdlist = topicIdlist == null ? null : topicIdlist.trim();
    }

    /**
     * @return FILTER_ID
     */
    public String getFilterId() {
        return filterId;
    }

    /**
     * @param filterId
     */
    public void setFilterId(String filterId) {
        this.filterId = filterId == null ? null : filterId.trim();
    }

    /**
     * @return PHONE_NUM
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * @param phoneNum
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    /**
     * @return FIRE_POINT
     */
    public Short getFirePoint() {
        return firePoint;
    }

    /**
     * @param firePoint
     */
    public void setFirePoint(Short firePoint) {
        this.firePoint = firePoint;
    }

    /**
     * @return ACTIVE_TIME_OUT
     */
    public String getActiveTimeOut() {
        return activeTimeOut;
    }

    /**
     * @param activeTimeOut
     */
    public void setActiveTimeOut(String activeTimeOut) {
        this.activeTimeOut = activeTimeOut == null ? null : activeTimeOut.trim();
    }

    /**
     * @return COUNT_TYPE
     */
    public Short getCountType() {
        return countType;
    }

    /**
     * @param countType
     */
    public void setCountType(Short countType) {
        this.countType = countType;
    }

    /**
     * @return THRESH_HOLD
     */
    public BigDecimal getThreshHold() {
        return threshHold;
    }

    /**
     * @param threshHold
     */
    public void setThreshHold(BigDecimal threshHold) {
        this.threshHold = threshHold;
    }

    /**
     * @return THRESH_HOLD_REFER_SQL
     */
    public String getThreshHoldReferSql() {
        return threshHoldReferSql;
    }

    /**
     * @param threshHoldReferSql
     */
    public void setThreshHoldReferSql(String threshHoldReferSql) {
        this.threshHoldReferSql = threshHoldReferSql == null ? null : threshHoldReferSql.trim();
    }

    /**
     * @return CHANGE_STATUS
     */
    public BigDecimal getChangeStatus() {
        return changeStatus;
    }

    /**
     * @param changeStatus
     */
    public void setChangeStatus(BigDecimal changeStatus) {
        this.changeStatus = changeStatus;
    }

    /**
     * @return PROJECT_SURPRESS
     */
    public Short getProjectSurpress() {
        return projectSurpress;
    }

    /**
     * @param projectSurpress
     */
    public void setProjectSurpress(Short projectSurpress) {
        this.projectSurpress = projectSurpress;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return DEALED_PROCESS_ALIAS
     */
    public String getDealedProcessAlias() {
        return dealedProcessAlias;
    }

    /**
     * @param dealedProcessAlias
     */
    public void setDealedProcessAlias(String dealedProcessAlias) {
        this.dealedProcessAlias = dealedProcessAlias == null ? null : dealedProcessAlias.trim();
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
     * @return BLACKLIST_PROVINCE
     */
    public String getBlacklistProvince() {
        return blacklistProvince;
    }

    /**
     * @param blacklistProvince
     */
    public void setBlacklistProvince(String blacklistProvince) {
        this.blacklistProvince = blacklistProvince == null ? null : blacklistProvince.trim();
    }

    /**
     * @return WHITELIST_PROVINCE
     */
    public String getWhitelistProvince() {
        return whitelistProvince;
    }

    /**
     * @param whitelistProvince
     */
    public void setWhitelistProvince(String whitelistProvince) {
        this.whitelistProvince = whitelistProvince == null ? null : whitelistProvince.trim();
    }

    /**
     * @return REASON_TYPE
     */
    public BigDecimal getReasonType() {
        return reasonType;
    }

    /**
     * @param reasonType
     */
    public void setReasonType(BigDecimal reasonType) {
        this.reasonType = reasonType;
    }

    /**
     * @return RULE_CONTENT
     */
    public String getRuleContent() {
        return ruleContent;
    }

    /**
     * @param ruleContent
     */
    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent == null ? null : ruleContent.trim();
    }
}