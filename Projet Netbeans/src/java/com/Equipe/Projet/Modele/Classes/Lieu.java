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
public abstract class Lieu {
    public int Id;
    public double Latitude;
    public double Longitude;
    public String Description;
    public String Etat;
    public int CompteId;
    public String TypeDeService;

    public Lieu(int Id, double Latitude, double Longitude, String Description, String Etat, int CompteId, String TypeDeService) {
        this.Id = Id;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Description = Description;
        this.Etat = Etat;
        this.CompteId = CompteId;
        this.TypeDeService = TypeDeService;
    }
    
    
}
