package org.example.borey.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.example.borey.model.entiry.Course;
import org.example.borey.model.request.CourseRequest;
import org.example.borey.repository.CourseRepository;
import org.example.borey.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourse(int page,int size) {
        int offset = (page - 1) * size;
        return courseRepository.getAllCourse(offset,size);
    }

    @Override
    public Course getCourseById(int id) {
        return courseRepository.getCourseById(id);
    }

    @Override
    public Course createCourse(CourseRequest courseRequest) {
        return courseRepository.createCourse(courseRequest);
    }

    @Override
    public Course updateCourseById(int id,CourseRequest courseRequest) {
        return courseRepository.updateCourseById(id,courseRequest);
    }

    @Override
    public Course deleteCourseById(int id) {
        return courseRepository.deleteCourseById(id);
    }
}
