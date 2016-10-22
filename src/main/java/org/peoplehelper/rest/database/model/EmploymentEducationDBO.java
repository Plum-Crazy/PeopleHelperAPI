package org.peoplehelper.rest.database.model;

import javax.persistence.*;

@Entity
@Table(name = "EmploymentEducation")
public class EmploymentEducationDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employment_education_primary_key")
    private Long employmentEducationPrimaryKey;

    @Column(name = "EmploymentEducationID")
    private Long employmentEducationID;

    @Column(name = "ProjectEntryID")
    private Long projectEntryID;

    @ManyToOne
    @JoinColumn(name = "PersonalID", referencedColumnName = "UUID")
    private ClientDBO clientDbo;

    @Column(name = "InformationDate")
    private String informationDate;

    // todo LastGradeCompleted
    // todo SchoolStatus

    @Column(name = "Employed")
    private Integer employed;

    // todo EmploymentType
    // todo NotEmployedReason

    @Column(name = "DataCollectionStage")
    private Integer dataCollectionStage;

    @Column(name = "DateCreated")
    private String dateCreated;

    @Column(name = "DateUpdated")
    private String dateUpdated;

    @Column(name = "UserID")
    private Long userId;

    // todo DateDeleted

    @Column(name = "ExportID")
    private Integer exportId;

    public EmploymentEducationDBO() {}

    public Long getEmploymentEducationPrimaryKey() {
        return employmentEducationPrimaryKey;
    }

    public void setEmploymentEducationPrimaryKey(Long employmentEducationPrimaryKey) {
        this.employmentEducationPrimaryKey = employmentEducationPrimaryKey;
    }

    public Long getEmploymentEducationID() {
        return employmentEducationID;
    }

    public void setEmploymentEducationID(Long employmentEducationID) {
        this.employmentEducationID = employmentEducationID;
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

    public Integer getEmployed() {
        return employed;
    }

    public void setEmployed(Integer employed) {
        this.employed = employed;
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

    public Integer getExportId() {
        return exportId;
    }

    public void setExportId(Integer exportId) {
        this.exportId = exportId;
    }
}
