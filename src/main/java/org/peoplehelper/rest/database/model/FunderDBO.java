package org.peoplehelper.rest.database.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "FunderDBO")
public class FunderDBO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "funder_primary_key")
    private Long funderPrimaryKey;

    @Column(name = "FunderID")
    private Integer funderId;

    @Column(name = "ProjectID")
    private Integer projectId;

    @Column(name = "FunderDBO")
    private Integer funder;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "StartDate")
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EndDate")
    private Date endDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DateCreated")
    private Date dateCreated;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DateUpdated")
    private Date dateUpdated;

    @Column(name = "UserID")
    private Long userId;

    @Column(name = "ExportID")
    private Long exportId;

    public Long getFunderPrimaryKey() {
        return funderPrimaryKey;
    }

    public void setFunderPrimaryKey(Long funderPrimaryKey) {
        this.funderPrimaryKey = funderPrimaryKey;
    }

    public Integer getFunderId() {
        return funderId;
    }

    public void setFunderId(Integer funderId) {
        this.funderId = funderId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getFunder() {
        return funder;
    }

    public void setFunder(Integer funder) {
        this.funder = funder;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public Long getExportId() {
        return exportId;
    }

    public void setExportId(Long exportId) {
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
