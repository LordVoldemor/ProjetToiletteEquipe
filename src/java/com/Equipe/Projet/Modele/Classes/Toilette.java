/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Equipe.Projet.Modele.Classes;

/**
 *
 * @author Le Paré
 */
public class Toilette extends Lieu {
    // Attribut
    public int TypeDeService;//0 = homme, 1= femme, 2=Homme et femme

    //Constructeur
    public Toilette(int Id, double Latitude, double Longitude, String Description, int Etat, int CompteId,int TypeDeService) {
        super(Id, Latitude, Longitude, Description, Etat, CompteId);
        this.TypeDeService = TypeDeService ;
    }
     
    //Getter Et Setter
    public int getTypeDeService() {
        return TypeDeService;
    }
    public void setTypeDeService(int TypeDeService) {
        this.TypeDeService = TypeDeService;
    }
    
}
