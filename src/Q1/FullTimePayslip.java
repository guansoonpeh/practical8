package Q1;

public class FullTimePayslip extends Payslip implements Contributor {

    private static int volunteerCount = 0;
    private static double donationFund = 0;
    
    
    private double basicSalary;
    private double allowance;
    private double donationAmount;
    private char contribution;     // 'V'olunteer or 'D'onation

    public FullTimePayslip() {

    }

    public FullTimePayslip(Employee employee, double basicSalary, double allowance) {
        super(employee);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public char getContribution() {
        return contribution;
    }

    public void setContribution(char contribution) {
        this.contribution = contribution;
    }

    public static int getVolunteerCount() {
        return volunteerCount;
    }

    public static double getDonationFund() {
        return donationFund;
    }
        
    

    public double calculateSalary() {
         return basicSalary + allowance - donationAmount;
    }

    public void volunteer() {
        contribution = 'V';
        volunteerCount += 1;
        donationAmount = 0;
    }
    
    public void donate(double amount){
        contribution = 'D';
        donationAmount = amount;
        donationFund += amount;
    }

    public String toString() {
        return super.toString() + "\n"
                + "Contribution: " + (contribution == 'D' ? "Donation " : "Volunteer") + "\n"
                + "Donation Amount : RM " + donationAmount + "\n"
                + "Salary: RM " +  calculateSalary()  + "\n";
    }
}
