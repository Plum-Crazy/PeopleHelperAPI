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


}
