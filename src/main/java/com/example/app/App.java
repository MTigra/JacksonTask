package com.example.app;


import com.example.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;
import java.util.Random;

public class App {
    static Random rnd = new Random();
    static String[] NAMES = {"Артем", "Вадим", "Тигран",
            "Антон", "Михаил", "Ирина", "Ольга", "Аня", "Ратмир", "Айдар", "Григорий",
            "Игорь", "Петр", "Катя", "Геннадий", "Василий"
    };

    private static String getRadomName() {
        return NAMES[rnd.nextInt(NAMES.length)];
    }

    private static Date getRandomBirthDate() {
        return null;
    }

    private static Student createRandomStudent() {
        Student student = createStudent(getRadomName(), getRandomBirthDate());
        return student;
    }

    private static Student createStudent(String name, Date birthDate) {
        Student student = new Student();
        student.setBirthDate(birthDate);
        student.setName(name);
        student.setId(rnd.nextLong());
        return student;
    }

    public static void main(String[] args) {


        ObjectMapper objectMapper = new ObjectMapper();

    }
}
