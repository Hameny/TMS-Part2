package com.tms.task1;

import java.util.Objects;

public class CompanyName implements Cloneable {

    private String companyName;
    private String addressCompany;

    public CompanyName(String companyName, String addressCompany) {
        this.companyName = companyName;
        this.addressCompany = addressCompany;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddressCompany() {
        return addressCompany;
    }

    public void setAddressCompany(String addressCompany) {
        this.addressCompany = addressCompany;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyName that = (CompanyName) o;
        return companyName.equals(that.companyName) && addressCompany.equals(that.addressCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, addressCompany);
    }

    @Override
    public String toString() {
        return "com.tms.task1.CompanyName{" +
                "companyName='" + companyName + '\'' +
                ", addressCompany='" + addressCompany + '\'' +
                '}';
    }

    public CompanyName clone() throws CloneNotSupportedException {
        return (CompanyName) super.clone();
    }
}
