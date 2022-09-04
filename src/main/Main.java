package main;

import main.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        University msu = new University("МГУ", "г. Москва ул. Колмогорова 1", "354755");

        Departament departament1 = new Departament("Факультет физики и математики");
        Departament departament2 = new Departament("Факультет журналистики");
        Departament departament3 = new Departament("Факультет физической культуры");

        msu.addDepartament(departament1);
        msu.addDepartament(departament2);
        msu.addDepartament(departament3);

        //печать всех до удаления
        System.out.println(msu.getDepartaments());

        msu.removeDepartament(departament3);

        //печать всех после удаления
        System.out.println(msu.getDepartaments());
        //печать по индексу
        System.out.println(msu.getDepartament(1));

        Student student1 = new Student("Илья", (long) 0);
        Student student2 = new Student("Митя", (long) 1);
        Student student3 = new Student("Ксеня", (long) 2);
        Student student4 = new Student("Данил", (long) 3);
        Student student5 = new Student("Лёля", (long) 4);

        msu.addStudent(student1);
        msu.addStudent(student2);
        msu.addStudent(student3);
        msu.addStudent(student4);
        msu.addStudent(student5);

        //печать всех до удаления
        System.out.println(msu.getStudents());

        msu.removeStudent(student5);

        //печать всех после удаления
        System.out.println(msu.getStudents());

        //печать по индексу
        System.out.println(msu.getStudent(1));

        Instructor instructor1 = new Instructor("Васильев Петр Иванович");
        Instructor instructor2 = new Instructor("Иванов Дмитрий Павлович");
        Instructor instructor3 = new Instructor("Гуляева Ирина Васильевна");

        Course course1 = new Course("Математика", (long) 0);
        Course course2 = new Course("Русский язык", (long) 1);
        Course course3 = new Course("Биология", (long) 2);
        Course course4 = new Course("Астрономия", (long) 3);
        Course course5 = new Course("Философия", (long) 4);

        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
        courses.add(course5);

        instructor1.setCourses(selectFromConsole(courses, instructor1));

        departament1.addInstructor(instructor3);
        departament2.addInstructor(instructor1);
        departament3.addInstructor(instructor2);

        //печать всех до удаления
        System.out.println(departament2.getInstructors());

        //печать по индексу
        System.out.println(departament2.getInstructor(0));

        departament2.removeInstructor(instructor1);

        //печать всех после удаления
        System.out.println(departament2.getInstructors());

        System.out.println(msu);
    }

    private static List<Course> selectFromConsole(List<Course> courses, Instructor instructor) {
        List<Course> selectedCourses = new ArrayList<>();

        System.out.println("Выберите предметы для преподавателя " + instructor.getName() + " числами через зяпятую без пробелов");

        for (Course course : courses) {
            System.out.println(course.getCourseID() + " - " + course.getName());
        }

        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.next();

        String[] split = numbers.split(",");

        for (String index : split) {
            selectedCourses.add(courses.get(Integer.parseInt(index)));
        }

        return selectedCourses;
    }
}
