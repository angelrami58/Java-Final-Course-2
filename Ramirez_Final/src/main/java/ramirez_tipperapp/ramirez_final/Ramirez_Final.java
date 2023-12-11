/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ramirez_tipperapp.ramirez_final;

import java.util.Scanner;
/**
 *
 * @author angelramirez-rivera
 */
public class Ramirez_Final {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base number:");
        int baseNumber = scanner.nextInt();

        System.out.println("Enter the exponent (nonnegative integer):");
        int exponent = scanner.nextInt();

        if (exponent < 0) {
            System.out.println("Exponent must be a nonnegative integer.");
        } else {
            int result = raiseToPower(baseNumber, exponent);
            System.out.println(baseNumber + " raised to the power of " + exponent + " is: " + result);
        }
    }
    static int raiseToPower(int baseNumber, int exponent) {
        if (exponent == 0) {
            return 1; // Any number raised to the power of 0 is 1
        } else {
            // Recursive case: baseNumber^exponent = baseNumber * baseNumber^(exponent-1)
            return baseNumber * raiseToPower(baseNumber, exponent - 1);
        }
    }
}
