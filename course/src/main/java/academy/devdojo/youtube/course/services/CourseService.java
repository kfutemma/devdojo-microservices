package academy.devdojo.youtube.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import academy.devdojo.youtube.core.model.Course;
import academy.devdojo.youtube.core.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired(required = true)
    private CourseRepository courseRepository;
    
    public Iterable<Course> list(Pageable pageable) {
        return courseRepository.findAll(pageable);
    }
}
