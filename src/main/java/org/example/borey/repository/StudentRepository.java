package org.example.borey.repository;

import org.apache.ibatis.annotations.*;
import org.example.borey.model.entiry.Student;
import org.example.borey.model.request.StudentRequest;

import java.util.List;

@Mapper
public interface StudentRepository {
    @Results(id = "studentMapper", value = {
            @Result(property = "studentId",column = "student_id"),
            @Result(property = "studentName",column = "student_name"),
            @Result(property = "studentEmail",column = "student_email"),
            @Result(property = "studentPhoneNumber",column = "student_phone_number"),
            @Result(property = "studentCourse",column = "student_course")
    })
    @Select("""
        select * from students;
    """)
    List<Student> getAllStudent();


    @ResultMap("studentMapper")
    @Select("""
        INSERT INTO students VALUES ( default, #{req.studentName}, #{req.studentEmail}, #{req.studentPhoneNumber})
        RETURNING *;
    """)
    Student saveStudent(@Param("req") StudentRequest studentRequest);


//    @ResultMap("studentMapper")
    @Select("""
        SELECT * from students where student_id = #{id}
    """)
    Student getStudentById(Long id);
}
