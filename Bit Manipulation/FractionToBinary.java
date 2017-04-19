/*
 * Given a real number between 0 and 1 that is passed in as a double,
 * print the binary representation. If the number cannot be accuratelyt 
 * represented in binary with atmost 32 characters, print "ERROR".
 */
package bitmanipulation;

/**
 *
 * @author Akshatha
 */
public class FractionToBinary {
    public static String printBinary(double num) {
        if(num >= 1 || num <= 0)
            return "ERROR";
        
        StringBuilder binary = new StringBuilder();
        binary.append(".");
        
        while(num > 0) {
            // Setting limit to length of 32 characters
            if(binary.length() >= 32) {
                return "ERROR";
            }
            
            double r = 2 * num;
            if(r >= 1) {
                binary.append("1");
                num = r - 1;
            } else {
                binary.append("0");
                num = r;
            }
        }
        return binary.toString();
    }
    
    public static void main(String[] args) {
        String binaryString = printBinary(0.625);
        System.out.println(binaryString);
    }
}
