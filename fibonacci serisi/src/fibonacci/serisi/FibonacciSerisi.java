/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci.serisi;

/**
 *
 * @author Sıla
 */
public class FibonacciSerisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a=1;
    int b=1;
    System.out.print(b);
    System.out.print(a);
    int c,i;
    for(i=1;i<=998;i++){
        c=a+b;
       a=b;
        b=c;
        System.out.println(c);
    }
    }
    
}
