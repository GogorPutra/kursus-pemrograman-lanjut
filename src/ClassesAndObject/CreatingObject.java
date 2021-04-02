/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAndObject;

public class CreatingObject {
    public static void main(String[] args) {
    }
    public void test() {
        System.out.println("Hi");
    }
}
class B {
    public static void main(String args[ ]) {
        CreatingObject  obj = new CreatingObject();
        obj.test();
    }
}
