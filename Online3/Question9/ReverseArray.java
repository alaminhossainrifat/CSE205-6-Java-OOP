package Online3.Question9;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        reverseArray(arr);
        
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }

    public static void reverseArray(int[] array) {
        int left = 0;                  
        int right = array.length - 1;  
        
        while (left < right) {

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            
            left++;
            right--;
        }
    }
}

