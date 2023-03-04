package com.example.ServiziEmail02.student.services;

import com.example.ServiziEmail02.student.entities.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    static List<Student> students = Arrays.asList(
            new Student("1", "Fabio", "Frattarelli", "fabiofra88@gmail.com"),
            new Student("2", "Mario", "Gialli", "giorgiopico@hotmail.it"),
            new Student("3", "Giorgio", "Verdi", "giorgio.verdi@gmail.com"),
            new Student("4", "Carlo", "Rossi", "carlo.gialli@gmail.com")
    );

    public Student getStudentById(String studentId){
        Optional<Student> studentFromDB = students.stream().filter(student -> student.getId().equals(studentId)).findAny();
        return studentFromDB.isPresent() ? studentFromDB.get() : null;
    }
}
