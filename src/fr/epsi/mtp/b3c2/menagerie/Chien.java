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
public class Chien extends Animal {
    
    public Chien (Color couleur, String sexe){
        super(couleur, sexe);
    }
    public void marcher(){
        System.out.println("Je marche");
    }

    @Override
    public String toString() {
        return "Chien{" + super.toString()+'}';
    }

    @Override
    public void seDeplacer() {
        marcher();
    }
}
