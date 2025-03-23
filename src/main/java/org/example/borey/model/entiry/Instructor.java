package org.example.borey.model.entiry;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Instructor {
    private int instructorId;
    private String instructorName;
    private String instructorEmail;
}
