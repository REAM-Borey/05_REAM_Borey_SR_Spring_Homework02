package org.example.borey.controller;


import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.example.borey.model.entiry.Instructor;
import org.example.borey.model.request.InstructorRequest;
import org.example.borey.model.response.ApiResponse;
import org.example.borey.Exception.NotFoundException;
import org.example.borey.service.InstructorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/instructors")
public class InstructorController {
    public final InstructorService instructorService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<Instructor>>>  getInstructor(){

        return ResponseEntity.ok(
             ApiResponse.<List<Instructor>>builder()
                     .message("Get All Instructor successfully")
                     .payload(instructorService.getInstructor())
                     .status(HttpStatus.OK)
                     .time(LocalDateTime.now())
                     .build()
        );
    }

    @GetMapping("/{instructor-id}")
    public ResponseEntity<ApiResponse<Instructor>> getInstructorById(@PathVariable("instructor-id") int id){
        try {
            if (instructorService.getInstructorById(id) !=null){
                return ResponseEntity.ok(
                        ApiResponse.<Instructor>builder()
                                .message("Get Instructor successfully")
                                .payload(instructorService.getInstructorById(id))
                                .status(HttpStatus.OK)
                                .time(LocalDateTime.now())
                                .build()
                );
            }else
                throw new NotFoundException("Instructor id "+instructorService.getInstructorById(id)+"not found");
        } catch (NotFoundException e) {
            return null;
        }
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Instructor>> insertInstructor(@RequestBody InstructorRequest instructorRequest){
        return ResponseEntity.ok(
                ApiResponse.<Instructor>builder()
                        .message("create instructor successfully")
                        .payload(instructorService.insertInstructor(instructorRequest))
                        .status(HttpStatus.OK)
                        .time(LocalDateTime.now())
                        .build()
        );
    }

    @DeleteMapping("{instructors-id}")
    public ResponseEntity<ApiResponse<Instructor>> deletetInstructorById(@Param("instructors-id") int id){
        return ResponseEntity.ok(
                ApiResponse.<Instructor>builder()
                        .message("Deleted instructor successfully")
                        .payload(instructorService.deleteInstructorById(id))
                        .status(HttpStatus.OK)
                        .time(LocalDateTime.now())
                        .build()
        );
    }

    @PutMapping("{instructors-id}")
    public ResponseEntity<ApiResponse<Instructor>> updateInstructorById(@Param("instructors-id") int id,@RequestBody InstructorRequest instructorRequest){
        return ResponseEntity.ok(
                ApiResponse.<Instructor>builder()
                        .message("Deleted instructor successfully")
                        .payload(instructorService.updateInstructorById(id,instructorRequest))
                        .status(HttpStatus.OK)
                        .time(LocalDateTime.now())
                        .build()
        );
    }
}
