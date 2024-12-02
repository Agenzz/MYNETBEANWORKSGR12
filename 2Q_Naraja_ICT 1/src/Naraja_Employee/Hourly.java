
package Naraja_Employee;

public class Hourly extends Employee {
    private int hoursWorked;
    public Hourly (String eName, String eAddress, String ePhone,
            String socSecNumber, double rate) {
        
        super (eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked=0;
        
    }
    // add specified hours that employye accumulated.
    public void addHours (int moreHours) {
        hoursWorked += moreHours;
    }
    
    //compute and return pay for hourly
    public double pay() {
        double payment=payRate*hoursWorked;
        hoursWorked=0;
        return payment;
    }
    
    // return string info about hourly employee
    public String toString() {
        String result=super.toString();
        result += "\nCurrent hours: " + hoursWorked;
        return result;
    }
}
