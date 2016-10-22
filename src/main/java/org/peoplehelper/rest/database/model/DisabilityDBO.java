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

    @Column(name = "PersonalID")
    private Integer personalId;

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


}
