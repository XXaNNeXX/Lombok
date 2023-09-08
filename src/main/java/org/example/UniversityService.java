package org.example;

import java.awt.*;

public class UniversityService {

    public double averageGrade(Course course) {
        double totalGrade = 0;
        int courseCount = 0;
        for(Student student : course.getStudents()) {
            totalGrade = student.getGrade();
            courseCount++;
        }
        return totalGrade/courseCount;
    }

}
