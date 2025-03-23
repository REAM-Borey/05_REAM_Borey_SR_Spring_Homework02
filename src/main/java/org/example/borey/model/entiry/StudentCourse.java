package org.example.borey.model.entiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentCourse {
    private int studentCourseId;
    private int studentId;
    private int courseId;
}
