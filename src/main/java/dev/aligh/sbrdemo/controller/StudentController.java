package dev.aligh.sbrdemo.controller;

import dev.aligh.sbrdemo.model.Student;
import dev.aligh.sbrdemo.service.IStudentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final IStudentService studentService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Student>> getStudents() {
        return new ResponseEntity<>(studentService.geStudents(), HttpStatus.OK);
    }

    @PostMapping(produces = "application/json")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping(value = "{id}" , produces = "application/json")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PutMapping(value = "{id}", produces = "application/json")
    public Student updateStudent(@RequestBody Student student, @PathVariable Long id) {
        return studentService.updateStudent(student, id);
    }

    @DeleteMapping(value = "{id}", produces = "application/json")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
