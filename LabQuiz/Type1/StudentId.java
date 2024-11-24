package LabQuiz.Type1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class StudentId {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String inputFileName = sc.nextLine();
        System.out.println("Output file name: ");
        String outputFileName = sc.nextLine();

        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFileName);

        double total = 0;
        while (in.hasNextDouble()) {
            double value = in.nextDouble();
            out.printf("%15%.2f\n", value);
            total += value;
        }
        out.printf("Total: %.2f\n", total);
        in.close();
        out.close();
        sc.close();
        
    }
}