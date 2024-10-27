package Practice_Problem.Car;

public class Tesla extends AllCar{
    private boolean autoDrive;

    public Tesla(String model, String engine, double wheel, int seat, boolean autoDrive) {
        super("Tesla", model, engine, wheel, seat);
        this.autoDrive = true;
    }
    public void autoDrive(){
        System.out.println("Auto Drive: "+autoDrive);
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Auto Drive: "+autoDrive);
    }
} 
