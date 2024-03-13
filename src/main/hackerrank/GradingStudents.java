package main.hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GradingStudents {

    public static void main(String[] args) throws IOException {

    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade < 0 || grade > 100) {
                System.out.println("Incorrect grade");
                break;
            }
            if (grade < 38) {
                finalGrades.add(grade);
            } else {
                int gradeByFive = grade + (5 - (grade % 5));
                if ((gradeByFive - grade) < 3) {
                    finalGrades.add(gradeByFive);
                } else {
                    finalGrades.add(grade);
                }
            }
        }
        return finalGrades;
    }

}
