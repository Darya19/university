package com.epam.university.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Faculty {

    @Id
    @GeneratedValue
    @Column(name = "FACULTYID")
    private int facultyId;
    @Column(name = "FACULTYNAME")
    private String facultyName;

    public Faculty() {
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Faculty faculty = (Faculty) o;

        if (facultyId != faculty.facultyId) return false;
        return Objects.equals(facultyName, faculty.facultyName);
    }

    @Override
    public int hashCode() {
        int result = facultyId;
        result = 31 * result + (facultyName != null ? facultyName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyId=" + facultyId +
                ", name='" + facultyName + '\'' +
                '}';
    }
}
