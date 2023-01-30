package com.keyin.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentManagerTest {

    private StudentManager studentManagerUnderTest = new StudentManager();

    @Mock
    private StudentDataSource studentDataSourceMock;

    @Test
    public void testGetAllStudents() {
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Jamie");
        student1.setLastName("Cornick");
        student1.setAddress("1234 Street");

        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Test");
        student2.setLastName("Testing");
        student2.setAddress("1234 Street");

        Student student3 = new Student();
        student3.setId(3);
        student3.setFirstName("Demo");
        student3.setLastName("Mocking");
        student3.setAddress("1234 Street");

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        studentManagerUnderTest.setStudentDataSource(studentDataSourceMock);
        when(studentDataSourceMock.getAllStudents()).thenReturn(studentList);

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

        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Test");
        student2.setLastName("Testing");
        student2.setAddress("1234 Street");

        Student student3 = new Student();
        student3.setId(3);
        student3.setFirstName("Demo");
        student3.setLastName("Mocking");
        student3.setAddress("1234 Street");

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


        Student studentToFind = new Student();
        studentToFind.setId(1);
        studentToFind.setFirstName("Jamie");
        studentToFind.setLastName("Cornick");
        studentToFind.setAddress("1234 Street");

        studentManagerUnderTest.setStudentDataSource(studentDataSourceMock);
        when(studentDataSourceMock.getAllStudents()).thenReturn(studentList);

        Assertions.assertEquals(studentToFind, studentManagerUnderTest.findMatchingStudent(studentToFind));
    }

}
