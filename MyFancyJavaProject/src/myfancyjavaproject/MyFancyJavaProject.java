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
    private static Singleton single_instance = null;
 
    public String s;
 
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
 
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
 
        return single_instance;
    }
}
public class MyFancyJavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Singleton x = Singleton.getInstance();
 
        Singleton y = Singleton.getInstance();
 
        Singleton z = Singleton.getInstance();

        // Printing the hash code for above variables
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

    }
    
}
