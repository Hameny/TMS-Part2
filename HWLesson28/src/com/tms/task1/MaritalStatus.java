package com.tms.task1;

public enum MaritalStatus {

    Single("single"),
    Married("married");

    public final String maritalStatus;

    MaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
