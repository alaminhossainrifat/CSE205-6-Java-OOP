package Assignment8;

public class Office extends Building {
    private int telephones;
    private int tables;

    public Office(int floors, int rooms, double totalFootage, int telephones, int tables) {
        super(floors, rooms, totalFootage); 
        this.telephones = telephones;
        this.tables = tables;
    }

    public int getTelephones() {
        return telephones;
    }

    public int getTables() {
        return tables;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Office Information:");
        System.out.println("Telephones: " + telephones);
        System.out.println("Tables: " + tables);
    }
}

