package Question4;

public class ThreeDigitNumber {
    private int number;

    ThreeDigitNumber(int number) {
        this.number = number;
        if(number < 100 || number > 999) {
            System.out.println("Number is not a three digit number");
        }
    }

    public int reverse() {
        int reverse = 0;
        while(number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }

    void display() {
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reverse());
    }
}
