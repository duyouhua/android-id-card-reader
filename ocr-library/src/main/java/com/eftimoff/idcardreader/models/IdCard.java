package com.eftimoff.idcardreader.models;

import java.io.Serializable;

public class IdCard implements Serializable {

    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private Gender gender;
    private String personalNumber;
    private long dateOfBirth;
    private long expirationDate;
    private String address;
    private long idCreatedDate;
    private int height;
    private String placeOfBirth;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(final Gender gender) {
        this.gender = gender;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(final String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(final long expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public long getIdCreatedDate() {
        return idCreatedDate;
    }

    public void setIdCreatedDate(final long idCreatedDate) {
        this.idCreatedDate = idCreatedDate;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(final String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public enum Gender {
        MALE, FEMALE
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", gender=" + gender +
                ", personalNumber='" + personalNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
