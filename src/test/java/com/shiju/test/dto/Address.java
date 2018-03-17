package com.shiju.test.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by spaul on 21/02/2018.
 */
public class Address {

    private int houseNo = 49;
    private String street = "Sennelleys Park Road";
    private String town = "Birmingham";
    private String postCode = "B31 1AE";

    public Address() {
    }

    public Address(int houseNo, String street, String town, String postCode) {
        this.houseNo = houseNo;
        this.street = street;
        this.town = town;
        this.postCode = postCode;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public boolean equals(Object object) {
        return EqualsBuilder.reflectionEquals(this, object);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
