package edu.miu.cs.cs425.studentrecordsmgmtapp.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private int studentId;
    private String name;
    private LocalDate dateOfAdmission;

    public Student() {}

    public Student(int studentId, String name, LocalDate dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = LocalDate.now(); // Default to current date
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return "Student ID: " + studentId + ", Name: " + name +
                ", Date of Admission: " + dateOfAdmission.format(formatter);
    }
}

