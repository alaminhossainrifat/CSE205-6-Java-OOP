package Question9;

public class Tender {
    private double cost;
    private String companyName;

    public Tender(double cost, String companyName) {
        this.cost = cost;
        this.companyName = companyName;
    }

    public double getCost() {
        return cost;
    }

    public String getCompanyName() {
        return companyName;
    }
}

