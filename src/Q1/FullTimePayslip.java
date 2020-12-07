package Q1;

public class FullTimePayslip {
 
  private double basicSalary;
  private double allowance;
  private double donationAmount;
  private char contribution;     // 'V'olunteer or 'D'onation

   public FullTimePayslip() {
   
   }

    public FullTimePayslip(Employee employee, double basicSalary, double allowance) {
     //todo :: set employee to superclass
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

    public String toString() {
       return super.toString() + "\n" +
              "Contribution: " + (contribution == 'D' ? "Donation " : "Volunteer") + "\n" +
              "Donation Amount : RM " + donationAmount + "\n" +
              "Salary: RM " + "\n" ;  //todo:: display salary
    }
}
