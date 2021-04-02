/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

public class Module3Quiz {
    public static void main(String[] args) {
        int arr[ ] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i;
        }
        int res = arr[0] + arr[2];
        System.out.println(res);
    }
}