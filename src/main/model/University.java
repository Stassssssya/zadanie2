package main.model;

import java.util.ArrayList;
import java.util.List;

public class University {

    public University(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
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


    public void addStudent(Student student) {
        if (students == null) {
            students = new ArrayList<>();
        }
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public void addDepartament(Departament departament) {
        if (departaments == null) {
            departaments = new ArrayList<>();
        }
        departaments.add(departament);
    }

    public void removeDepartament(Departament departament) {
        departaments.remove(departament);
    }

    public Departament getDepartament(int index) {
        return departaments.get(index);
    }

    @Override
    public String toString() {
        return "University{" + '\n' +
                "name='" + name + '\n' +
                "address='" + address + '\n' +
                "phone='" + phone + '\n' +
                "departaments=" + departaments + '\n' +
                "students=" + students + '\n' +
                '}';
    }
}
