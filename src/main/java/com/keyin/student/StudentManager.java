package com.keyin.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private StudentDataSource studentDataSource;

    public List<Student> getAllStudents() {
        return studentDataSource.getAllStudents();
    }

    public Student findMatchingStudent(Student studentToFind) {
        List<Student> studentList = studentDataSource.getAllStudents();

        if (studentList.contains(studentToFind)) {

            for (Student student : studentList) {
                if (student.equals(studentToFind)) {
                    return student;
                }
            }
        }

        System.out.println("Testing");

        System.out.println("Testing");

        return null;
    }

    public StudentDataSource getStudentDataSource() {
        return studentDataSource;
    }

    public void setStudentDataSource(StudentDataSource studentDataSource) {
        this.studentDataSource = studentDataSource;
    }

}
