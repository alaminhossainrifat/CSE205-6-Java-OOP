
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM_GUI {
    private BankAccount account;
    private JFrame frame;
    private JTextField balanceField, amountField;

    public ATM_GUI(BankAccount account) {
        this.account = account;
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("PU ATM Machine");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold all components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        JLabel welcomeLabel = new JLabel("Welcome to PU ATM Machine", JLabel.CENTER);
        panel.add(welcomeLabel);

        // Text field for displaying the balance
        balanceField = new JTextField("Balance: " + String.format("%.2f", account.getBalance()));
        balanceField.setEditable(false);
        panel.add(balanceField);

        // Input field for entering deposit/withdraw amounts
        amountField = new JTextField();
        panel.add(amountField);

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4));

        JButton checkBalanceButton = new JButton("Check Balance");
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JButton exitButton = new JButton("Exit");

        buttonPanel.add(checkBalanceButton);
        buttonPanel.add(depositButton);
        buttonPanel.add(withdrawButton);
        buttonPanel.add(exitButton);

        panel.add(buttonPanel);

        // Add the panel to the frame
        frame.add(panel);

        // Action listeners for buttons
        checkBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBalance();
            }
        });

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposit();
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdraw();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Thank you for using the ATM.");
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    private void checkBalance() {
        balanceField.setText("Balance: " + String.format("%.2f", account.getBalance()));
    }

    private void deposit() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            if (account.deposit(amount)) {
                JOptionPane.showMessageDialog(frame, "Deposited: " + amount);
                checkBalance();
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid deposit amount.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid amount.");
        }
    }

    private void withdraw() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            if (account.withdraw(amount)) {
                JOptionPane.showMessageDialog(frame, "Withdrew: " + amount);
                checkBalance();
            } else {
                JOptionPane.showMessageDialog(frame, "Insufficient balance or invalid amount.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid amount.");
        }
    }

    

}