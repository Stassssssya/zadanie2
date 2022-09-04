package main.model;

public class Course {

    public Course(String name, Long courseID) {
        this.name = name;
        this.courseID = courseID;
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
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", courseID=" + courseID +
                '}';
    }
}
