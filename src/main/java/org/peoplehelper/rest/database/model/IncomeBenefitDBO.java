package org.peoplehelper.rest.database.model;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "IncomeBenefits")
public class IncomeBenefitDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "income_benefit_primary_key")
    private Long incomeBenefitPrimaryKey;

    @Column(name = "IncomeBenefitsID")
    private Long incomeBenefitsId;

    @Column(name = "ProjectEntryID")
    private Long projectEntryId;

    @ManyToOne
    @JoinColumn(name = "PersonalID", referencedColumnName = "UUID")
    private ClientDBO clientDbo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "InformationDate")
    private Date informationDate;

    @Column(name = "IncomeFromAnySource")
    private Boolean incomeFromAnySource;

    @Column(name = "TotalMonthlyIncome")
    private Double totalMonthlyIncome;

    @Column(name = "Earned")
    private Boolean earned;

    @Column(name = "EarnedAmount")
    private Double earnedAmount;

    @Column(name = "Unemployment")
    private Boolean unemployment;

    @Column(name = "UnemploymentAmount")
    private Double unemploymentAmount;

    @Column(name = "SSI")
    private Boolean ssi;

    @Column(name = "ssiAmount")
    private Double ssiAmount;

    @Column(name = "SSDI")
    private Boolean ssdi;

    @Column(name = "SSDIAmount")
    private Double ssdiAmount;

    @Column(name = "VADisabilityService")
    private Boolean vaDisabilityService;

    @Column(name = "VADisabilityServiceAmount")
    private Double vaDisabilityServiceAmount;

    @Column(name = "VADisabilityNonService")
    private Boolean vaDisabilityNonService;

    @Column(name = "VADisabilityNonServiceAmount")
    private Double vaDisabilityNonServiceAmount;

    @Column(name = "PrivateDisability")
    private Boolean privateDisability;

    @Column(name = "PrivateDisabilityAmount")
    private Double privateDisabilityAmount;

    @Column(name = "WorkersComp")
    private Boolean workersComp;

    @Column(name = "WorkersCompAmount")
    private Double workersCompAmount;

    @Column(name = "TANF")
    private Boolean tanf;

    @Column(name = "TANFAmount")
    private Double tanfAmount;

    @Column(name = "GA")
    private Boolean ga;

    @Column(name = "GAAmount")
    private Double gaAmount;

    @Column(name = "SocSecRetirement")
    private Boolean socialSecurityRetirement;

    @Column(name = "SocSecRetirementAmount")
    private Double socialSecurityRetirementAmount;

    @Column(name = "Pension")
    private Boolean pension;

    @Column(name = "PensionAmount")
    private Double pensionAmount;

    @Column(name = "ChildSupport")
    private Boolean childSupport;

    @Column(name = "ChildSupportAmount")
    private Double childSupportAmount;

    @Column(name = "Alimony")
    private Boolean alimony;

    @Column(name = "AlimonyAmount")
    private Double alimoneyAmount;

    @Column(name = "OtherIncomeSource")
    private Boolean otherIncomeSource;

    @Column(name = "OtherIncomeSourceAmount")
    private Double ootherIncomeSourceAmount;

    @Column(name = "IOtherIncomeSourceIdentify")
    private String otherIncomeSourceIdentify;

    @Column(name = "BenefitsFromAnySource")
    private Boolean benefitsFromAnySource;

    @Column(name = "SNAP")
    private Boolean snap;

    @Column(name = "WIC")
    private Boolean wic;

    @Column(name = "TANFChildCare")
    private Boolean tanfChildCare;

    @Column(name = "TANFTransportation")
    private Boolean tanfTransportation;

    @Column(name = "OtherTANF")
    private Boolean otherTanf;

    @Column(name = "RentalAssistanceOngoing")
    private Boolean rentalAssistanceOnGoing;

    @Column(name = "RentalAssistanceTemp")
    private Boolean rentalAssistanceTemp;

    @Column(name = "OtherBenefitsSource")
    private Boolean otherBenefitsSource;

    @Column(name = "OtherBenefitsSourceIdentify")
    private String otherBenefitsSourceIdentify;

    @Column(name = "InsuranceFromAnySource")
    private Boolean insuranceFromAnySource;

    @Column(name = "Medicaid")
    private Boolean medicaid;

    @Column(name = "NoMedicaidReason")
    private String noMedicaidReason;

    @Column(name = "Medicare")
    private Boolean medicare;

    @Column(name = "NoMedicareReason")
    private String noMedicareReason;

    @Column(name = "SCHIP")
    private Boolean schip;

    @Column(name = "NoSCHIPReason")
    private String noSCHIPReason;

    @Column(name = "VAMedicalServices")
    private Boolean vaMedicalServices;

    @Column(name = "NoVAMedReason")
    private String noVamedicalServicesReason;

    @Column(name = "EmployerProvided")
    private Boolean employerProvided;

    @Column(name = "NoEmployerProvided")
    private String noEmployerProvidedReason;

    @Column(name = "COBRA")
    private Boolean cobra;

    @Column(name = "NoCOBRAReason")
    private String noCobraReason;

    @Column(name = "privatePay")
    private Boolean privatePay;

    @Column(name = "NoPrivatePayReason")
    private String noPrivatePayReason;

    @Column(name = "StateHealthIns")
    private Boolean stateHealthInsurance;

    @Column(name = "NoStateHealthInsReason")
    private String noStateHealthInsuranceReason;

    @Column(name = "HIVAIDSAssistance")
    private Boolean hivAidsAssistance;

    @Column(name = "NoHIVAIDSAssistanceAssistance")
    private String noHivAidsAssistance;

    @Column(name = "ADAP")
    private Boolean adap;

    @Column(name = "NoADAPReason")
    private String noAdapReason;

    @Column(name = "DataCollectionStage")
    private Integer dataCollectionStage;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DateCreated")
    private Date dateCreated;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DateUpdated")
    private Date dateUpdated;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DateDeleted")
    private Date dateDeleted;

    @Column(name = "UserID")
    private Long userId;

    @Column(name = "ExportID")
    private Integer exportId;

    public Long getIncomeBenefitPrimaryKey() {
        return incomeBenefitPrimaryKey;
    }

    public void setIncomeBenefitPrimaryKey(Long incomeBenefitPrimaryKey) {
        this.incomeBenefitPrimaryKey = incomeBenefitPrimaryKey;
    }

    public Long getIncomeBenefitsId() {
        return incomeBenefitsId;
    }

    public void setIncomeBenefitsId(Long incomeBenefitsId) {
        this.incomeBenefitsId = incomeBenefitsId;
    }

    public Long getProjectEntryId() {
        return projectEntryId;
    }

    public void setProjectEntryId(Long projectEntryId) {
        this.projectEntryId = projectEntryId;
    }

    public ClientDBO getClientDbo() {
        return clientDbo;
    }

    public void setClientDbo(ClientDBO clientDbo) {
        this.clientDbo = clientDbo;
    }

    public Date getInformationDate() {
        return informationDate;
    }

    public void setInformationDate(Date informationDate) {
        this.informationDate = informationDate;
    }

    public Boolean getIncomeFromAnySource() {
        return incomeFromAnySource;
    }

    public void setIncomeFromAnySource(Boolean incomeFromAnySource) {
        this.incomeFromAnySource = incomeFromAnySource;
    }

    public Double getTotalMonthlyIncome() {
        return totalMonthlyIncome;
    }

    public void setTotalMonthlyIncome(Double totalMonthlyIncome) {
        this.totalMonthlyIncome = totalMonthlyIncome;
    }

    public Boolean getEarned() {
        return earned;
    }

    public void setEarned(Boolean earned) {
        this.earned = earned;
    }

    public Double getEarnedAmount() {
        return earnedAmount;
    }

    public void setEarnedAmount(Double earnedAmount) {
        this.earnedAmount = earnedAmount;
    }

    public Boolean getUnemployment() {
        return unemployment;
    }

    public void setUnemployment(Boolean unemployment) {
        this.unemployment = unemployment;
    }

    public Double getUnemploymentAmount() {
        return unemploymentAmount;
    }

    public void setUnemploymentAmount(Double unemploymentAmount) {
        this.unemploymentAmount = unemploymentAmount;
    }

    public Boolean getSsi() {
        return ssi;
    }

    public void setSsi(Boolean ssi) {
        this.ssi = ssi;
    }

    public Double getSsiAmount() {
        return ssiAmount;
    }

    public void setSsiAmount(Double ssiAmount) {
        this.ssiAmount = ssiAmount;
    }

    public Boolean getSsdi() {
        return ssdi;
    }

    public void setSsdi(Boolean ssdi) {
        this.ssdi = ssdi;
    }

    public Double getSsdiAmount() {
        return ssdiAmount;
    }

    public void setSsdiAmount(Double ssdiAmount) {
        this.ssdiAmount = ssdiAmount;
    }

    public Boolean getVaDisabilityService() {
        return vaDisabilityService;
    }

    public void setVaDisabilityService(Boolean vaDisabilityService) {
        this.vaDisabilityService = vaDisabilityService;
    }

    public Double getVaDisabilityServiceAmount() {
        return vaDisabilityServiceAmount;
    }

    public void setVaDisabilityServiceAmount(Double vaDisabilityServiceAmount) {
        this.vaDisabilityServiceAmount = vaDisabilityServiceAmount;
    }

    public Boolean getVaDisabilityNonService() {
        return vaDisabilityNonService;
    }

    public void setVaDisabilityNonService(Boolean vaDisabilityNonService) {
        this.vaDisabilityNonService = vaDisabilityNonService;
    }

    public Double getVaDisabilityNonServiceAmount() {
        return vaDisabilityNonServiceAmount;
    }

    public void setVaDisabilityNonServiceAmount(Double vaDisabilityNonServiceAmount) {
        this.vaDisabilityNonServiceAmount = vaDisabilityNonServiceAmount;
    }

    public Boolean getPrivateDisability() {
        return privateDisability;
    }

    public void setPrivateDisability(Boolean privateDisability) {
        this.privateDisability = privateDisability;
    }

    public Double getPrivateDisabilityAmount() {
        return privateDisabilityAmount;
    }

    public void setPrivateDisabilityAmount(Double privateDisabilityAmount) {
        this.privateDisabilityAmount = privateDisabilityAmount;
    }

    public Boolean getWorkersComp() {
        return workersComp;
    }

    public void setWorkersComp(Boolean workersComp) {
        this.workersComp = workersComp;
    }

    public Double getWorkersCompAmount() {
        return workersCompAmount;
    }

    public void setWorkersCompAmount(Double workersCompAmount) {
        this.workersCompAmount = workersCompAmount;
    }

    public Boolean getTanf() {
        return tanf;
    }

    public void setTanf(Boolean tanf) {
        this.tanf = tanf;
    }

    public Double getTanfAmount() {
        return tanfAmount;
    }

    public void setTanfAmount(Double tanfAmount) {
        this.tanfAmount = tanfAmount;
    }

    public Boolean getGa() {
        return ga;
    }

    public void setGa(Boolean ga) {
        this.ga = ga;
    }

    public Double getGaAmount() {
        return gaAmount;
    }

    public void setGaAmount(Double gaAmount) {
        this.gaAmount = gaAmount;
    }

    public Boolean getSocialSecurityRetirement() {
        return socialSecurityRetirement;
    }

    public void setSocialSecurityRetirement(Boolean socialSecurityRetirement) {
        this.socialSecurityRetirement = socialSecurityRetirement;
    }

    public Double getSocialSecurityRetirementAmount() {
        return socialSecurityRetirementAmount;
    }

    public void setSocialSecurityRetirementAmount(Double socialSecurityRetirementAmount) {
        this.socialSecurityRetirementAmount = socialSecurityRetirementAmount;
    }

    public Boolean getPension() {
        return pension;
    }

    public void setPension(Boolean pension) {
        this.pension = pension;
    }

    public Double getPensionAmount() {
        return pensionAmount;
    }

    public void setPensionAmount(Double pensionAmount) {
        this.pensionAmount = pensionAmount;
    }

    public Boolean getChildSupport() {
        return childSupport;
    }

    public void setChildSupport(Boolean childSupport) {
        this.childSupport = childSupport;
    }

    public Double getChildSupportAmount() {
        return childSupportAmount;
    }

    public void setChildSupportAmount(Double childSupportAmount) {
        this.childSupportAmount = childSupportAmount;
    }

    public Boolean getAlimony() {
        return alimony;
    }

    public void setAlimony(Boolean alimony) {
        this.alimony = alimony;
    }

    public Double getAlimoneyAmount() {
        return alimoneyAmount;
    }

    public void setAlimoneyAmount(Double alimoneyAmount) {
        this.alimoneyAmount = alimoneyAmount;
    }

    public Boolean getOtherIncomeSource() {
        return otherIncomeSource;
    }

    public void setOtherIncomeSource(Boolean otherIncomeSource) {
        this.otherIncomeSource = otherIncomeSource;
    }

    public Double getOotherIncomeSourceAmount() {
        return ootherIncomeSourceAmount;
    }

    public void setOotherIncomeSourceAmount(Double ootherIncomeSourceAmount) {
        this.ootherIncomeSourceAmount = ootherIncomeSourceAmount;
    }

    public String getOtherIncomeSourceIdentify() {
        return otherIncomeSourceIdentify;
    }

    public void setOtherIncomeSourceIdentify(String otherIncomeSourceIdentify) {
        this.otherIncomeSourceIdentify = otherIncomeSourceIdentify;
    }

    public Boolean getBenefitsFromAnySource() {
        return benefitsFromAnySource;
    }

    public void setBenefitsFromAnySource(Boolean benefitsFromAnySource) {
        this.benefitsFromAnySource = benefitsFromAnySource;
    }

    public Boolean getSnap() {
        return snap;
    }

    public void setSnap(Boolean snap) {
        this.snap = snap;
    }

    public Boolean getWic() {
        return wic;
    }

    public void setWic(Boolean wic) {
        this.wic = wic;
    }

    public Boolean getTanfChildCare() {
        return tanfChildCare;
    }

    public void setTanfChildCare(Boolean tanfChildCare) {
        this.tanfChildCare = tanfChildCare;
    }

    public Boolean getTanfTransportation() {
        return tanfTransportation;
    }

    public void setTanfTransportation(Boolean tanfTransportation) {
        this.tanfTransportation = tanfTransportation;
    }

    public Boolean getOtherTanf() {
        return otherTanf;
    }

    public void setOtherTanf(Boolean otherTanf) {
        this.otherTanf = otherTanf;
    }

    public Boolean getRentalAssistanceOnGoing() {
        return rentalAssistanceOnGoing;
    }

    public void setRentalAssistanceOnGoing(Boolean rentalAssistanceOnGoing) {
        this.rentalAssistanceOnGoing = rentalAssistanceOnGoing;
    }

    public Boolean getRentalAssistanceTemp() {
        return rentalAssistanceTemp;
    }

    public void setRentalAssistanceTemp(Boolean rentalAssistanceTemp) {
        this.rentalAssistanceTemp = rentalAssistanceTemp;
    }

    public Boolean getOtherBenefitsSource() {
        return otherBenefitsSource;
    }

    public void setOtherBenefitsSource(Boolean otherBenefitsSource) {
        this.otherBenefitsSource = otherBenefitsSource;
    }

    public String getOtherBenefitsSourceIdentify() {
        return otherBenefitsSourceIdentify;
    }

    public void setOtherBenefitsSourceIdentify(String otherBenefitsSourceIdentify) {
        this.otherBenefitsSourceIdentify = otherBenefitsSourceIdentify;
    }

    public Boolean getInsuranceFromAnySource() {
        return insuranceFromAnySource;
    }

    public void setInsuranceFromAnySource(Boolean insuranceFromAnySource) {
        this.insuranceFromAnySource = insuranceFromAnySource;
    }

    public Boolean getMedicaid() {
        return medicaid;
    }

    public void setMedicaid(Boolean medicaid) {
        this.medicaid = medicaid;
    }

    public String getNoMedicaidReason() {
        return noMedicaidReason;
    }

    public void setNoMedicaidReason(String noMedicaidReason) {
        this.noMedicaidReason = noMedicaidReason;
    }

    public Boolean getMedicare() {
        return medicare;
    }

    public void setMedicare(Boolean medicare) {
        this.medicare = medicare;
    }

    public String getNoMedicareReason() {
        return noMedicareReason;
    }

    public void setNoMedicareReason(String noMedicareReason) {
        this.noMedicareReason = noMedicareReason;
    }

    public Boolean getSchip() {
        return schip;
    }

    public void setSchip(Boolean schip) {
        this.schip = schip;
    }

    public String getNoSCHIPReason() {
        return noSCHIPReason;
    }

    public void setNoSCHIPReason(String noSCHIPReason) {
        this.noSCHIPReason = noSCHIPReason;
    }

    public Boolean getVaMedicalServices() {
        return vaMedicalServices;
    }

    public void setVaMedicalServices(Boolean vaMedicalServices) {
        this.vaMedicalServices = vaMedicalServices;
    }

    public String getNoVamedicalServicesReason() {
        return noVamedicalServicesReason;
    }

    public void setNoVamedicalServicesReason(String noVamedicalServicesReason) {
        this.noVamedicalServicesReason = noVamedicalServicesReason;
    }

    public Boolean getEmployerProvided() {
        return employerProvided;
    }

    public void setEmployerProvided(Boolean employerProvided) {
        this.employerProvided = employerProvided;
    }

    public String getNoEmployerProvidedReason() {
        return noEmployerProvidedReason;
    }

    public void setNoEmployerProvidedReason(String noEmployerProvidedReason) {
        this.noEmployerProvidedReason = noEmployerProvidedReason;
    }

    public Boolean getCobra() {
        return cobra;
    }

    public void setCobra(Boolean cobra) {
        this.cobra = cobra;
    }

    public String getNoCobraReason() {
        return noCobraReason;
    }

    public void setNoCobraReason(String noCobraReason) {
        this.noCobraReason = noCobraReason;
    }

    public Boolean getPrivatePay() {
        return privatePay;
    }

    public void setPrivatePay(Boolean privatePay) {
        this.privatePay = privatePay;
    }

    public String getNoPrivatePayReason() {
        return noPrivatePayReason;
    }

    public void setNoPrivatePayReason(String noPrivatePayReason) {
        this.noPrivatePayReason = noPrivatePayReason;
    }

    public Boolean getStateHealthInsurance() {
        return stateHealthInsurance;
    }

    public void setStateHealthInsurance(Boolean stateHealthInsurance) {
        this.stateHealthInsurance = stateHealthInsurance;
    }

    public String getNoStateHealthInsuranceReason() {
        return noStateHealthInsuranceReason;
    }

    public void setNoStateHealthInsuranceReason(String noStateHealthInsuranceReason) {
        this.noStateHealthInsuranceReason = noStateHealthInsuranceReason;
    }

    public Boolean getHivAidsAssistance() {
        return hivAidsAssistance;
    }

    public void setHivAidsAssistance(Boolean hivAidsAssistance) {
        this.hivAidsAssistance = hivAidsAssistance;
    }

    public String getNoHivAidsAssistance() {
        return noHivAidsAssistance;
    }

    public void setNoHivAidsAssistance(String noHivAidsAssistance) {
        this.noHivAidsAssistance = noHivAidsAssistance;
    }

    public Boolean getAdap() {
        return adap;
    }

    public void setAdap(Boolean adap) {
        this.adap = adap;
    }

    public String getNoAdapReason() {
        return noAdapReason;
    }

    public void setNoAdapReason(String noAdapReason) {
        this.noAdapReason = noAdapReason;
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

    public Date getDateDeleted() {
        return dateDeleted;
    }

    public void setDateDeleted(Date dateDeleted) {
        this.dateDeleted = dateDeleted;
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

    @PrePersist
    public void prePersist() {
        dateCreated = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        dateUpdated = new Date();
    }
}
