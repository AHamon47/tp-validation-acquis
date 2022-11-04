package com.mycompany.finalproject;

import java.util.ArrayList;


public class GestionEtudiants {
    public static ArrayList<Etudiant> listeEtudiants;
    
    public static void initiateList() {
        listeEtudiants = new ArrayList();
        listeEtudiants.add(new Etudiant("1", "Etudiant1", 12.0));
        listeEtudiants.add(new Etudiant("2", "Etudiant2", 14.0));
        listeEtudiants.add(new Etudiant("3", "Etudiant3", 9.0));
        listeEtudiants.add(new Etudiant("4", "Etudiant4", 15.0));
        listeEtudiants.add(new Etudiant("5", "Etudiant5", 8.0));
    }
    
    public static ArrayList<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }
}
