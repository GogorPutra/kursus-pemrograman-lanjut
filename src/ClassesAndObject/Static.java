/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAndObject;

public class Static {
    public static int pCount;

    public static void main(String[] args) {
        Static.pCount = 1;
        Static.pCount++;
        System.out.println(Static.pCount);
    }
}