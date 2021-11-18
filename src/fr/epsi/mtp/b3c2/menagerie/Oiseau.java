/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.epsi.mtp.b3c2.menagerie;

/**
 *
 * @author Admin
 */
public class Oiseau extends Animal {
    public void voler(){
        System.out.println("Je vole");
    }

    @Override
    public void seDeplacer() {
       voler();
    }
}
