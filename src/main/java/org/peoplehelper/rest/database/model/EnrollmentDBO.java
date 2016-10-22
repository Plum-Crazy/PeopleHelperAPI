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

    @ManyToOne
    @JoinColumn(name = "PersonalID", referencedColumnName = "UUID")
    private ClientDBO clientDbo;

    @Column(name = "ProjectId")
    private Integer projectId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EntryDate")
    private Date entryDate;

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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DateToStreetESSH")
    private Date dateToStreetEssh;

    @Column(name = "TimesHomelessPastThreeYears")
    private Integer timesHomelessPastThreeYears;

    @Column(name = "MonthsHomelessPastThreeYears")
    private Integer monthsHomelessPastThreeYears;

    @Column(name = "HousingStatus")
    private Integer housingStatus;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DateOfEngagement")
    private Date dateOfEngagement;

    @Column(name = "InPermanentHousing")
    private Boolean inPermanentHousing;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ResidentialMoveInDate")
    private Date residentialMoveInDate;

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
    private Date dateCreated;

    @Column(name = "DateUpdated")
    private Date dateUpdated;

    @Column(name = "UserID")
    private Long userId;

    @Column(name = "DateDeleted")
    private Date dateDeleted;

    @Column(name = "ExportID")
    private Integer exportId;

    public Long getEnrollementPrimaryKey() {
        return enrollementPrimaryKey;
    }

    public void setEnrollementPrimaryKey(Long enrollementPrimaryKey) {
        this.enrollementPrimaryKey = enrollementPrimaryKey;
    }
}
