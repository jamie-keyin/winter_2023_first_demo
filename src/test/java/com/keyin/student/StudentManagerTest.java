package com.keyin.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentManagerTest {

    private StudentManager studentManagerUnderTest = new StudentManager();

    @Test
    public void testGetAllStudents() {
        Assertions.assertTrue(studentManagerUnderTest.getAllStudents().size() > 0);
    }
    @Test
    public void testStudentEqual() {
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Jamie");
        student1.setLastName("Cornick");
        student1.setAddress("1234 Street");


        Student student2 = new Student();
        student2.setId(1);
        student2.setFirstName("Jamie");
        student2.setLastName("Cornick");
        student2.setAddress("1234 Street");

        boolean result = student1.equals(student2);

        Assertions.assertTrue(result);
    }
    @Test
    public void testFindMatchingStudent() {
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Jamie");
        student1.setLastName("Cornick");
        student1.setAddress("1234 Street");

        Assertions.assertEquals(student1, studentManagerUnderTest.findMatchingStudent(student1));
    }

}
