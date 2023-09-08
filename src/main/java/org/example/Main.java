package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = Student.builder()
                .id("1")
                .name("Anne")
                .address("Hamburg")
                .grade(2)
                .build();

        Student student2 = Student.builder()
                .id("2")
                .name("Hermine")
                .address("???")
                .grade(3)
                .build();

        List<Student> allStudents = new ArrayList<>();
        allStudents.add(student1);
        allStudents.add(student2);

        Teacher teacher1 = Teacher.builder()
                .id("1")
                .name("Harry Potter")
                .subject("Magic")
                .build();

        Course flyOnBroom = Course.builder()
                .id("100")
                .name("How to manage a flying broom")
                .students(allStudents)
                .teacher(teacher1)
                .build();

        System.out.println(flyOnBroom);
        System.out.println(flyOnBroom.getStudents());
        System.out.println(teacher1.withId("102"));
        System.out.println(teacher1.name());

        UniversityService uniService = new UniversityService();
        System.out.println(uniService.averageGrade(flyOnBroom));
    }
}