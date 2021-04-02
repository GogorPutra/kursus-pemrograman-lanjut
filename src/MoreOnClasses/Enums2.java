/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreOnClasses;

import java.awt.*;

public class Enums2 {
    enum Color
    {
        RED, BLUE, GREEN;
    }

}

class PrintColor {

    public static void main(String[ ] args) {

        Color color = Color.RED;

        if (Color.BLUE.equals(color)) {
            System.out.println("1");
        } else if (Color.GREEN.equals(color)) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}