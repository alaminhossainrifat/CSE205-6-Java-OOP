package Practice_Problem.All_Phone;

public class AllPhone {
    private  String Brand;
    protected String Model;
    boolean PhoneCall;
    boolean Message;
    boolean Sound;

    public AllPhone(String brand, String model) {
        this.Brand = brand;
        this.Model = model;
        this.PhoneCall = true;
        this.Message = true;
        this.Sound = true;
    }

    public void setPhoneCall(boolean phoneCall) {
        System.out.println(Brand +" "+ Model + " Phone Call is " + phoneCall);
    }
    public void setMessage(boolean message) {
        System.out.println(Brand +" "+ Model + " Message is " + message);
    }
    public void sound (boolean sound){
        System.out.println(Brand +" "+ Model + " Sound is " + sound);
    }

    public void display(){
        System.out.println("Brand: "+Brand);
        System.out.println("Model: "+Model);
        System.out.println("Phone Call: "+PhoneCall);
        System.out.println("Message: "+Message);
        System.out.println("Sound: "+Sound);
    }
}
