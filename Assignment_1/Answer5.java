// Write a Java program to find the area and perimeter of a rectangle.
import java.util.*;
public class Answer5 { 
        public static void main(String[] strings) {
            Scanner scanner = new Scanner(System.in);
            double width, height;

            System.out.print("Enter Width: ");
            width = scanner.nextDouble();

            System.out.print("Enter Height: ");
            height = scanner.nextDouble();
     
             // Calculate the perimeter of the rectangle
             double perimeter = 2 * (height + width);
             
             // Calculate the area of the rectangle
             double area = width * height;			
     
             System.out.printf("Perimeter is %.1f \n", perimeter);
             System.out.printf("Area is %.1f \n", area);
            
             scanner.close();
        }
}
