/**
 * Main
 * 
 * Source: https://www.w3schools.com/java/java_packages.asp
 */

package calcapp.main; 
import calcapp.op.*;
// package calcapp.main; 
// import calcapp.logics.SimpleOperations;

public class Calculator {
    public static void main(String[] args) {
        int a = 10, b = 2;
        
        int totalAdd = SimpleOperations.add(a, b);
        int totalSub = SimpleOperations.sub(a, b);

        System.out.println("The result of a + b is " + totalAdd + 
                            " and a - b is " + totalSub);
    }
}