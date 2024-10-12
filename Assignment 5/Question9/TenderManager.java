package Question9;

import java.util.Scanner;

public class TenderManager {
    private Tender[] tenders;

    public TenderManager() {
        tenders = new Tender[5]; 
    }

    public void acceptTenders() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter cost for Tender " + (i + 1) + ": ");
            double cost = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Enter company name for Tender " + (i + 1) + ": ");
            String companyName = scanner.nextLine();
            tenders[i] = new Tender(cost, companyName);
        }
        scanner.close();
    }

    public void displayMinCostTender() {
        if (tenders.length == 0) {
            System.out.println("No tenders available.");
            return;
        }

        Tender minTender = tenders[0]; 

        for (int i = 1; i < tenders.length; i++) {
            if (tenders[i].getCost() < minTender.getCost()) {
                minTender = tenders[i]; 
            }
        }

        System.out.println("Company with minimum cost: " + minTender.getCompanyName());
    }
    
}

