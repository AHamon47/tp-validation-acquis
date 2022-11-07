package com.mycompany.finalproject;

import java.util.ArrayList;

public class GestionEtudiants {
    private static ArrayList<Etudiant> listeEtudiants;
    
    private static void initiateList() {
        listeEtudiants = new ArrayList();
        listeEtudiants.add(new Etudiant("1", "Etudiant1", 12.0, "img1.jpg"));
        listeEtudiants.add(new Etudiant("2", "Etudiant2", 14.0, "img2.jpg"));
        listeEtudiants.add(new Etudiant("3", "Etudiant3", 9.0, "img3.jpg"));
        listeEtudiants.add(new Etudiant("4", "Etudiant4", 15.0, "img4.jpg"));
        listeEtudiants.add(new Etudiant("5", "Etudiant5", 8.0, "img5.jpg"));
    }
    
    public static ArrayList<Etudiant> getListeEtudiants() {
        if(listeEtudiants == null) {
            initiateList();
        }
        return listeEtudiants;
    }
}