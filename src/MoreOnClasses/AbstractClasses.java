/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreOnClasses;

public class AbstractClasses {
    public static void main(String[] args) {
        abstract class Animal {
            public int age;
            public abstract int printAge();
        }
        class Dog extends Animal {

            public int printAge() {
                return age;

            }

        }
    }
}