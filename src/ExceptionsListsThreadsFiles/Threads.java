/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionsListsThreadsFiles;

public class Threads {
    public static void main(String[] args) {
    }
    class A extends Thread {
            public void run() {
                System.out.println("Hello");
            }
            public void main(String[] args) {
                A object = new A();
                object.start ();
            }

        }
    }