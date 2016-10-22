package org.peoplehelper.rest.database.model;

import javax.persistence.*;

@Entity
@Table(name = "HealthAndDV")
public class HealthAndDVDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "health_and_dv_primary_key")
    private Long healthAndDVPrimaryKey;

    @Column(name = "HealthAndDVID")
    private Long healthAndDVID;

    @Column(name = "ProjectEntryID")
    private Long projectEntryID;

    @ManyToOne
    @JoinColumn(name = "PersonalID", referencedColumnName = "UUID")
    private ClientDBO clientDbo;

    @Column(name = "InformationDate")
    private String informationDate;

    @Column(name = "DomesticViolenceVictim")
    private Integer domesticViolenceVictim;

    @Column(name = "WhenOccurred")
    private Integer whenOccurred;

    @Column(name = "CurrentlyFleeing")
    private Integer currentlyFleeing;

    @Column(name = "GeneralHealthStatus")
    private Integer generalHealthStatus;

    @Column(name = "DentalHealthStatus")
    private Integer dentalHealthStatus;

    @Column(name = "MentalHealthStatus")
    private Integer mentalHealthStatus;

    @Column(name = "PregnancyStatus")
    private Integer pregnancyStatus;

    @Column(name = "DueDate")
    private String dueDate;

    @Column(name = "DataCollectionStage")
    private Integer dataCollectionStage;

    @Column(name = "DateCreated")
    private String dateCreated;

    @Column(name = "DateUpdated")
    private String dateUpdated;

    public Long getHealthAndDVPrimaryKey() {
        return healthAndDVPrimaryKey;
    }

    public void setHealthAndDVPrimaryKey(Long healthAndDVPrimaryKey) {
        this.healthAndDVPrimaryKey = healthAndDVPrimaryKey;
    }

    public Long getHealthAndDVID() {
        return healthAndDVID;
    }

    public void setHealthAndDVID(Long healthAndDVID) {
        this.healthAndDVID = healthAndDVID;
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

    public String getInformationDate() {
        return informationDate;
    }

    public void setInformationDate(String informationDate) {
        this.informationDate = informationDate;
    }

    public Integer getDomesticViolenceVictim() {
        return domesticViolenceVictim;
    }

    public void setDomesticViolenceVictim(Integer domesticViolenceVictim) {
        this.domesticViolenceVictim = domesticViolenceVictim;
    }

    public Integer getWhenOccurred() {
        return whenOccurred;
    }

    public void setWhenOccurred(Integer whenOccurred) {
        this.whenOccurred = whenOccurred;
    }

    public Integer getCurrentlyFleeing() {
        return currentlyFleeing;
    }

    public void setCurrentlyFleeing(Integer currentlyFleeing) {
        this.currentlyFleeing = currentlyFleeing;
    }

    public Integer getGeneralHealthStatus() {
        return generalHealthStatus;
    }

    public void setGeneralHealthStatus(Integer generalHealthStatus) {
        this.generalHealthStatus = generalHealthStatus;
    }

    public Integer getDentalHealthStatus() {
        return dentalHealthStatus;
    }

    public void setDentalHealthStatus(Integer dentalHealthStatus) {
        this.dentalHealthStatus = dentalHealthStatus;
    }

    public Integer getMentalHealthStatus() {
        return mentalHealthStatus;
    }

    public void setMentalHealthStatus(Integer mentalHealthStatus) {
        this.mentalHealthStatus = mentalHealthStatus;
    }

    public Integer getPregnancyStatus() {
        return pregnancyStatus;
    }

    public void setPregnancyStatus(Integer pregnancyStatus) {
        this.pregnancyStatus = pregnancyStatus;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getDataCollectionStage() {
        return dataCollectionStage;
    }

    public void setDataCollectionStage(Integer dataCollectionStage) {
        this.dataCollectionStage = dataCollectionStage;
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

    @Column(name = "UserID")
    private Long userId;

    @Column(name = "DateDeleted")
    private String dateDeleted;

    @Column(name = "ExportID")
    private Integer exportId;

    public HealthAndDVDBO() {}

}
