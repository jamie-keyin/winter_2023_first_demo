package com.keyin.student;

import java.util.ArrayList;
import java.util.List;

public class StudentDataSource {
    private List<Student> studentList = new ArrayList<Student>();

    public List<Student> getAllStudents() {
        return studentList;
    }
}
