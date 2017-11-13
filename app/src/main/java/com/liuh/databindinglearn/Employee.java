package com.liuh.databindinglearn;

/**
 * Created by huan on 2017/11/8 10:12.
 */

public class Employee {
    String firstname;
    String lastName;
    boolean isFired;

    public Employee(String firstname, String lastName, boolean isFired) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.isFired = isFired;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isFired() {
        return isFired;
    }

    public void setFired(boolean fired) {
        isFired = fired;
    }
}
