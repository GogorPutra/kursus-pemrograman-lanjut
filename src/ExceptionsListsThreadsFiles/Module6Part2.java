/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionsListsThreadsFiles;

public class Module6Part2 {
    void myFunc(int arg)
            throws IllegalArgumentException
    {
        if (arg < 0) {
            throw new IllegalArgumentException();
        }
    }
}