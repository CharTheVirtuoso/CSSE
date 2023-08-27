package com.csse.model;

import java.lang.String;

/*
 * @return Employee
 *
 * This class will return DBs
 * 
 */
public class Employee {
    public String empId;
    public String fullName;
    public String address;
    public String facultyName;
    public String department;
    public String designation;

    public Employee() {
    }

    public Employee(String empId, String fullName, String address, String facultyName, String department, String designation) {
        this.empId = empId;
        this.fullName = fullName;
        this.address = address;
        this.facultyName = facultyName;
        this.department = department;
        this.designation = designation;
    }

    /**
     * Getters and Setters
     *
     */

    public String empId() {
        return empId;
    }

    public Employee setEmpId(String empId) {
        this.empId = empId;
        return this;
    }

    public String fullName() {
        return fullName;
    }

    public Employee setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String address() {
        return address;
    }

    public Employee setAddress(String address) {
        this.address = address;
        return this;
    }

    public String facultyName() {
        return facultyName;
    }

    public Employee setFacultyName(String facultyName) {
        this.facultyName = facultyName;
        return this;
    }

    public String department() {
        return department;
    }

    public Employee setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String designation() {
        return designation;
    }

    public Employee setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    /**
     *
     * @return all employees as a string
     */
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", fullName=" + fullName +
                ", address=" + address +
                ", facultyName=" + facultyName +
                ", department=" + department +
                ", designation=" + designation +
                '}';
    }
}
