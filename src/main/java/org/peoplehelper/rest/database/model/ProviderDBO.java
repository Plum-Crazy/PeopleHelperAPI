package org.peoplehelper.rest.database.model;

import javax.persistence.*;

@Entity
@Table(name = "Provider")
public class ProviderDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String phone;

    @Column
    private String url;

    @Column
    private String clothing;

    @Column
    private String food;

    @Column(name = "emergency_shelter")
    private String emergencyShelter;

    @Column
    private String healthcare;

    @Column
    private String legal;

    @Column
    private String transportation;

    @Column
    private String counseling;

    @Column
    private String education;

    @Column(name = "employment_assistance")
    private String employmentAssistance;

    @Column(name = "hygiene_essentials")
    private String hygieneEssentials;

    @Column(name = "housing_assistance")
    private String housingAssistance;

    @Column(name = "utility_assistance")
    private String utilityAssistance;

    @Column(name = "community_services")
    private String communityServices;

    @Column
    private String lat;

    @Column
    private String lon;

    @Column(name = "available_rooms")
    private Integer availableRooms;

    public ProviderDBO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getClothing() {
        return clothing;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getEmergencyShelter() {
        return emergencyShelter;
    }

    public void setEmergencyShelter(String emergencyShelter) {
        this.emergencyShelter = emergencyShelter;
    }

    public String getHealthcare() {
        return healthcare;
    }

    public void setHealthcare(String healthcare) {
        this.healthcare = healthcare;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public String getCounseling() {
        return counseling;
    }

    public void setCounseling(String counseling) {
        this.counseling = counseling;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmploymentAssistance() {
        return employmentAssistance;
    }

    public void setEmploymentAssistance(String employmentAssistance) {
        this.employmentAssistance = employmentAssistance;
    }

    public String getHygieneEssentials() {
        return hygieneEssentials;
    }

    public void setHygieneEssentials(String hygieneEssentials) {
        this.hygieneEssentials = hygieneEssentials;
    }

    public String getHousingAssistance() {
        return housingAssistance;
    }

    public void setHousingAssistance(String housingAssistance) {
        this.housingAssistance = housingAssistance;
    }

    public String getUtilityAssistance() {
        return utilityAssistance;
    }

    public void setUtilityAssistance(String utilityAssistance) {
        this.utilityAssistance = utilityAssistance;
    }

    public String getCommunityServices() {
        return communityServices;
    }

    public void setCommunityServices(String communityServices) {
        this.communityServices = communityServices;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public Integer getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(Integer availableRooms) {
        this.availableRooms = availableRooms;
    }
}
