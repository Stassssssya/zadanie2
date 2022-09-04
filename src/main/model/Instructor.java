package main.model;

import java.util.List;

public class Instructor {

    public Instructor(String name) {
        this.name = name;
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
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
