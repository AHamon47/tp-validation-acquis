package com.mycompany.finalproject;

public class Etudiant {
    private String id;
    private String nom;
    private double moyenne;
    
    public Etudiant(String idP, String nomP, double moyP) {
        this.id = idP;
        this.nom = nomP;
        this.moyenne = moyP;
    }
    
    public void setId(String idP) {
        this.id = idP;
    }
    
    public void setNom(String nomP) {
        this.nom = nomP;
    }
    
    public void setMoyenne(double moyP) {
        this.moyenne = moyP;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public double getMoyenne() {
        return this.moyenne;
    }
    
    public boolean equals(String idP) {
        return this.id.equals(idP);
    }
    
    public String toString() {
        return "Nom: "+this.nom+", ID: "+this.id+", Moyenne: "+this.moyenne;
    }
}
