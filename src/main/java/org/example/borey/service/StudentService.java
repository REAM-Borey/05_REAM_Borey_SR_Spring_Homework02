package org.example.borey.service;

import org.example.borey.model.entiry.Student;
import org.example.borey.model.request.StudentRequest;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(StudentRequest studentRequest);

    List<Student> updateStudent();

    Student getStudentById(Long id);
}
