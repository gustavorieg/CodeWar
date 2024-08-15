/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo Rieg
 */
public class Matriz {

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {3,4};
        int[] x = {};

        for(int i = 0; i < a.length; i++){
          for(int j = 0; j < b.length; j++){
            if (a[i] != b[j]){
                x[i] = a[j];
            }
          }
          if(i == b.length){
            break;
          }
        }

        for(int i : x){
            System.out.println(i);
        }
    }

}
