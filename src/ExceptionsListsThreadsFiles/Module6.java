/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionsListsThreadsFiles;

public class Module6{
    void myFunc(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}