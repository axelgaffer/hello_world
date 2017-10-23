// Alex Gaffney
// github assignment
// a simple program to practice common Github commands 
package github_assignment;
import java.util.Scanner;
public class hello {
    public static void main(String [] args) {
	// added  line	
    	System.out.println("Enter your name:");
    	Scanner scan = new Scanner(System.in);
    	String name = scan.next();
    	System.out.println("Hello " + name + ", my name is Alex");
    }
}
