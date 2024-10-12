package Question2;

public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void add(Time t) {
        int totalSeconds = this.sec + t.sec;
        int totalMinutes = this.min + t.min + (totalSeconds / 60);
        int totalHours = this.hour + t.hour + (totalMinutes / 60);

        int finalSec = totalSeconds % 60;
        int finalMin = totalMinutes % 60;
        int finalHour = totalHours; 
        
        System.out.println("----------Total Time----------");
        System.out.println("Hours: "+finalHour);
        System.out.println("Minutes: "+finalMin);
        System.out.println("Seconds: "+finalSec);
    }
}

