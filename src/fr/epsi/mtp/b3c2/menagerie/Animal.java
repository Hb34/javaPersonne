/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.epsi.mtp.b3c2.menagerie;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public abstract class Animal {
    private Color couleur;
    private String sexe;
    private boolean appetit;

    public Animal(Color couleur, String sexe) {
        this.couleur = couleur;
        this.sexe = sexe;
    }
    
    public Animal(){
        
    }
    
    public abstract void seDeplacer();

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public boolean isAppetit() {
        return appetit;
    }

    public void setAppetit(boolean appetit) {
        this.appetit = appetit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal{couleur=").append(couleur);
        sb.append(", sexe=").append(sexe);
        sb.append(", appetit=").append(appetit);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
