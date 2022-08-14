package com.aj.sl_student_community_cyprus.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {
    public List<Student> getAllStudent(){
        return List.of(

                new Student(UUID.randomUUID(), "Adama", "Jalloh", "adama@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(), "Osman", "Jalloh", "osman@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(), "Isatu", "Kamara", "isatu@gmail.com", Student.Gender.FEMALE)
        );
    }
}
