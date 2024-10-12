package Question3;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(Complex c) {
        double RealResult = this.real + c.real;
        double ImaginaryResult = this.imaginary + c.imaginary;

        System.out.println("----------Total Complex Number----------");
        System.out.println("Real: "+RealResult);
        System.out.println("Imaginary: "+ImaginaryResult);
    }
}
