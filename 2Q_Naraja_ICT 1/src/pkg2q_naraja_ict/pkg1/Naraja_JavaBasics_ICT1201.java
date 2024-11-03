
package pkg2q_naraja_ict.pkg1;

public class Naraja_JavaBasics_ICT1201 {

    // introduction method
    public void introduction(String name, String hobby, int age) {
        System.out.print("Good day I’m " + name);
        System.out.println(" age " + age);
        System.out.println("My hobbies are " + hobby);
        System.out.println("-~-~-~***~-~-~-");
    }
    
    // 2. Locate main method
    public static void main(String[] args) {
        // 4. Create an instance of the class and call the introduction method
        Naraja_JavaBasics_ICT1201 callClass = new Naraja_JavaBasics_ICT1201();
        
        // call class
        callClass.introduction("Justine", "Sleeping", 18);
        callClass.introduction("Naraja", "Eating", 88);
    }
}