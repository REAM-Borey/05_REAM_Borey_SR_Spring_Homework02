package org.example.borey.repository;

import org.apache.ibatis.annotations.*;
import org.example.borey.model.entiry.Instructor;
import org.example.borey.model.request.InstructorRequest;

import java.util.List;

@Mapper
public interface InstructorRepository {

     @Select("""
     select * from instructors;
     """)
     @Results(id = "InstructorMapper", value = {
             @Result(property = "instructorId",column = "instructor_id"),
             @Result(property = "instructorName",column = "instructor_name"),
             @Result(property = "instructorEmail",column = "instructor_email"),
     })
    List<Instructor> getInstructor();

     @Select("""
        select * from instructors where instructor_id =#{id}
        """)
     @ResultMap("InstructorMapper")
    Instructor getInstructorById(int id);


     @Select("""
        INSERT INTO instructors(instructor_name,instructor_email) values 
                                    (#{req.instructorName},#{req.instructorEmail})
        RETURNING *;
        """)
     @ResultMap("InstructorMapper")
    Instructor insertInstructor(@Param("req") InstructorRequest instructorRequest);


     @Select("""
        delete from instructors where instructor_id = #{id}
        RETURNING *;
        """)
     @ResultMap("InstructorMapper")
    Instructor deleteInstructorById(int id);



     @Update("""
        UPDATE instructors set instructor_name = #{req.instructorName}, instructor_email = #{req.instructorEmail}
            where instructor_id = #{id};
        """)
     @ResultMap("InstructorMapper")
    Instructor updateInstructorById(int id,@Param("req") InstructorRequest instructorRequest);
}
