package academy.devdojo.youtube.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academy.devdojo.youtube.core.model.Course;
import academy.devdojo.youtube.course.services.CourseService;

@RestController
@RequestMapping("/v1/admin/course")
public class CourseController {

    @Autowired
    private CourseService courseService;
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Course>> list(Pageable pageable) {
        return ResponseEntity.ok(courseService.list(pageable));
    }
}
