package Practice_Problem.Car;

public class BMW extends AllCar{
    private boolean driveAssist;

    public BMW(String model, String engine, double wheel, int seat, boolean driveAssist) {
        super("BMW", model, engine, wheel, seat);
        this.driveAssist = true;
    }

    public void driveAssist(){
        System.out.println("Drive Assist: "+driveAssist);
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Drive Assist: "+driveAssist);
    }
    
}
