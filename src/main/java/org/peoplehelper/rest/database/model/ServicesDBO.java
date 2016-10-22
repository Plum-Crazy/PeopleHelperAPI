package org.peoplehelper.rest.database.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Services")
public class ServicesDBO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "services_primary_key")
    private Long servicesPrimaryKey;

    @Column(name = "ServicesID")
    private Long servicesID;

    @Column(name = "ProjectEntryID")
    private Long projectEntryID;

    @ManyToOne
    @JoinColumn(name = "PersonalID", referencedColumnName = "UUID")
    private ClientDBO clientDbo;

    @Column(name = "DateProvided")
    private String dateProvided;

    @Column(name = "RecordType")
    private Integer recordType;

    @Column(name = "TypeProvided")
    private Integer typeProvided;

    @Column(name = "OtherTypeProvided")
    private Integer otherTypeProvided;

    @Column(name = "SubTypeProvided")
    private Integer subTypeProvided;

    @Column(name = "FAAmount")
    private Integer faAmount;

    @Column(name = "ReferralOutcome")
    private Integer referralOutcome;

    @Column(name = "DateCreated")
    private String dateCreated;

    @Column(name = "DateUpdated")
    private String dateUpdated;

    @Column(name = "UserID")
    private Long userId;

    @Column(name = "DateDeleted")
    private String dateDeleted;

    @Column(name = "ExportID")
    private Integer exportId;

    public ServicesDBO() {}

    public Long getServicesPrimaryKey() {
        return servicesPrimaryKey;
    }

    public void setServicesPrimaryKey(Long servicesPrimaryKey) {
        this.servicesPrimaryKey = servicesPrimaryKey;
    }

    public Long getServicesID() {
        return servicesID;
    }

    public void setServicesID(Long servicesID) {
        this.servicesID = servicesID;
    }

    public Long getProjectEntryID() {
        return projectEntryID;
    }

    public void setProjectEntryID(Long projectEntryID) {
        this.projectEntryID = projectEntryID;
    }

    public ClientDBO getClientDbo() {
        return clientDbo;
    }

    public void setClientDbo(ClientDBO clientDbo) {
        this.clientDbo = clientDbo;
    }

    public String getDateProvided() {
        return dateProvided;
    }

    public void setDateProvided(String dateProvided) {
        this.dateProvided = dateProvided;
    }

    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
    }

    public Integer getTypeProvided() {
        return typeProvided;
    }

    public void setTypeProvided(Integer typeProvided) {
        this.typeProvided = typeProvided;
    }

    public Integer getOtherTypeProvided() {
        return otherTypeProvided;
    }

    public void setOtherTypeProvided(Integer otherTypeProvided) {
        this.otherTypeProvided = otherTypeProvided;
    }

    public Integer getSubTypeProvided() {
        return subTypeProvided;
    }

    public void setSubTypeProvided(Integer subTypeProvided) {
        this.subTypeProvided = subTypeProvided;
    }

    public Integer getFaAmount() {
        return faAmount;
    }

    public void setFaAmount(Integer faAmount) {
        this.faAmount = faAmount;
    }

    public Integer getReferralOutcome() {
        return referralOutcome;
    }

    public void setReferralOutcome(Integer referralOutcome) {
        this.referralOutcome = referralOutcome;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDateDeleted() {
        return dateDeleted;
    }

    public void setDateDeleted(String dateDeleted) {
        this.dateDeleted = dateDeleted;
    }

    public Integer getExportId() {
        return exportId;
    }

    public void setExportId(Integer exportId) {
        this.exportId = exportId;
    }
}