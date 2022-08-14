package com.aj.sl_student_community_cyprus.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class StudentDataAccessService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

     List<Student> selectAllStudents(){
        String sql =  "" + "SELECT "+
                       " student_id, " +
                       " first_name, "+
                       " last_name, " +
                       " email, " +
                       " gender " +
                       " FROM student";
        return jdbcTemplate.query(sql, mapStudentFromDb());

    }

    private static RowMapper<Student> mapStudentFromDb() {
        return (rs, rowNum) -> {
            String studentIdStr = rs.getString("student_id");
            UUID studentID = UUID.fromString(studentIdStr);
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            String email = rs.getString("email");
            String genderStr = rs.getString("gender").toUpperCase();
            Student.Gender gender = Student.Gender.valueOf(genderStr);

            return new Student(
                    studentID, firstName, lastName, email, gender
            );
        };
    }
}
