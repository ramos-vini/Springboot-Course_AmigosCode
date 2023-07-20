package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student("Johnny", "johnnybravo@email.com", LocalDate.of(2020,7, 24))
        );
    }
}
