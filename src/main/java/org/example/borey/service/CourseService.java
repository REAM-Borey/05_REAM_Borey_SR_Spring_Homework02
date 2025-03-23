package org.example.borey.service;

import org.example.borey.model.entiry.Course;
import org.example.borey.model.request.CourseRequest;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourse(int page,int size);

    Course getCourseById(int id);

    Course createCourse(CourseRequest courseRequest);

    Course updateCourseById(int id,CourseRequest courseRequest);

    Course deleteCourseById(int id);
}
