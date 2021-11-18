/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapersonne;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class JavaPersonne implements Comparable<JavaPersonne> {

    //***************Attributs*******************
    private String nom;
    private String prenom;

    /**
     * Constructeur explicite suite a masquage
     */
    public JavaPersonne() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main1(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenue Javaiste !!!");
        JavaPersonne maPersonne, p;
        maPersonne = new JavaPersonne();
        maPersonne.setNom("Martos");
        maPersonne.setPrenom("Lucien");
        p = new JavaPersonne("Martos", "Lucien");
        System.out.println("Nom + Prenom : " + maPersonne.getNom() + " " + maPersonne.getPrenom());
        System.out.println("***************************************");
        System.out.println("Nom + Prenom : " + p.getNom() + " " + p.getPrenom());
        System.out.println("**************************");
        System.out.println("? " + (p == maPersonne));
        System.out.println("?? " + p.equals(maPersonne));
        System.out.println("****************************");
        System.out.println("Premiere lettre du nom " + p.getNom().substring(0, 1));
        System.out.println("Premiere lettre du nom " + p.getNom().charAt(0));
        System.out.println(p);
    }

    /**
     * Contructeur avec parametres
     *
     * @param nom
     * @param prenom
     */
    public JavaPersonne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nom);
        hash = 89 * hash + Objects.hashCode(this.prenom);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JavaPersonne other = (JavaPersonne) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JavaPersonne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }

    public static void main2(String[] args) {
        String entree = "Martos";
        String resultat = "";
        long debut = System.currentTimeMillis();
        System.out.println(debut);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            //resultat = resultat+entree;
            //sb.append(entree);
            resultat.concat(entree);
        }
        //resultat = sb.toString();
        long fin = System.currentTimeMillis();
        System.out.println(fin);
        System.out.println(resultat);
        System.out.println(fin - debut);
    }

    @Override
    public int compareTo(JavaPersonne o) {
        return o.getNom().compareTo(nom);
    }
}