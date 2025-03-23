package org.example.borey.service.serviceImpl;


import org.example.borey.model.entiry.Instructor;
import org.example.borey.model.request.InstructorRequest;
import org.example.borey.repository.InstructorRepository;
import org.example.borey.service.InstructorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {
    public final InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public List<Instructor> getInstructor() {
        return instructorRepository.getInstructor();
    }

    @Override
    public Instructor getInstructorById(int id) {
        return instructorRepository.getInstructorById(id);
    }

    @Override
    public Instructor insertInstructor(InstructorRequest instructorRequest) {
        return instructorRepository.insertInstructor(instructorRequest);
    }

    @Override
    public Instructor deleteInstructorById(int id) {
        return instructorRepository.deleteInstructorById(id);
    }

    @Override
    public Instructor updateInstructorById(int id, InstructorRequest instructorRequest) {
        return instructorRepository.updateInstructorById(id,instructorRequest);
    }

}
