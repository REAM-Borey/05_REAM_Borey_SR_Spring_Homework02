package org.example.borey.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.borey.model.entiry.Course;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequest {
    private String studentName;
    private String studentEmail;
    private String studentPhoneNumber;
    private Course studentCourse;
}
