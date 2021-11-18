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
public class Main {
    public static void main(String[] args){
        Chien milou = new Chien(Color.WHITE, "Male");
        Oiseau titi = new Oiseau();
        //milou.setSexe("Male");
        //milou.setCouleur(Color.blue);
        titi.setSexe("Femelle");
        titi.setCouleur(Color.YELLOW);
        System.out.println(milou);            
        System.out.println(titi);
        titi.seDeplacer();
        System.out.println("**************");
        Animal brutus = new Chien(Color.BLUE, "Male");
        ((Chien)brutus).marcher();
        brutus.seDeplacer();
        System.out.println(brutus);
        System.out.println("**************");
        Animal[] animaux = {titi, milou, brutus};//new Animal[3];
        for(int i = 0; i < animaux.length; i++){
            animaux[i].seDeplacer();
        }
        System.out.println("**************");
        for(Animal a : animaux){
            a.seDeplacer();
        }
    }
}
