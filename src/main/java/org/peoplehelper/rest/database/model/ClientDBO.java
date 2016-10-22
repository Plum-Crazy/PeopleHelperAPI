package org.peoplehelper.rest.database.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Client")
public class ClientDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_primary_key")
    private Long clientPrimaryKey;

    @Column(name = "UUID")
    private Long uuid;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Middle_Name")
    private String middleName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Name_Data_Quality")
    private Integer nameDataQuality;

    @Column(name = "SSN")
    private Integer ssn;

    @Column(name = "SSNDataQuality")
    private Integer ssnDataQuality;

    @Column(name = "DOB")
    private String dob;

    @Column(name = "DOBDataQuality")
    private Integer dobDataQuality;

    @Column(name = "AmIndAKNative")
    private Boolean amIndAKNative;

    @Column(name = "Asian")
    private Boolean asian;

    @Column(name = "Black")
    private Boolean black;

    @Column(name = "NativeHIOtherPacific")
    private Boolean nativeHIOtherPacific;

    @Column(name = "White")
    private Boolean white;

    @Column(name = "RaceNone")
    private Boolean raceNone;

    @Column(name = "Gender")
    private Integer gender;

    @Column(name = "OtherGender")
    private Boolean otherGender;

    @Column(name = "VeteranStatus")
    private Integer veteranStatus;

    @Column(name = "YearEnteredService")
    private Integer yearEnteredService;

    @Column(name = "YearSeparated")
    private Integer yearSeparated;

    @Column(name = "WorldWarII")
    private Boolean worldWar2;

    @Column(name = "KoreanWar")
    private Boolean koreanWar;

    @Column(name = "VietnamWar")
    private Boolean vietnamWar;

    @Column(name = "DesertStorm")
    private Boolean desertStorm;

    @Column(name = "AfghanistanOEF")
    private Boolean afghanistanOEF;

    @Column(name = "IraqOIF")
    private Boolean iraqOIF;

    @Column(name = "IraqOND")
    private Boolean iraqOND;

    @Column(name = "OtherTheater")
    private Boolean otherTheater;

    @Column(name = "MilitaryBranch")
    private Integer militaryBranch;

    @Column(name = "Discharge_Status")
    private Integer dischargeStatus;

    @Column(name = "Date_Created")
    private String dateCreated;

    @Column(name = "DateUpdated")
    private String dateUpdated;

    @Column(name = "UserID")
    private Integer userID;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "clientDbo")
    private List<DisabilityDBO> disabilityDBOs = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "clientDbo")
    private List<EmploymentEducationDBO> employmentEducationDBOs = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "clientDbo")
    private List<ExitDBO> exitDBOs = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "clientDbo")
    private List<EnrollmentDBO> enrollmentDBOs = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "clientDbo")
    private List<HealthAndDVDBO> healthAndDVDBOs = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "clientDbo")
    private List<ServicesDBO> servicesDBOs = new ArrayList<>();

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public List<DisabilityDBO> getDisabilityDBOs() {
        return disabilityDBOs;
    }

    public void setDisabilityDBOs(List<DisabilityDBO> disabilityDBOs) {
        this.disabilityDBOs = disabilityDBOs;
    }

    public ClientDBO() {}

    public long getUuid() {
        return uuid;
    }

    public void setUuid(long uuid) {
        this.uuid = uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNameDataQuality() {
        return nameDataQuality;
    }

    public void setNameDataQuality(Integer nameDataQuality) {
        this.nameDataQuality = nameDataQuality;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    public Integer getSsnDataQuality() {
        return ssnDataQuality;
    }

    public void setSsnDataQuality(Integer ssnDataQuality) {
        this.ssnDataQuality = ssnDataQuality;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Integer getDobDataQuality() {
        return dobDataQuality;
    }

    public void setDobDataQuality(Integer dobDataQuality) {
        this.dobDataQuality = dobDataQuality;
    }

    public Boolean getAmIndAKNative() {
        return amIndAKNative;
    }

    public void setAmIndAKNative(Boolean amIndAKNative) {
        this.amIndAKNative = amIndAKNative;
    }

    public Boolean getAsian() {
        return asian;
    }

    public void setAsian(Boolean asian) {
        this.asian = asian;
    }

    public Boolean getBlack() {
        return black;
    }

    public void setBlack(Boolean black) {
        this.black = black;
    }

    public Boolean getNativeHIOtherPacific() {
        return nativeHIOtherPacific;
    }

    public void setNativeHIOtherPacific(Boolean nativeHIOtherPacific) {
        this.nativeHIOtherPacific = nativeHIOtherPacific;
    }

    public Boolean getWhite() {
        return white;
    }

    public void setWhite(Boolean white) {
        this.white = white;
    }

    public Boolean getRaceNone() {
        return raceNone;
    }

    public void setRaceNone(Boolean raceNone) {
        this.raceNone = raceNone;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Boolean getOtherGender() {
        return otherGender;
    }

    public void setOtherGender(Boolean otherGender) {
        this.otherGender = otherGender;
    }

    public Integer getVeteranStatus() {
        return veteranStatus;
    }

    public void setVeteranStatus(Integer veteranStatus) {
        this.veteranStatus = veteranStatus;
    }

    public Integer getYearEnteredService() {
        return yearEnteredService;
    }

    public void setYearEnteredService(Integer yearEnteredService) {
        this.yearEnteredService = yearEnteredService;
    }

    public Integer getYearSeparated() {
        return yearSeparated;
    }

    public void setYearSeparated(Integer yearSeparated) {
        this.yearSeparated = yearSeparated;
    }

    public Boolean getWorldWar2() {
        return worldWar2;
    }

    public void setWorldWar2(Boolean worldWar2) {
        this.worldWar2 = worldWar2;
    }

    public Boolean getKoreanWar() {
        return koreanWar;
    }

    public void setKoreanWar(Boolean koreanWar) {
        this.koreanWar = koreanWar;
    }

    public Boolean getVietnamWar() {
        return vietnamWar;
    }

    public void setVietnamWar(Boolean vietnamWar) {
        this.vietnamWar = vietnamWar;
    }

    public Boolean getDesertStorm() {
        return desertStorm;
    }

    public void setDesertStorm(Boolean desertStorm) {
        this.desertStorm = desertStorm;
    }

    public Boolean getAfghanistanOEF() {
        return afghanistanOEF;
    }

    public void setAfghanistanOEF(Boolean afghanistanOEF) {
        this.afghanistanOEF = afghanistanOEF;
    }

    public Boolean getIraqOIF() {
        return iraqOIF;
    }

    public void setIraqOIF(Boolean iraqOIF) {
        this.iraqOIF = iraqOIF;
    }

    public Boolean getIraqOND() {
        return iraqOND;
    }

    public void setIraqOND(Boolean iraqOND) {
        this.iraqOND = iraqOND;
    }

    public Boolean getOtherTheater() {
        return otherTheater;
    }

    public void setOtherTheater(Boolean otherTheater) {
        this.otherTheater = otherTheater;
    }

    public Integer getMilitaryBranch() {
        return militaryBranch;
    }

    public void setMilitaryBranch(Integer militaryBranch) {
        this.militaryBranch = militaryBranch;
    }

    public Integer getDischargeStatus() {
        return dischargeStatus;
    }

    public void setDischargeStatus(Integer dischargeStatus) {
        this.dischargeStatus = dischargeStatus;
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

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Long getClientPrimaryKey() {
        return clientPrimaryKey;
    }

    public void setClientPrimaryKey(Long clientPrimaryKey) {
        this.clientPrimaryKey = clientPrimaryKey;
    }

    public List<EmploymentEducationDBO> getEmploymentEducationDBOs() {
        return employmentEducationDBOs;
    }

    public void setEmploymentEducationDBOs(List<EmploymentEducationDBO> employmentEducationDBOs) {
        this.employmentEducationDBOs = employmentEducationDBOs;
    }

    public List<ExitDBO> getExitDBOs() {
        return exitDBOs;
    }

    public void setExitDBOs(List<ExitDBO> exitDBOs) {
        this.exitDBOs = exitDBOs;
    }

    public List<EnrollmentDBO> getEnrollmentDBOs() {
        return enrollmentDBOs;
    }

    public void setEnrollmentDBOs(List<EnrollmentDBO> enrollmentDBOs) {
        this.enrollmentDBOs = enrollmentDBOs;
    }

    public List<HealthAndDVDBO> getHealthAndDVDBOs() {
        return healthAndDVDBOs;
    }

    public void setHealthAndDVDBOs(List<HealthAndDVDBO> healthAndDVDBOs) {
        this.healthAndDVDBOs = healthAndDVDBOs;
    }
}
