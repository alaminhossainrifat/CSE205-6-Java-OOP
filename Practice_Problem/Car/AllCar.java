package Practice_Problem.Car;

public class AllCar {
    private String name;
    protected String model;
    private String engine;
    private double wheel;
    private int seat;

    public AllCar(String name, String model, String engine, double wheel, int seat) {
        this.name = name;
        this.model = model;
        this.engine = engine;
        this.wheel = wheel;
        this.seat = seat;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Model: "+model);
        System.out.println("Engine: "+engine);
        System.out.println("Wheel: "+wheel);
        System.out.println("Seat: "+seat);
    }

}
