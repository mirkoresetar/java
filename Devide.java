/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ostatak.novca;

/**
 *
 * @author Mirko
 */
public class Devide {
    
    static final double PI = 3.14;

    public Devide(int x, int y) {
        
        try {
            double result = x/y;
            System.out.println("rezultat = " + result);
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occured! \n\t" + ae);
        }
        
    }
    
}
