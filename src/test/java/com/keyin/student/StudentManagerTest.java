package com.keyin.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentManagerTest {

    private StudentManager studentManagerUnderTest = new StudentManager();

    @Test
    public void testGetAllStudents() {
        Assertions.assertTrue(studentManagerUnderTest.getAllStudents().size() > 0);
    }

}
