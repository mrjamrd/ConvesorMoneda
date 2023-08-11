/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convesormoneda;

import javax.swing.JFrame;

/**
 *
 * @author Jose
 */
public class Controller {
    public double DolaraPerso(double a){
        return a * 56.00;
    }
    public double PesoaDolar(double a){
        return a /58.00;
    }
     public double EuroPeso(double a){
        return a * 60.00;
    }
    public double PesoEuro(double a){
        return a /62.00;
    }
     public double LibraPeso(double a){
        return a * 72.00;
    }
    public double PesoLibra(double a){
        return a /74.00;
    }
    
}
