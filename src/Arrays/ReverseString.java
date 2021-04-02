/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();

		//your code goes here
		 String rev = "";
        for (char i : arr)
            rev = i + rev;
        System.out.println(rev);

	}
}
