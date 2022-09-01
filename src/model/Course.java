package model;

import java.util.Objects;

public class Course {

    public Course(String name, Long courseID) {
        this.name = name;
        this.courseID = courseID;
    }

    public Course() {
    }

    private String name;
    private Long courseID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name) && Objects.equals(courseID, course.courseID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courseID);
    }
}
