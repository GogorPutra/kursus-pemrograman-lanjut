/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreOnClasses;

public class Inheritance {
    public void makeSound(){
        System.out.println("Hi");
    }
}
class Dog extends Inheritance{
    class A {
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
