/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapersonne;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        List<String> chaines = new ArrayList<>();
        init(chaines);
        System.out.println("Affichage liste brute");
        affichage(chaines);
        System.out.println("*************************************************");
        Collections.sort(chaines);
        System.out.println("Affichage liste triée");
        affichage(chaines);
        
        List<JavaPersonne> pers = new ArrayList<>();
        for(int i = 0; i< 100; i++){
            JavaPersonne jp = new JavaPersonne("nom"+i, "prenom"+(100-i));
            pers.add(jp);
        }
        
        System.out.println("Affichage liste personne brute");
        for(JavaPersonne p : pers){
            System.out.println(p);
        }
        
        Collections.sort(pers);
        
        System.out.println("Affichage liste personne triee par prenom");
        for(JavaPersonne p : pers){
            System.out.println(p);
        }
        
        System.out.println("Affichage de la liste triée par nom");
        Collections.sort(pers,new Comparator<JavaPersonne>() {
            @Override
            public int compare(JavaPersonne o1, JavaPersonne o2) {
                return o1.getNom().compareTo(o2.getNom());
            }
        });
        //utilisation de lamda expression
        Collections.sort(pers, (JavaPersonne o1, JavaPersonne o2) -> o1.getNom().compareTo(o2.getNom()));
        for(JavaPersonne p : pers){
            System.out.println(p);
        }
    }

    public static void affichage(List<String> chaines) {
        for(String s : chaines){
            System.out.println(s);
        }
    }

    public static void init(List<String> chaines) {
        for(int i = 0; i<100 ; i++){
            chaines.add("ch"+i);
        }
    }
}