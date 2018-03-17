package com.shiju.test.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by spaul on 21/02/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {

    private int id;
    private String name;
    private Address address;

    public Person() {
    }

    public Person(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object object) {

        return EqualsBuilder.reflectionEquals(this, object);
    }

    @Override
    public int hashCode() {
       return HashCodeBuilder.reflectionHashCode(this);
    }

    public static void main(String[] args) throws Exception {
        Person person = new Person(10, "Unknown person", new Address());
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(System.out, person);
    }
}
