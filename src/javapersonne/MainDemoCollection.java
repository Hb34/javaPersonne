/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapersonne;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MainDemoCollection {
    public static void main(String[] args) {
        List<String> chaines1 = new ArrayList<>();        
        List<String> chaines2 = new ArrayList<>();
        
        for(int i=0; i<10; i++){
            chaines1.add("c"+i);
        }
        for(int i=0; i<10; i++){
            chaines2.add("c"+i);
        }
        
        System.out.println("**********************");
        for(String s : chaines2){
            System.out.println(s);
        }
        
        //Union
        List<String> union = new ArrayList<>();
        union.addAll(chaines1);
        union.addAll(chaines2);
        
        System.out.println("*******************");
        for(String s : union){
            System.out.println(s);
        }
        
        System.out.println("union sans doublon");

        
    }
}
