/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreOnClasses;

public class AnonymousClasses {
    public static void main(String[] args) {

    }
    class Machine{
        Machine m = new Machine();{
        }
    }
    public void start(){

    }
    static {
        System.out.println("Hi");
    }
}