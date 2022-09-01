package model;

import java.util.List;
import java.util.Objects;

public class University {

    public University(String name, String address, String phone, List<Departament> departaments, List<Student> students) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.departaments = departaments;
        this.students = students;
    }

    public University(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public University() {
    }

    private String name;
    private String address;
    private String phone;
    private List<Departament> departaments;
    private List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Departament> getDepartaments() {
        return departaments;
    }

    public void setDepartaments(List<Departament> departaments) {
        this.departaments = departaments;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(phone, that.phone) && Objects.equals(departaments, that.departaments) && Objects.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phone, departaments, students);
    }
}
