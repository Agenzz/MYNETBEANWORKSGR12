
package Naraja_Employee;

public class Executive extends Employee {
    private double bonus;
   
public Executive (String eName, String eAddress, String ePhone, 
        String socSecNumber, double rate) {
   
    super (eName, eAddress, ePhone, socSecNumber, rate);
    bonus=0; //no bonus yet
} 
    //Awards specified bonus
public void awardBonus (double execBonus) {
    bonus=execBonus;
}
// compute and return pays for executive, its regular employee payment w/ one-time bonus


    public double pay() {
    
    double payment=super.pay() + bonus;
    bonus=0;
    return payment;
}
}
