package LabQuiz.Type2;

import java.io.*;
import java.util.*;

class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

class FileProcessor {
    private List<Student> students = new ArrayList<>();

    public void readFile(String inputFileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    double score = Double.parseDouble(parts[1].trim());
                    students.add(new Student(name, score));
                }
            }
        }
    }

    public double calculateAverageScore() {
        double totalScore = 0;
        for (Student student : students) {
            totalScore += student.getScore();
        }
        return totalScore / students.size();
    }

    public List<Student> findTopScorers() {
        List<Student> topScorers = new ArrayList<>();
        double highestScore = 0;
        for (Student student : students) {
            if (student.getScore() > highestScore) {
                highestScore = student.getScore();
                topScorers.clear();
                topScorers.add(student);
            } else if (student.getScore() == highestScore) {
                topScorers.add(student);
            }
        }
        return topScorers;
    }

    public void writeResults(String outputFileName, double averageScore, List<Student> topScorers) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            writer.write(String.format("Average Score: %.2f%n", averageScore));
            writer.write("Top Scorer(s):\n");
            for (Student student : topScorers) {
                writer.write(student.getName() + " - " + student.getScore() + "\n");
            }
        }
    }
}

public class StudentId {
    public static void main(String[] args) {
        //String inputFileName = "C:\\path\\to\\your\\directory\\Students.txt"; // Update this path
        String inputFileName = "D:\\Rifat\\CSE205\\OOP Lab\\LabQuiz\\Type2\\Students.txt"; // Update this path
        //String outputFileName = "StudentId_results.txt";
        String outputFileName = "D:\\Rifat\\CSE205\\OOP Lab\\LabQuiz\\Type2\\StudentId_results.txt";

        FileProcessor fileProcessor = new FileProcessor();
        try {
            // Step 1: Read file
            fileProcessor.readFile(inputFileName);

            // Step 2: Calculate average score
            double averageScore = fileProcessor.calculateAverageScore();

            // Step 3: Find top scorers
            List<Student> topScorers = fileProcessor.findTopScorers();

            // Step 4: Write results to a file
            fileProcessor.writeResults(outputFileName, averageScore, topScorers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
