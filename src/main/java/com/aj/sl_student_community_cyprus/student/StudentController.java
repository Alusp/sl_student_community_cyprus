package com.aj.sl_student_community_cyprus.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("students")
public class StudentController {
    @GetMapping
    public List<Student> getAllStudent() {
        return List.of(

                new Student(UUID.randomUUID(), "Adama", "Jalloh", "adama@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(), "Osman", "Jalloh", "osman@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(), "Isatu", "Kamara", "isatu@gmail.com", Student.Gender.FEMALE)
        );
    }
}
