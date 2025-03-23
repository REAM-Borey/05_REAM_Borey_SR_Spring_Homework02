package org.example.borey.model.entiry;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.borey.model.response.InstructorResponse;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private int courseId;
    private String courseName;
    private String courseDescription;
    private Instructor instructor;
}
