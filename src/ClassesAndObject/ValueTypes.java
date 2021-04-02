/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAndObject;

public class ValueTypes {
    public static void main(String[ ] args) {
        int x = 4;
        square(x);
        System.out.println(x);
    }
    static void square(int x) {
        x = x*x;
    }
}