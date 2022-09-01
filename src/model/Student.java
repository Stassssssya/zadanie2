package model;

import java.util.List;
import java.util.Objects;

public class Student {

    public Student(String name, Long studentID, List<Course> courses) {
        this.name = name;
        this.studentID = studentID;
        this.courses = courses;
    }

    public Student(String name, Long studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public Student() {
    }

    private String name;
    private Long studentID;
    private List<Course> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(studentID, student.studentID) && Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentID, courses);
    }
}
