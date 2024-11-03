package Assignment8;

public class Main {
    public static void main(String[] args) {
        Building building = new Building(5, 20, 10000);
        building.displayInfo();

        System.out.println(); 

        House house = new House(2, 8, 2500, 3, 2);
        house.displayInfo();

         Office office = new Office(3, 15, 5000, 10, 5);
         office.displayInfo();
    }
}

