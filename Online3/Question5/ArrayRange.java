package Online3.Question5;

public class ArrayRange {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 9, 2};
        int range = findRange(array);
        System.out.println("The range of the array is: " + range);
    }

    public static int findRange(int[] array) {
        if (array.length == 0) {
            System.out.println("Array cannot be empty");
        }
        
        int min = array[0];
        int max = array[0];
        
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        return max - min;
    }
}

