package Practice_Problem.All_Phone;

public class Samsung extends AllPhone{
    private String CameraQ;

    public Samsung(String model, String CameraQ){
        super("Samsung", model);
        this.CameraQ = CameraQ;
    }
    public void takePhoto(){
        System.out.println("Taking photo with Samsung Camera Quality: " + CameraQ);
        //System.out.println("Taking photo with" + CameraQ + "with Samsung phone" + super.Model);
    }

    @Override
    public void display(){
        super.display();
        // System.out.println("Camera Quality: "+CameraQ);
    }
}
