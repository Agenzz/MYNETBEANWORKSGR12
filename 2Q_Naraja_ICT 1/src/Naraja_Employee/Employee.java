package Naraja_Employee;

public class Employee extends StaffMember {
    protected String sssNumber;
    protected double payRate;
    
public Employee (String eName, String eAddress, String ePhone, 
        String socSecNumber, double rate) {

    super (eName, eAddress, ePhone);
    sssNumber=socSecNumber;
    payRate=rate;
    
}
    //String info of employee

    @Override
    public String toString(){
    
    String result=super.toString();
    result += "\nSocial Security Number: " + sssNumber;
    return result;
}

//return payrate for employee
    @Override
    public double pay(){
    return payRate;
}
}
