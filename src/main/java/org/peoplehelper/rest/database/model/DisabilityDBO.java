package org.peoplehelper.rest.database.model;

import javax.persistence.*;
import javax.print.attribute.IntegerSyntax;
import java.util.Date;

@Entity
@Table(name = "Disabilities")
public class DisabilityDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "disability_primary_key")
    private Long disabilityPrimaryKey;

    @Column(name = "DisabilitiesId")
    private String disabilitiesId;

    @Column(name = "ProjectEntryID")
    private Integer ProjectEntryId;

    @ManyToOne
    @JoinColumn(name = "PersonalID", referencedColumnName = "UUID")
    private ClientDBO clientDbo;

    @Column(name = "InformationDate")
    private Date informationDate;

    @Column(name = "DisabilityType")
    private Integer disabilityType;

    @Column(name = "DisabilityResponse")
    private Boolean disabilityResponse;

    @Column(name = "IndefiniteAndImpairs")
    private Boolean indefiniteAndImpairs;

    @Column(name = "DocumentationOnFile")
    private Boolean documentationOnFile;

    @Column(name = "ReceivingServices")
    private Boolean recievingServices;

    @Column(name = "DataCollectionStage")
    private Integer dataCollectionStage;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DateCreated")
    private Date dateCreated;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DateUpdated")
    private Date dateUpdated;

    @Column(name = "UserID")
    private Long userId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DateDeleted")
    private Date dateDeleted;

    @Column(name = "ExportID")
    private Integer exportId;

    public ClientDBO getClientDbo() {
        return clientDbo;
    }

    public void setClientDbo(ClientDBO clientDbo) {
        this.clientDbo = clientDbo;
    }

    public Long getDisabilityPrimaryKey() {
        return disabilityPrimaryKey;
    }

    public void setDisabilityPrimaryKey(Long disabilityPrimaryKey) {
        this.disabilityPrimaryKey = disabilityPrimaryKey;
    }

    public String getDisabilitiesId() {
        return disabilitiesId;
    }

    public void setDisabilitiesId(String disabilitiesId) {
        this.disabilitiesId = disabilitiesId;
    }

    public Integer getProjectEntryId() {
        return ProjectEntryId;
    }

    public void setProjectEntryId(Integer projectEntryId) {
        ProjectEntryId = projectEntryId;
    }


    public Date getInformationDate() {
        return informationDate;
    }

    public void setInformationDate(Date informationDate) {
        this.informationDate = informationDate;
    }

    public Integer getDisabilityType() {
        return disabilityType;
    }

    public void setDisabilityType(Integer disabilityType) {
        this.disabilityType = disabilityType;
    }

    public Boolean getDisabilityResponse() {
        return disabilityResponse;
    }

    public void setDisabilityResponse(Boolean disabilityResponse) {
        this.disabilityResponse = disabilityResponse;
    }

    public Boolean getIndefiniteAndImpairs() {
        return indefiniteAndImpairs;
    }

    public void setIndefiniteAndImpairs(Boolean indefiniteAndImpairs) {
        this.indefiniteAndImpairs = indefiniteAndImpairs;
    }

    public Boolean getDocumentationOnFile() {
        return documentationOnFile;
    }

    public void setDocumentationOnFile(Boolean documentationOnFile) {
        this.documentationOnFile = documentationOnFile;
    }

    public Boolean getRecievingServices() {
        return recievingServices;
    }

    public void setRecievingServices(Boolean recievingServices) {
        this.recievingServices = recievingServices;
    }

    public Integer getDataCollectionStage() {
        return dataCollectionStage;
    }

    public void setDataCollectionStage(Integer dataCollectionStage) {
        this.dataCollectionStage = dataCollectionStage;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getDateDeleted() {
        return dateDeleted;
    }

    public void setDateDeleted(Date dateDeleted) {
        this.dateDeleted = dateDeleted;
    }

    public Integer getExportId() {
        return exportId;
    }

    public void setExportId(Integer exportId) {
        this.exportId = exportId;
    }
}
