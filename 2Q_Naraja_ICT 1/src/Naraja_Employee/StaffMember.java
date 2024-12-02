
package Naraja_Employee;

abstract public class StaffMember {
    
//protected information stuff
    protected String name;
    protected String address;
    protected String phone;
    
    //specified information stuff
    public StaffMember (String eName, String eAddress, String ePhone) {
        name=eName;
        address=eAddress;
        phone=ePhone;
    }
    
    // Fetched employee info comes back
    public String toString(){
        String result = "Name: " + name + "\n";
            result += "Residence Address" + address + "\n";
            result += "Contact Number:" + phone;
            return result;
            
    }
        public abstract double pay();
}
