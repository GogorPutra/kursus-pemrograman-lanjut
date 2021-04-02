/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreOnClasses;

public class Modules5 {
    class A{
        private void print(){
            System.out.println("a");
        }
        private void print(String str){
            System.out.println("b");
        }
        private void print(int x){
            System.out.println("c");
        }
        private void main(String[] args){
            A object = new A();
            object.print(12);
        }
    }
}