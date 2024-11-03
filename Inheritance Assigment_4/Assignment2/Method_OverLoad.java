package Assignment2;

public class Method_OverLoad {
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
    void add(){
        System.out.println("No Action");
    }
}
