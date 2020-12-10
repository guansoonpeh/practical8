
package Q1;

public class FullTimeEmployee extends Employee{
    private double basicSalary;
    private double allowance;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double basicSalary, double allowance, int id, String name) {
        super(id, name);
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
    
    public String toString() {
        return "Basic Salary : " + basicSalary + "\n"+
               "Allowance : "  + allowance ;
    }
}
