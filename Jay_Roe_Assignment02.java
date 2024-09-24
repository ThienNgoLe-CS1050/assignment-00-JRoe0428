import javax.swing.JOptionPane;

public class Jay_Roe_Assignment02{

    public static void main(String[] args) {
        // Variable declaration
        String firstName;
        char middleInitial;
        String lastName;
        int age;
        double grossAnnualPay;
        double taxRate;
        double netAnnualPay;

        // Reading input from user using JOptionPane
        firstName = JOptionPane.showInputDialog("Enter your first name:");
        middleInitial = JOptionPane.showInputDialog("Enter your middle initial:").charAt(0);
        lastName = JOptionPane.showInputDialog("Enter your last name:");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog("Enter your annual gross pay:"));
        taxRate = Double.parseDouble(JOptionPane.showInputDialog("Enter your tax rate (e.g., 0.30 for 30%):"));

        // Processing data
        netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);

        // Displaying the output to the console
        System.out.println("Hello " + firstName + " " + middleInitial + ". " + lastName + ",");
        System.out.println("You are " + age + " years old now.");
        System.out.printf("It is amazing that you made $%.2f this year. With the tax rate of %.2f, you can take home $%.2f.%n", 
                            grossAnnualPay, taxRate, netAnnualPay);
    }
}