import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            double initialBalance = 0;
            boolean validInput = false;
    
            while (!validInput) {
                try {
                    String input = JOptionPane.showInputDialog(null, "Enter initial balance:");
                    if (input == null || input.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "You must enter an initial balance to proceed.");
                    } else {
                        initialBalance = Double.parseDouble(input);
                        validInput = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for the initial balance.");
                }
            }
    
            BankAccount userAccount = new BankAccount(initialBalance);
            new ATM_GUI(userAccount);
        });
    }
}