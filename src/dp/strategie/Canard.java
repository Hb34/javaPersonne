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
public abstract class Canard {
    private Vol maFaconDeVoler;
    
    protected Canard(Vol facon){
        maFaconDeVoler = facon;
    }
    public void faitCoinCoin(){
        System.out.println("Coin Coin");
    }
    
    public void nage(){
        System.out.println("Je nage");
    }
    public abstract void afficheToi();
    
    public void envoleToi(){
        getMaFaconDeVoler().vole();
    }

    /**
     * @return the maFaconDeVoler
     */
    public Vol getMaFaconDeVoler() {
        return maFaconDeVoler;
    }

    /**
     * @param maFaconDeVoler the maFaconDeVoler to set
     */
    public void setMaFaconDeVoler(Vol maFaconDeVoler) {
        this.maFaconDeVoler = maFaconDeVoler;
    }
    
}