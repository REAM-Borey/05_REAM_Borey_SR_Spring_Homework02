package org.example.borey.controller;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.example.borey.model.entiry.Course;
import org.example.borey.model.entiry.Student;
import org.example.borey.model.request.StudentRequest;
import org.example.borey.model.response.ApiResponse;
import org.example.borey.model.response.StudentResponse;
import org.example.borey.repository.StudentRepository;
import org.example.borey.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/students/")
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<Student>>> getAllStudent(@RequestParam("1") int page,
                                                                    @RequestParam("10") int size){
        return ResponseEntity.ok(
                ApiResponse.<List<Student>>builder()
                        .message("Get All Student successfully")
                        .payload(studentService.getAllStudent(page,size))
                        .status(HttpStatus.OK)
                        .time(LocalDateTime.now())
                        .build()
        );
    }

    @GetMapping("{student-id}")
    public ApiResponse<Student> getStudentById(@PathVariable("student-id") Long id){
        ApiResponse<Student> students = ApiResponse.<Student>builder()
                .message("Get student by id is successfully")
                .payload(studentService.getStudentById(id))
                .status(HttpStatus.OK)
                .time(LocalDateTime.now())
                .build();
        return students;
    }

    @PostMapping
    public ApiResponse<Student> saveStudent(@RequestBody StudentRequest studentRequest){
        ApiResponse<Student> students = ApiResponse.<Student>builder()
                .message("Create student successfully")
                .payload(studentService.saveStudent(studentRequest))
                .status(HttpStatus.OK)
                .time(LocalDateTime.now())
                .build();
        return students;
    }


    @PutMapping("{student-id}")
    public ApiResponse<Student> updateStudent(@PathVariable("student-id") Long id){
        ApiResponse<Student> students = ApiResponse.<Student>builder()
                .message("Update student by id is successfully")
                .payload(studentService.getStudentById(id))
                .status(HttpStatus.OK)
                .time(LocalDateTime.now())
                .build();
        return students;
    }

}
