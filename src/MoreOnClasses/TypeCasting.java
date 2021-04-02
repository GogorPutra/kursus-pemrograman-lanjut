/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreOnClasses;

public class TypeCasting {
    public static void main(String[] args) {
        double x = 1.5;
        double y = 2.65;
        sum((int)x, (int)y);
    }
    static void sum(int x, int y) {
        System.out.println(x + y);
    }
}