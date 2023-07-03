package _3esercizi.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tester {
    public static void main(String[] args) {
        Set<String> day = new HashSet<>();
        day.add("Lunedi");
        day.add("Martedì");
        day.add("Mercoledì");
        day.add("Giovedì");
        day.add("Venerdì");
        day.add("Sabato");
        day.add("Domenica");

        for (String x : day) {
            System.out.println(x);
        }
        System.out.println("\n");
        Set<String> s = new LinkedHashSet<>();
        s.add("Lunedi");
        s.add("Martedì");
        s.add("Mercoledì");
        s.add("Giovedì");
        s.add("Venerdì");
        s.add("Sabato");
        s.add("Domenica");

        for (String x : s) {
            System.out.println(x);
        }

        System.out.println("\n");
        System.out.println("Is the first Set equal to the second?");
        controllo(day,s);


    }
    public static void controllo( Set<String> set1 , Set<String> set2){
        int d=0;
        if( set1.size() != set2.size() ){
            System.out.println("I due Set sono diversi");
        }else{
            for (String s1 : set1) {
                int c=0;
                for (String s2 : set2) {
                    if ( s1 == s2){
                        c++;
                    }
                }
                if ( c!=1 ){
                    System.out.println("I due Set sono diversi");
                    break;
                }else{
                    d++;
                }

            }
            if( d==set1.size()){
                System.out.println("i due set sono uguali");
            }
        }

    }




}

