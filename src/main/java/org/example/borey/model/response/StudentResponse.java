package org.example.borey.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {
    private int studentId;
    private String studentName;
    private String studentEmail;
    private String studentPhoneNumber;
    private List<Integer> studentCourse;
}
