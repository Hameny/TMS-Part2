package com.tms.task1;

import java.util.Objects;

public final class User extends Person implements Cloneable {
    private CompanyName companyName;

    public User(String name, String surname, int age, MaritalStatus maritalStatus, CompanyName companyName) {
        super(name, surname, age, String.valueOf(maritalStatus));
        this.companyName = companyName;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return companyName.equals(user.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), companyName);
    }

    @Override
    public String toString() {
        return "com.tms.task1.User{" +
                "companyName=" + companyName +
                '}';
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        User userCopy = (User) super.clone();

        return userCopy;
    }
}
