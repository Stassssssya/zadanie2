package main.model;

import java.util.ArrayList;
import java.util.List;

public class Departament {

    public Departament(String name) {
        this.name = name;
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

    public void addInstructor(Instructor instructor) {
        if (instructors == null) {
            instructors = new ArrayList<>();
        }
        instructors.add(instructor);
    }

    public void removeInstructor(Instructor instructor) {
        instructors.remove(instructor);
    }

    public Instructor getInstructor(int index) {
        return instructors.get(index);
    }

    @Override
    public String toString() {
        return "Departament{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                ", instructors=" + instructors +
                '}';
    }
}
