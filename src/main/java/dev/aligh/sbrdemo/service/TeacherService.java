package dev.aligh.sbrdemo.service;

import dev.aligh.sbrdemo.model.Teacher;
import dev.aligh.sbrdemo.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService implements ITeacherService{
    private final TeacherRepository teacherRepository;
    @Override
    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return null;
    }

    @Override
    public Teacher updateTeacher(Teacher teacher, Long id) {
        return null;
    }

    @Override
    public void deleteTeacher(Long id) {

    }
}
