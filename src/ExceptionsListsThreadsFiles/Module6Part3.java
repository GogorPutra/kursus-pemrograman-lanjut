/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionsListsThreadsFiles;

public class Module6Part3 {
    public static void main(String[] args) {

    }
    static class B implements Runnable {
        public void run() {
            System.out.println("B");
        }
    }
    static class A extends Thread {
        public void run() {
            System.out.println("A");
            Thread t = new Thread(new B());
            t.start();
        }
        public static void main(String[ ] args) {
            A object = new A();
            object.start();
        }
    }
}