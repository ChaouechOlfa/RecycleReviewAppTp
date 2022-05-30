package com.example.recyclereviewapptp;

public class Etudiant {
    private String Matricule;
    private String Nom;

    public Etudiant() {
    }

    public Etudiant(String matricule, String nom) {
        Matricule = matricule;
        Nom = nom;
    }

    public String getMatricule() {
        return Matricule;
    }

    public String getNom() {
        return Nom;
    }

    public void setMatricule(String matricule) {
        Matricule = matricule;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "Matricule='" + Matricule + '\'' +
                ", Nom='" + Nom + '\'' +
                '}';
    }
}
