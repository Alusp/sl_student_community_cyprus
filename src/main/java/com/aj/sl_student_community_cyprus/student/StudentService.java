package com.aj.sl_student_community_cyprus.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentDataAccessService studentDataAccessService;
    @Autowired
    public StudentService(StudentDataAccessService studentDataAccessService) {
        this.studentDataAccessService = studentDataAccessService;
    }

    public List<Student> getAllStudent(){
        return studentDataAccessService.selectAllStudents();
    }
}
