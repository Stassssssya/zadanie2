package model;

import java.util.List;
import java.util.Objects;

public class Instructor {

    public Instructor(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public Instructor(String name) {
        this.name = name;
    }

    public Instructor() {
    }

    private String name;
    private List<Course> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Instructor that = (Instructor) o;
        return name.equals(that.name) && Objects.equals(courses, that.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courses);
    }
}
