/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionsListsThreadsFiles;

import java.io.File;

public class WorkingWithFiles {
    public static void main(String[] args) {
        File file = new  File("a.txt");

        if(file.exists())
        {
            System.out.println("Yesy");
        }
    }
}