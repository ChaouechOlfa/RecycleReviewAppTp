package com.example.recyclereviewapptp;

import java.util.ArrayList;

public class EtudiantContent {

        public static ArrayList<Etudiant> getEtudiants(){
            ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
            etudiants.add(new Etudiant("915", "Sfaxi"));
            etudiants.add(new Etudiant("911", "Bennour"));
            etudiants.add(new Etudiant("912", "Aloui"));
            etudiants.add(new Etudiant("914", "Bornaz"));
            etudiants.add(new Etudiant("913", "Tarhouni"));
            etudiants.add(new Etudiant("915", "Tastouri"));
            etudiants.add(new Etudiant("916", "Baccari"));
            etudiants.add(new Etudiant("917", "Tarouch"));
            etudiants.add(new Etudiant("919", "Belaid"));
            etudiants.add(new Etudiant("918", "Ettounsi"));
            return etudiants;
        }

}
