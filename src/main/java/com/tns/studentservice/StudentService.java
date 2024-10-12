package com.tns.studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudent(Long id) {
        Optional<Student> student = repository.findById(id);
        return student.orElse(null);
    }

    public Student createStudent(Student student) {
        return repository.save(student);
    }

    public Student updateStudent(Long id, Student student) {
        if (repository.existsById(id)) {
            student.setId(id);
            return repository.save(student);
        }
        return null;
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }

    public Student getStudentByRollNumber(String rollNumber) {
        return repository.findByRollNumber(rollNumber).orElse(null);
    }

    public List<Student> getStudentsByDepartment(String department) {
        return repository.findByDepartment(department);
    }

    public List<Student> getStudentsBySemester(int semester) {
        return repository.findBySemester(semester);
    }

    public List<Student> getStudentsByDepartmentAndSemester(String department, int semester) {
        return repository.findByDepartmentAndSemester(department, semester);
    }
}
