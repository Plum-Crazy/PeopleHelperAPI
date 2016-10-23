package org.peoplehelper.rest.database.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Enrollment")
public class EnrollmentDBO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "enrollment_primary_key")
    private Long enrollmentPrimaryKey;

    @Column(name = "ProjectEntryID")
    private Integer projectEntryId;

    @ManyToOne
    @JoinColumn(name = "PersonalID", referencedColumnName = "UUID")
    private ClientDBO clientDbo;

    @Column(name = "ProjectId")
    private Integer projectId;

    @Column(name = "EntryDate")
    private String entryDate;

    @Column(name = "HouseholdId")
    private Integer householdId;

    @Column(name = "RelationshipToHoH")
    private Integer relationshipToHoh;

    @Column(name = "ResidencePrior")
    private Integer residencePrior;

    @Column(name = "OtherResidencePrior")
    private String otherResidencePrior;

    @Column(name = "ResidencePriorLengthOfStay")
    private Integer residencePriorLengthOfStay;

    @Column(name = "DisablingCondition")
    private Boolean disablingCondition;

    @Column(name = "EntryFromStreetESSH")
    private Boolean entryFromStreetEssh;

    @Column(name = "DateToStreetESSH")
    private String dateToStreetEssh;

    @Column(name = "TimesHomelessPastThreeYears")
    private Integer timesHomelessPastThreeYears;

    @Column(name = "MonthsHomelessPastThreeYears")
    private Integer monthsHomelessPastThreeYears;

    @Column(name = "HousingStatus")
    private Integer housingStatus;

    @Column(name = "DateOfEngagement")
    private String dateOfEngagement;

    @Column(name = "InPermanentHousing")
    private Boolean inPermanentHousing;

    @Column(name = "ResidentialMoveInDate")
    private String residentialMoveInDate;

    @Column(name = "PercentAMI")
    private Integer percentAmi;

    @Column(name = "LastPermanentStreet")
    private String lastPermanentStreet;

    @Column(name = "LastPermanentCity")
    private String lastPermanentCity;

    @Column(name = "LastPermanentState")
    private String lastPermanentState;

    @Column(name = "LastPermanentZIP")
    private String lastPermanentZip;

    @Column(name = "AddressDataQuality")
    private Integer addressDataQuality;

    @Column(name = "HPScreeningScore")
    private Integer hpScreeningScore;

    @Column(name = "VAMCStation")
    private Integer vamcStation;

    @Column(name = "DateCreated")
    private String dateCreated;

    @Column(name = "DateUpdated")
    private String dateUpdated;

    @Column(name = "UserID")
    private Long userId;

    @Column(name = "DateDeleted")
    private Date dateDeleted;

    @Column(name = "ExportID")
    private Integer exportId;

    public Long getEnrollementPrimaryKey() {
        return enrollmentPrimaryKey;
    }

    public void setEnrollementPrimaryKey(Long enrollementPrimaryKey) {
        this.enrollmentPrimaryKey = enrollementPrimaryKey;
    }

    public Long getEnrollmentPrimaryKey() {
        return enrollmentPrimaryKey;
    }

    public void setEnrollmentPrimaryKey(Long enrollmentPrimaryKey) {
        this.enrollmentPrimaryKey = enrollmentPrimaryKey;
    }

    public Integer getProjectEntryId() {
        return projectEntryId;
    }

    public void setProjectEntryId(Integer projectEntryId) {
        this.projectEntryId = projectEntryId;
    }

    public ClientDBO getClientDbo() {
        return clientDbo;
    }

    public void setClientDbo(ClientDBO clientDbo) {
        this.clientDbo = clientDbo;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public Integer getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Integer householdId) {
        this.householdId = householdId;
    }

    public Integer getRelationshipToHoh() {
        return relationshipToHoh;
    }

    public void setRelationshipToHoh(Integer relationshipToHoh) {
        this.relationshipToHoh = relationshipToHoh;
    }

    public Integer getResidencePrior() {
        return residencePrior;
    }

    public void setResidencePrior(Integer residencePrior) {
        this.residencePrior = residencePrior;
    }

    public String getOtherResidencePrior() {
        return otherResidencePrior;
    }

    public void setOtherResidencePrior(String otherResidencePrior) {
        this.otherResidencePrior = otherResidencePrior;
    }

    public Integer getResidencePriorLengthOfStay() {
        return residencePriorLengthOfStay;
    }

    public void setResidencePriorLengthOfStay(Integer residencePriorLengthOfStay) {
        this.residencePriorLengthOfStay = residencePriorLengthOfStay;
    }

    public Boolean getDisablingCondition() {
        return disablingCondition;
    }

    public void setDisablingCondition(Boolean disablingCondition) {
        this.disablingCondition = disablingCondition;
    }

    public Boolean getEntryFromStreetEssh() {
        return entryFromStreetEssh;
    }

    public void setEntryFromStreetEssh(Boolean entryFromStreetEssh) {
        this.entryFromStreetEssh = entryFromStreetEssh;
    }

    public String getDateToStreetEssh() {
        return dateToStreetEssh;
    }

    public void setDateToStreetEssh(String dateToStreetEssh) {
        this.dateToStreetEssh = dateToStreetEssh;
    }

    public Integer getTimesHomelessPastThreeYears() {
        return timesHomelessPastThreeYears;
    }

    public void setTimesHomelessPastThreeYears(Integer timesHomelessPastThreeYears) {
        this.timesHomelessPastThreeYears = timesHomelessPastThreeYears;
    }

    public Integer getMonthsHomelessPastThreeYears() {
        return monthsHomelessPastThreeYears;
    }

    public void setMonthsHomelessPastThreeYears(Integer monthsHomelessPastThreeYears) {
        this.monthsHomelessPastThreeYears = monthsHomelessPastThreeYears;
    }

    public Integer getHousingStatus() {
        return housingStatus;
    }

    public void setHousingStatus(Integer housingStatus) {
        this.housingStatus = housingStatus;
    }

    public String getDateOfEngagement() {
        return dateOfEngagement;
    }

    public void setDateOfEngagement(String dateOfEngagement) {
        this.dateOfEngagement = dateOfEngagement;
    }

    public Boolean getInPermanentHousing() {
        return inPermanentHousing;
    }

    public void setInPermanentHousing(Boolean inPermanentHousing) {
        this.inPermanentHousing = inPermanentHousing;
    }

    public String getResidentialMoveInDate() {
        return residentialMoveInDate;
    }

    public void setResidentialMoveInDate(String residentialMoveInDate) {
        this.residentialMoveInDate = residentialMoveInDate;
    }

    public Integer getPercentAmi() {
        return percentAmi;
    }

    public void setPercentAmi(Integer percentAmi) {
        this.percentAmi = percentAmi;
    }

    public String getLastPermanentStreet() {
        return lastPermanentStreet;
    }

    public void setLastPermanentStreet(String lastPermanentStreet) {
        this.lastPermanentStreet = lastPermanentStreet;
    }

    public String getLastPermanentCity() {
        return lastPermanentCity;
    }

    public void setLastPermanentCity(String lastPermanentCity) {
        this.lastPermanentCity = lastPermanentCity;
    }

    public String getLastPermanentState() {
        return lastPermanentState;
    }

    public void setLastPermanentState(String lastPermanentState) {
        this.lastPermanentState = lastPermanentState;
    }

    public String getLastPermanentZip() {
        return lastPermanentZip;
    }

    public void setLastPermanentZip(String lastPermanentZip) {
        this.lastPermanentZip = lastPermanentZip;
    }

    public Integer getAddressDataQuality() {
        return addressDataQuality;
    }

    public void setAddressDataQuality(Integer addressDataQuality) {
        this.addressDataQuality = addressDataQuality;
    }

    public Integer getHpScreeningScore() {
        return hpScreeningScore;
    }

    public void setHpScreeningScore(Integer hpScreeningScore) {
        this.hpScreeningScore = hpScreeningScore;
    }

    public Integer getVamcStation() {
        return vamcStation;
    }

    public void setVamcStation(Integer vamcStation) {
        this.vamcStation = vamcStation;
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
