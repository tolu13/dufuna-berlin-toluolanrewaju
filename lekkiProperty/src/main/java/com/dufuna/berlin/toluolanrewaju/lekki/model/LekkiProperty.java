package com.dufuna.berlin.toluolanrewaju.lekki.model;

import java.time.LocalDate;

public class LekkiProperty {
    private String propertyId;
    private String propertyAddress;
    private String propertyType;
    private int numberOfBedrooms;
    private int numberOfSittingRooms;
    private int numberOfKitchens;
    private int numberOfBathrooms;
    private int numberOfToilets;
    private String propertyOwner;
    private String description;
    private LocalDate validFrom;
    private LocalDate validTo;

    public LekkiProperty(){

    }

    public LekkiProperty(String propertyId, String propertyAddress, String propertyType, int numberOfBedrooms, int numberOfSittingRooms, int numberOfKitchens, int numberOfBathrooms, int numberOfToilets, String propertyOwner, String description, LocalDate validFrom, LocalDate validTo) {
        this.propertyId = propertyId;
        this.propertyAddress = propertyAddress;
        this.propertyType = propertyType;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfSittingRooms = numberOfSittingRooms;
        this.numberOfKitchens = numberOfKitchens;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfToilets = numberOfToilets;
        this.propertyOwner = propertyOwner;
        this.description = description;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public String getPropertyId() {
        return propertyId;
    }



    public String getPropertyType() {
        return propertyType;
    }


    public String getPropertyAddress() {
        return propertyAddress;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public int getNumberOfSittingRooms() {
        return numberOfSittingRooms;
    }

    public int getNumberOfKitchens() {
        return numberOfKitchens;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }
    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public void setNumberOfSittingRooms(int numberOfSittingRooms) {
        this.numberOfSittingRooms = numberOfSittingRooms;
    }

    public void setNumberOfKitchens(int numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    @Override
    public String toString() {
        return propertyId + "," + propertyAddress + "," + propertyType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same object in memory
        if (obj == null || getClass() != obj.getClass()) return false; // check type
        LekkiProperty other = (LekkiProperty) obj;
        return this.propertyId.equals(other.propertyId); // compare by ID
    }

    @Override
    public int hashCode() {
        return  propertyId.hashCode();// simple hash based on ID
    }


}
