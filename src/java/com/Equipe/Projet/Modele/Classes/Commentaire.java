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
public class Commentaire {
    public int idCommentaire;
    public String Texte;
    public int IdCompte;
    public int IdLieu;

    public Commentaire(int idCommentaire, String Texte, int IdCompte, int IdLieu) {
        this.idCommentaire = idCommentaire;
        this.Texte = Texte;
        this.IdCompte = IdCompte;
        this.IdLieu = IdLieu;
    }
    
    
    
}
