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
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a custom panel to hold all components
        GradientPanel panel = new GradientPanel();
        panel.setLayout(new BorderLayout());

        // Title section with picture
        JPanel titlePanel = new JPanel(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Welcome to PU ATM Machine", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 35));
        titlePanel.add(welcomeLabel, BorderLayout.CENTER);

        // Add a picture to the title section
        // JLabel pictureLabel = new JLabel(new ImageIcon("./Images/pu-logo-1.png"));
        // titlePanel.add(pictureLabel, BorderLayout.WEST);

        panel.add(titlePanel, BorderLayout.NORTH);

        // Left panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1));

        JButton checkBalanceButton = createGradientButton("Check Balance");
        JButton depositButton = createGradientButton("Deposit");
        JButton withdrawButton = createGradientButton("Withdraw");
        JButton exitButton = createGradientButton("Exit");

        buttonPanel.add(checkBalanceButton);
        buttonPanel.add(depositButton);
        buttonPanel.add(withdrawButton);
        buttonPanel.add(exitButton);

        panel.add(buttonPanel, BorderLayout.WEST);

        // Right panel for balance and input fields
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(3, 1));

        balanceField = new JTextField("Balance: " + String.format("%.2f", account.getBalance()));
        balanceField.setEditable(false);
        rightPanel.add(balanceField);

        amountField = new JTextField();
        rightPanel.add(amountField);

        panel.add(rightPanel, BorderLayout.CENTER);

        // Add the panel to the frame
        frame.add(panel);

        // Action listeners for buttons
        checkBalanceButton.addActionListener(e -> checkBalance());
        depositButton.addActionListener(e -> deposit());
        withdrawButton.addActionListener(e -> withdraw());
        exitButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Thank you for using the ATM.");
            System.exit(0);
        });

        frame.setVisible(true);
    }

    private JButton createGradientButton(String text) {
        JButton button = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                int width = getWidth();
                int height = getHeight();
                Color color1 = new Color(111, 123, 247); // RGB values for #6f7bf7
                Color color2 = new Color(155, 248, 244); // RGB values for #9bf8f4
                GradientPaint gp = new GradientPaint(0, 0, color1, width, height, color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, width, height);
                super.paintComponent(g);
            }
        };
        button.setContentAreaFilled(false);
        button.setOpaque(true);
        return button;
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            double initialBalance = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    String input = JOptionPane.showInputDialog(null, "Enter initial balance:");
                    if (input == null) {
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

    // Custom JPanel with gradient background
    class GradientPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            Color color1 = new Color(111, 123, 247); // RGB values for #6f7bf7
            Color color2 = new Color(155, 248, 244); // RGB values for #9bf8f4
            GradientPaint gp = new GradientPaint(0, 0, color1, width, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }
}
