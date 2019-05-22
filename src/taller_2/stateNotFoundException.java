/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_2;

/**
 *
 * @author manue
 */
public class stateNotFoundException extends Throwable{

    public stateNotFoundException() {
        super("No s'ha trobat cap estat de casella vàlid");
    }
    
    
    
}
