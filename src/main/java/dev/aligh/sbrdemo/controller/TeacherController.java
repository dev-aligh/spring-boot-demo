package dev.aligh.sbrdemo.controller;

import dev.aligh.sbrdemo.model.Teacher;
import dev.aligh.sbrdemo.service.ITeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teachers")
@RequiredArgsConstructor
public class TeacherController {
    private final ITeacherService teacherService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Teacher>> getTeachers() {
        return new ResponseEntity<>(teacherService.getTeachers() , HttpStatus.OK);
    }

    @PostMapping(produces = "application/json")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }
}
