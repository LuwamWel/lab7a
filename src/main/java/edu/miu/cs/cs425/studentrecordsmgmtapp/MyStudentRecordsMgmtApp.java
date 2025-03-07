package edu.miu.cs.cs425.studentrecordsmgmtapp;

import edu.miu.cs.cs425.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) {

        Student[] students = {
                new Student(110001, "Dave", LocalDate.parse("1951-11-18")),
                new Student(110002, "Anna", LocalDate.parse("1990-12-07")),
                new Student(110003, "Erica", LocalDate.parse("1974-01-31")),
                new Student(110004, "Carlos", LocalDate.parse("2009-08-22")),
                new Student(110005, "Bob", LocalDate.parse("1994-08-05"))
        };

        printListOfStudentsSortedByName(students);

        List<Student> platinumAlumni = getListOfPlatinumAlumniStudents(students);
        System.out.println("\nPlatinum Alumni Students (Sorted by Admission Date Descending):");
        platinumAlumni.forEach(System.out::println);
    }

    public static void printListOfStudentsSortedByName(Student[] students) {
        Arrays.stream(students)
                .sorted((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()))
                .forEach(System.out::println);
    }

    // Method to filter Platinum Alumni (30+ years old) and sort by date descending
    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        LocalDate thirtyYearsAgo = LocalDate.now().minusYears(30);
        return Arrays.stream(students)
                .filter(s -> s.getDateOfAdmission().isBefore(thirtyYearsAgo))
                .sorted((s1, s2) -> s2.getDateOfAdmission().compareTo(s1.getDateOfAdmission()))
                .collect(Collectors.toList());
    }

}
