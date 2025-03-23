package org.example.borey.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.borey.model.entiry.Instructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequest {
    private String courseName;
    private String courseDescription;
    private int instructorId;
}
