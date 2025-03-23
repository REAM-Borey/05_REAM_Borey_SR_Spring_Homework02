package org.example.borey.repository;

import org.apache.ibatis.annotations.*;
import org.example.borey.model.entiry.Course;
import org.example.borey.model.request.CourseRequest;

import java.util.List;

@Mapper
public interface CourseRepository {


    @Results(id = "CourseMapper" ,value = {
        @Result(property = "courseId", column = "course_id"),
        @Result(property = "courseName", column = "course_name"),
        @Result(property = "courseDescription", column = "course_description"),
        @Result(property = "instructor", column = "instructor_id", one = @One(select = "org.example.borey.repository.InstructorRepository.getInstructorById"))
    })
    @Select("""
        SELECT * FROM courses
        OFFSET #{offset} LIMIT #{size}
    """)
    List<Course> getAllCourse(int offset,int size);



    @Select("""
        SELECT * FROM courses cs INNER JOIN instructors it on cs.instructor_id = it.instructor_id where course_id = #{id};
        """)
    @ResultMap("CourseMapper")
    Course getCourseById(int id);


    @Select("""
        INSERT INTO courses(course_name,course_description,instructor_id) VALUES (#{req.courseName},#{req.courseDescription},#{req.instructorId})
        RETURNING *;
        """)
    @ResultMap("CourseMapper")
    Course createCourse(@Param("req") CourseRequest courseRequest);




    @Update("""
        UPDATE courses set course_name = #{req.courseName},
                    course_description = #{req.courseDescription},
                    instructor_id = #{req.instructorId}
        where course_id = #{id}
        RETURNING *;
        """)
    @ResultMap("CourseMapper")
    Course updateCourseById(int id,@Param("req") CourseRequest courseRequest);


    @Select("""
        delete from courses where course_id #{id}
                    RETRUNING *;
        """)
    @ResultMap("CourseMapper")
    Course deleteCourseById(int id);
}
