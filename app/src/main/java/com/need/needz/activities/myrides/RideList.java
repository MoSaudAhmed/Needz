package com.need.needz.activities.myrides;

/**
 * Created by sivasankar on
 * Wed/07/2020 15:58
 */

public class RideList {
    String id,name,address,contact1,contact2,coordinate_value;

    public RideList(String id, String name, String address, String contact1, String contact2, String coordinate_value) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact1 = contact1;
        this.contact2 = contact2;
        this.coordinate_value = coordinate_value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getCoordinate_value() {
        return coordinate_value;
    }

    public void setCoordinate_value(String coordinate_value) {
        this.coordinate_value = coordinate_value;
    }
}
