package Practice_Problem.All_Phone;

public class Apple extends AllPhone {
    private String cpu;

    public Apple(String model, String cpu){
        super("Apple", model);
        this.cpu = cpu;
    }

    public void setCpu(){
        //System.out.println("CPU: "+cpu);
        System.out.println("CPU: "+cpu+" in Apple phone "+super.Model);
    }

    @Override
    public void display(){
        super.display();
    // System.out.println("CPU: "+cpu);
    }
}
