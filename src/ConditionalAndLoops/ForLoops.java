/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionalAndLoops;

public class ForLoops {
    public static void main(String[]args)
    {

        
        for(int i = 0; i < 10; i++ )
        {
            System.out.println("Great!");
        }

        //ini bagian foor loop bagian 2
        for (int i = 2; i < 10; i = i*i) {
        System.out.println(i);
        }
    }
}