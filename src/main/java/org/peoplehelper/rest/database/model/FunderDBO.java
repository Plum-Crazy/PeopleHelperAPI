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

    @Column(name = "StartDate")
    private String startDate;

    @Column(name = "EndDate")
    private String endDate;

    @Column(name = "DateCreated")
    private String dateCreated;

    @Column(name = "DateUpdated")
    private String dateUpdated;

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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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

    public Long getExportId() {
        return exportId;
    }

    public void setExportId(Long exportId) {
        this.exportId = exportId;
    }

}
