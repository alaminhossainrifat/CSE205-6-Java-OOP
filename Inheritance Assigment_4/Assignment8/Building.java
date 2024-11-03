package Assignment8;

public class Building {
    private int floors;
    private int rooms;
    private double totalFootage;

    public Building(int floors, int rooms, double totalFootage) {
        this.floors = floors;
        this.rooms = rooms;
        this.totalFootage = totalFootage;
    }

    public int getFloors() {
        return floors;
    }

    public int getRooms() {
        return rooms;
    }

    public double getTotalFootage() {
        return totalFootage;
    }

    public void displayInfo() {
        System.out.println("Building Information:");
        System.out.println("Floors: " + floors);
        System.out.println("Rooms: " + rooms);
        System.out.println("Total Footage: " + totalFootage + " sq ft");
    }
}

