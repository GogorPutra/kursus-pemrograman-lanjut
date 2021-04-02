/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreOnClasses;

class ComparingObject {
     public static void main(String[] args) {

    }
    class A{
         private int x;
        public void main(String[ ] args) {
            A a = new A();
            a.x = 5;
            A b = new A();
            b.x = 5;
            System.out.println(a == b);
        }
    }
}