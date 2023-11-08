package com.example.assignment.ui.home;

public class ProfileViewModel {
    String initials;
    String fullname;
    String location;
    String distance;
    String purpose;
    String status;

    public ProfileViewModel(String initials, String fullname, String location, String distance, String purpose, String status) {
        this.initials = initials;
        this.fullname = fullname;
        this.location = location;
        this.distance = distance;
        this.purpose = purpose;
        this.status = status;
    }

    public ProfileViewModel() {

    }


    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
