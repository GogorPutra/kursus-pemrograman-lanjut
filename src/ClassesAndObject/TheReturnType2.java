/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAndObject;

public class TheReturnType2 {
    public static void main(String[ ] args) {
        int x = 10;
        int y = myFunc(x);
        System.out.println(y);
    }
    public static int myFunc(int x) {
        return x*3;
    }
}