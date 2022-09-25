package com.springboot;

import com.springboot.entity.Guardian;
import com.springboot.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("ravi@gmail.com")
                .firstName("ravi")
                .lastName("kumar")
                //.guardianName("rajesh")
               // .guardianEmail("rajesh@gmail.com")
               // .guardianMobile("987654321")
                .build();
        studentRepository.save(student);
    }
    @Test
    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .email("rajesh@gmail.com")
                .name("rajesh")
                .mobile("987654321")
                .build();
        Student student = Student.builder()
                .emailId("raj@gmail.com")
                .firstName("raj")
                .lastName("kumar")
                .build();
        studentRepository.save(student);


    }
    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("studentList" +  studentList);

    }

}