import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Instructor> instructors = new ArrayList<>();
        List<Departament> departaments = new ArrayList<>();
        List<University> universities = new ArrayList<>();

        fillCourses(scanner, courses);
        fillStudents(scanner, courses, students);
        fillInstructors(scanner, courses, instructors);
        fillDepartaments(scanner, courses, instructors, departaments);
        fillUniversities(scanner, departaments, students, universities);

        System.out.println(students);
    }

    private static void fillUniversities(Scanner scanner, List<Departament> departaments, List<Student> students, List<University> universities) {
        System.out.println("Введите количество вузов");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Введите название вуза " + i);
            String name = scanner.next();

            System.out.println("Введите адрес вуза " + i);
            String address = scanner.next();

            System.out.println("Введите номер телефона вуза " + i);
            String phone = scanner.next();

            System.out.println("Введите его студентов через запятую без пробелов");
            String studentsNames = scanner.next();

            List<Student> universityStudents = getStudents(students, studentsNames);

            System.out.println("Введите его факультеты через запятую без пробелов");
            String departamentsNames = scanner.next();

            List<Departament> universityDepartament = getDepartaments(departaments, departamentsNames);

            University university = new University(name, address, phone, universityDepartament, universityStudents);
            universities.add(university);
        }
    }

    private static void fillDepartaments(Scanner scanner, List<Course> courses, List<Instructor> instructors, List<Departament> departaments) {
        System.out.println("Введите количество факультетов");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Введите название факультета " + i);
            String name = scanner.next();

            System.out.println("Введите его преподавателей через запятую без пробелов");
            String instructorNames = scanner.next();

            List<Instructor> departamentInstructors = getInstructors(instructors, instructorNames);

            System.out.println("Введите его курсы через запятую без пробелов");
            String courseNames = scanner.next();

            List<Course> departamentCourses = getCourses(courses, courseNames);

            Departament departament = new Departament(name, departamentCourses, departamentInstructors);
            departaments.add(departament);
        }
    }

    private static void fillInstructors(Scanner scanner, List<Course> courses, List<Instructor> instructors) {
        System.out.println("Введите количество преподавателей");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Введите имя преподавателя " + i);
            String name = scanner.next();

            System.out.println("Введите его курсы через запятую без пробелов");
            String courseNames = scanner.next();

            List<Course> instructorCourses = getCourses(courses, courseNames);

            Instructor instructor = new Instructor(name, instructorCourses);
            instructors.add(instructor);
        }
    }

    private static void fillStudents(Scanner scanner, List<Course> courses, List<Student> students) {
        System.out.println("Введите количество студентов");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Введите имя студента " + i);
            String name = scanner.next();

            System.out.println("Введите его курсы через запятую без пробелов");
            String courseNames = scanner.next();

            List<Course> studentCourses = getCourses(courses, courseNames);

            Student student = new Student(name, (long) i, studentCourses);
            students.add(student);
        }
    }

    private static void fillCourses(Scanner scanner, List<Course> courses) {
        System.out.println("Введите количество курсов");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Введите название курса " + i);
            String name = scanner.next();
            Course course = new Course(name, (long) i);
            courses.add(course);
        }
    }

    private static List<Instructor> getInstructors(List<Instructor> instructors, String instructorNames) {
        List<Instructor> instructorList = new ArrayList<>();

        for (String name : instructorNames.split(",")) {
            for (Instructor instructor : instructors) {
                if (instructor.getName().equals(name)){
                    instructorList.add(instructor);
                }
            }
        }
        return instructorList;
    }

    private static List<Course> getCourses(List<Course> courses, String courseNames) {
        List<Course> studentCourses = new ArrayList<>();

        for (String name : courseNames.split(",")) {
            for (Course course : courses) {
                if (course.getName().equals(name)){
                    studentCourses.add(course);
                }
            }
        }
        return studentCourses;
    }

    private static List<Student> getStudents(List<Student> students, String studentsNames) {
        List<Student> studentList = new ArrayList<>();

        for (String name : studentsNames.split(",")) {
            for (Student student : students) {
                if (student.getName().equals(name)){
                    studentList.add(student);
                }
            }
        }
        return studentList;
    }

    private static List<Departament> getDepartaments(List<Departament> departaments, String departamentsNames) {
        List<Departament> departamentsList = new ArrayList<>();

        for (String name : departamentsNames.split(",")) {
            for (Departament departament : departaments) {
                if (departament.getName().equals(name)){
                    departamentsList.add(departament);
                }
            }
        }
        return departamentsList;
    }
}
