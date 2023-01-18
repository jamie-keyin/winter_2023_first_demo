package com.keyin.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> studentList = new ArrayList<Student>();

    public StudentManager() {
        Student firstStudent = new Student();
        firstStudent.setId(1);
        firstStudent.setFirstName("Jamie");
        firstStudent.setLastName("Cornick");
        firstStudent.setAddress("1234 Street");

        studentList.add(firstStudent);
    }

    public List<Student> getAllStudents() {
        return studentList;
    }

    public Student findMatchingStudent(Student studentToFind) {
        if (studentList.contains(studentToFind)) {

            for (Student student : studentList) {
                if (student.equals(studentToFind)) {
                    return student;
                }
            }
        }

        return null;
    }

}
