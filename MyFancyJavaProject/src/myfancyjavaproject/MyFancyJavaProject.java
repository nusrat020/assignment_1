/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfancyjavaproject;

/**
 *
 * @author Lenovo
 */

class Singleton {
    public String s;

    public Singleton()
    {
        s = "This is not a singleton design pattern";
    }
}
public class MyFancyJavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Singleton x = new Singleton();

        Singleton y = new Singleton();

        Singleton z = new Singleton();

        // Printing the hash code for above variables
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

    }
    
}
