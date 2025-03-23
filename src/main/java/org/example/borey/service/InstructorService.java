package org.example.borey.service;


import org.example.borey.model.entiry.Instructor;
import org.example.borey.model.request.InstructorRequest;

import java.util.List;

public interface InstructorService {

    List<Instructor> getInstructor();

    Instructor getInstructorById(int id);

    Instructor insertInstructor(InstructorRequest instructorRequest);

    Instructor deleteInstructorById(int id);

    Instructor updateInstructorById(int id, InstructorRequest instructorRequest);
}
