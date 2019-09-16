/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polim;

/**
 *
 * @author johnh
 */
public class ProgramaInterfaz {

    public static void main(String[] args) {
        Persona pavaroti = new Persona();
        hacerCantar(pavaroti);
        Canario piolin = new Canario();
        hacerCantar(piolin);
        Burro igor = new Burro();
        hacerCantar(igor);
       
    }

    private static void hacerCantar(PuedeCantar cantor) {
        cantor.cantar();
    }
    
}
