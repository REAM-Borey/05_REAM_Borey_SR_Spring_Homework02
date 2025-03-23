package org.example.borey.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstructorResponse {
    private int instructorId;
    private String instructorName;
    private String instructorEmail;
}
