/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.strategie;

/**
 *
 * @author Admin
 */
public class CanardEnBois extends Canard{

    public CanardEnBois(Vol facon) {
        super(facon);
    }

    @Override
    public void afficheToi() {
        
        System.out.println("Je suis un Canard en bois");}
    
}