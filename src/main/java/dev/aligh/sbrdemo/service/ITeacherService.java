package dev.aligh.sbrdemo.service;

import dev.aligh.sbrdemo.model.Teacher;

import java.util.List;

public interface ITeacherService {
    List<Teacher> getTeachers();

    Teacher addTeacher(Teacher teacher);

    Teacher getTeacherById(Long id);

    Teacher updateTeacher(Teacher teacher, Long id);

    void deleteTeacher(Long id);
}
