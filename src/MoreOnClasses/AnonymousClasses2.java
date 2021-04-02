/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreOnClasses;

public class AnonymousClasses2 {
    public static void main(String[] args) {

    }
    static class A{
        public void print(){

        }
    }
    static class B{
        public static void main(String[] args){
            A object = new A(){
                @Override public void print(){
                    System.out.println("Hello");
                }
            };
            object.print();
        }
    }
}
