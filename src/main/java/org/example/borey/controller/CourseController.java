package org.example.borey.controller;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.example.borey.model.entiry.Course;
import org.example.borey.model.entiry.Instructor;
import org.example.borey.model.request.CourseRequest;
import org.example.borey.model.request.InstructorRequest;
import org.example.borey.model.response.ApiResponse;
import org.example.borey.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/courses")
public class CourseController {
    private final CourseService courseService;
    @GetMapping
    public ResponseEntity<ApiResponse<List<Course>>> getAllCourse(@RequestParam("1") int page,
                                                                  @RequestParam("10") int size){
        return ResponseEntity.ok(
                ApiResponse.<List<Course>>builder()
                        .message("Get All Course successfully")
                        .payload(courseService.getAllCourse(page,size))
                        .status(HttpStatus.OK)
                        .time(LocalDateTime.now())
                        .build()
        );
    }
    @GetMapping("{courses-id}")
    public ResponseEntity<ApiResponse<Course>> getCourseById(@PathVariable("courses-id") int id){
        return ResponseEntity.ok(
                ApiResponse.<Course>builder()
                        .message("Get Course By Id Successfully")
                        .payload(courseService.getCourseById(id))
                        .status(HttpStatus.OK)
                        .time(LocalDateTime.now())
                        .build()
        );
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Course>> createCourse(@RequestBody CourseRequest courseRequest){
        return ResponseEntity.ok(
                ApiResponse.<Course>builder()
                        .message("create Course successfully")
                        .payload(courseService.createCourse(courseRequest))
                        .status(HttpStatus.OK)
                        .time(LocalDateTime.now())
                        .build()
        );
    }
    @PutMapping("{courses-id}")
    public ResponseEntity<ApiResponse<Course>> updateCourseById(@PathVariable("courses-id") int id, @RequestBody CourseRequest courseRequest){
        return ResponseEntity.ok(
                ApiResponse.<Course>builder()
                        .message("update Course successfully")
                        .payload(courseService.updateCourseById(id,courseRequest))
                        .status(HttpStatus.OK)
                        .time(LocalDateTime.now())
                        .build()
        );
    }
    @DeleteMapping("{courses-id}")
    public ResponseEntity<ApiResponse<Course>> deleteCourseById(@PathVariable("courses-id") int id){
        return ResponseEntity.ok(
                ApiResponse.<Course>builder()
                        .message("Remove Course successfully")
                        .payload(courseService.deleteCourseById(id))
                        .status(HttpStatus.OK)
                        .time(LocalDateTime.now())
                        .build()
        );
    }
}
