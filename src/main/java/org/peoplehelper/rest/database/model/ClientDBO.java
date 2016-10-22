package org.peoplehelper.rest.database.model;

import javax.persistence.*;

@Entity
@Table(name = "Client")
public class ClientDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UUID")
    private long uuid;

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



}
