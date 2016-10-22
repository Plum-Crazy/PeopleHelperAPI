package org.peoplehelper.rest.database.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Enrollment")
public class EnrollmentDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "enrollment_primary_key")
    private Long enrollementPrimaryKey;

    @Column(name = "ProjectEntryID")
    private Integer projectEntryId;


    private Integer personalId;

    private Integer projectId;

    private Date entryDate;

    private Integer householdId;

    private Integer relationshipToHoh;

    private Integer residencePrior;

    private String otherResidencePrior;

    private Integer residencePriorLengthOfStay;

    private Boolean disablignCondition;

    private Boolean entryFromStreetEssh;

    private Date dateToStreetEssh;

    private Integer timesHomelessPastThreeYears;

    private Integer monthsHomelessPastThreeYears;

    private Integer housingStatus;

    private Date dateOfEngagement;

    private Boolean inPermanentHousing;

    private Date residentialMoveInDate;

    private Integer percentAmi;

    private String lastPermanentStreet;

    private String lastPermanentCity;

    private String lastPermanentState;

    private String lastPermanentZip;

    public Integer getProjectEntryId() {
        return projectEntryId;
    }

    public void setProjectEntryId(Integer projectEntryId) {
        this.projectEntryId = projectEntryId;
    }

    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
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

    public Boolean getDisablignCondition() {
        return disablignCondition;
    }

    public void setDisablignCondition(Boolean disablignCondition) {
        this.disablignCondition = disablignCondition;
    }

    public Boolean getEntryFromStreetEssh() {
        return entryFromStreetEssh;
    }

    public void setEntryFromStreetEssh(Boolean entryFromStreetEssh) {
        this.entryFromStreetEssh = entryFromStreetEssh;
    }

    public Date getDateToStreetEssh() {
        return dateToStreetEssh;
    }

    public void setDateToStreetEssh(Date dateToStreetEssh) {
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

    public Date getDateOfEngagement() {
        return dateOfEngagement;
    }

    public void setDateOfEngagement(Date dateOfEngagement) {
        this.dateOfEngagement = dateOfEngagement;
    }

    public Boolean getInPermanentHousing() {
        return inPermanentHousing;
    }

    public void setInPermanentHousing(Boolean inPermanentHousing) {
        this.inPermanentHousing = inPermanentHousing;
    }

    public Date getResidentialMoveInDate() {
        return residentialMoveInDate;
    }

    public void setResidentialMoveInDate(Date residentialMoveInDate) {
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

    private Integer addressDataQuality;

    private Integer hpScreeningScore;

    private Integer vamcStation;

    private Date dateCreated;

    private Date dateUpdated;

    private Long userId;

    private Date dateDeleted;

    private Integer exportId;

    public Long getEnrollementPrimaryKey() {
        return enrollementPrimaryKey;
    }

    public void setEnrollementPrimaryKey(Long enrollementPrimaryKey) {
        this.enrollementPrimaryKey = enrollementPrimaryKey;
    }
}
