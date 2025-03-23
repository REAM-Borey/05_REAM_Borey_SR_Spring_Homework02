package org.example.borey.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.borey.model.entiry.Course;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstructorRequest {
    private String instructorName;
    private String instructorEmail;
    private List<Course> course;
}
