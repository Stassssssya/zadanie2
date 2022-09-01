package model;

import java.util.List;
import java.util.Objects;

public class Departament {

    public Departament(String name, List<Course> courses, List<Instructor> instructors) {
        this.name = name;
        this.courses = courses;
        this.instructors = instructors;
    }

    public Departament(String name) {
        this.name = name;
    }

    public Departament() {
    }

    private String name;
    private List<Course> courses;
    private List<Instructor> instructors;

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

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departament that = (Departament) o;
        return Objects.equals(name, that.name) && Objects.equals(courses, that.courses) && Objects.equals(instructors, that.instructors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courses, instructors);
    }
}
