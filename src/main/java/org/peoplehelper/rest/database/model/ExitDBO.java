package org.peoplehelper.rest.database.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "`Exit`")
public class ExitDBO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "exit_primary_key")
    private Long exitPrimaryKey;

    @Column(name = "ExitID")
    private Long exitID;

    @Column(name = "ProjectEntryID")
    private Long projectEntryID;

    @ManyToOne
    @JoinColumn(name = "PersonalID", referencedColumnName = "UUID")
    private ClientDBO clientDbo;

    @Column(name = "ExitDate")
    private String exitDate;

    @Column(name = "Destination")
    private Integer destination;

    // todo OtherDestination
    // todo AssessmentDisposition
    // todo OtherDisposition

    @Column(name = "HousingAssessment")
    private Integer housingAssessment;

    @Column(name = "SubsidyInformation")
    private Integer subsidyInformation;

    // todo ConnectionWithSOAR
    // todo WrittenAftercarePlan
    // todo AssistanceMainstreamBenefits
    // todo PermanentHousingPlacement
    // todo TemporaryShelterPlacement
    // todo ExitCounseling
    // todo FurtherFollowUpServices
    // todo ScheduledFollowUpContacts
    // todo ResourcePackage
    // todo OtherAftercarePlanOrAction

    @Column(name = "ProjectCompletionStatus")
    private Integer projectCompletionStatus;

    @Column(name = "EarlyExitReason")
    private Integer earlyExitReason;

    // todo FamilyReunificationAchieved

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

    public ExitDBO() {}

    public Long getExitPrimaryKey() {
        return exitPrimaryKey;
    }

    public void setExitPrimaryKey(Long exitPrimaryKey) {
        this.exitPrimaryKey = exitPrimaryKey;
    }

    public Long getExitID() {
        return exitID;
    }

    public void setExitID(Long exitID) {
        this.exitID = exitID;
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

    public String getExitDate() {
        return exitDate;
    }

    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }

    public Integer getDestination() {
        return destination;
    }

    public void setDestination(Integer destination) {
        this.destination = destination;
    }

    public Integer getHousingAssessment() {
        return housingAssessment;
    }

    public void setHousingAssessment(Integer housingAssessment) {
        this.housingAssessment = housingAssessment;
    }

    public Integer getSubsidyInformation() {
        return subsidyInformation;
    }

    public void setSubsidyInformation(Integer subsidyInformation) {
        this.subsidyInformation = subsidyInformation;
    }

    public Integer getProjectCompletionStatus() {
        return projectCompletionStatus;
    }

    public void setProjectCompletionStatus(Integer projectCompletionStatus) {
        this.projectCompletionStatus = projectCompletionStatus;
    }

    public Integer getEarlyExitReason() {
        return earlyExitReason;
    }

    public void setEarlyExitReason(Integer earlyExitReason) {
        this.earlyExitReason = earlyExitReason;
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
