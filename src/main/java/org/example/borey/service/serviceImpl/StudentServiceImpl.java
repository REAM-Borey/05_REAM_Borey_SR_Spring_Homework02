package org.example.borey.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.example.borey.model.entiry.Student;
import org.example.borey.model.request.StudentRequest;
import org.example.borey.repository.StudentRepository;
import org.example.borey.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepositories;


    @Override
    public List<Student> getAllStudent(int page, int size) {
        return studentRepositories.getAllStudent(page,size);
    }

    @Override
    public Student saveStudent(StudentRequest studentRequest) {
        return studentRepositories.saveStudent(studentRequest);
    }

    @Override
    public List<Student> updateStudent() {
        return List.of();
    }


    @Override
    public Student getStudentById(Long id) {
        return studentRepositories.getStudentById(id);
    }
}
