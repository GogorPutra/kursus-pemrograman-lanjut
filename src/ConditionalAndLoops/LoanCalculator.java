/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionalAndLoops;

import java.util.Scanner;

public class LoanCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
		
            for (int x = 0; x <3; x++){
            int actual_amount = (amount * 10)/100;
            amount = amount - actual_amount; 
        }                
	System.out.println(amount);       
    }
}
