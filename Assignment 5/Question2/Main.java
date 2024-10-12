package Question2;

public class Main {
    public static void main(String[] args) {
        
        Time time1 = new Time(2, 30, 45);
        Time time2 = new Time(1, 45, 50);

        time1.add(time2);
        time2.add(time2);
    }
}

