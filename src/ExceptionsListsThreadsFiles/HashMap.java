/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionsListsThreadsFiles;

public class HashMap<S, I extends Number> {
    public static void main(String[] args) {
        java.util.HashMap<String, String> m = new java.util.HashMap<String, String>();
        m.put("A", "First");
        m.put("B", "Second");
        m.put("C", "Third");
        System.out.println(m.get("B"));
    }
}