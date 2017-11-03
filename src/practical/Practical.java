/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical;

/**
 *
 * @author B1
 */
public class Practical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a = 10;
        int b = 20;
        
        addition(a,b);
        System.out.println(addition2(a,b));
    }
    
    public static void addition(int a, int b){
        System.out.println(a+b);
    }
    
    public static int addition2(int a, int b){
        return a+b;
    }
}
