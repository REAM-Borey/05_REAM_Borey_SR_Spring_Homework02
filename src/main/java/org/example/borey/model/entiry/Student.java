package org.example.borey.model.entiry;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long studentId;
    private String studentName;
    private String studentEmail;
    private String studentPhoneNumber;
    private StudentCourse studentCourse;
    private Course course;
}
