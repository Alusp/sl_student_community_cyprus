package com.aj.sl_student_community_cyprus.student;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class StudentDataAccessService {
    public List<Student> selectAllStudents(){
        return List.of(

                new Student(UUID.randomUUID(), "Adama", "Jalloh", "adama@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(), "Osman", "Jalloh", "osman@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(), "Isatu", "Kamara", "isatu@gmail.com", Student.Gender.FEMALE)
        );
    }
}
