package main.model;

import java.util.List;

public class Student {

    public Student(String name, Long studentID) {
        this.name = name;
        this.studentID = studentID;
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", courses=" + courses +
                '}';
    }
}
