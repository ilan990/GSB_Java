/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author ilan_
 */
public interface IMetier {
    
    /**
     * 
     * méthode permettant d'obtenir tous les visiteurs
     */
    public ArrayList<Visiteurs> getAllVisiteurs();
    /**
     * méthode permettant d'obtenir toutes les régions
     * 
     */
    public ArrayList<Regions> getAllRegions();
    /**
     * 
     * méthode permettant d'obtenir tous les secteurs
     */
    public ArrayList<Secteurs> getAllSecteur();
    /**
     * 
     * méthode permettant d'obtenir tous les laboratoires 
     */
    public ArrayList<Labo>getAllLabo();
    /**
     * 
     * méthode permettant d'obtenir tous les travaux réalisés par les visiteurs
     */
    public ArrayList<Travailler>getAllTravail();
      /**
     * 
     *Méthode permettant d'insérer un visiteurs 
     */
    public void InsererVisiteurs(String nom,String Prenom,String adresse,String cp,String ville,String dateEmbauche,String secteur,String labo);
   /**
    * 
    * Méthode permettant d'insérer une régions 
    */
    public void InsererRegion(String nom,String libelle);
    /**
     * 
     * Méthode permettant d'insérer un secteur 
     */
    public void InsererSecteur(String libelle);
    /**
     * 
     * Méthode permettant de modifier une région
     */
    public void modifierRegion(int idReg,String nomReg);
    /**
     * 
     * Méthode permettant de modifier un secteur
     */
    public void modifierSecteur(int id,String secteur);
    /**
     * 
     * Méthode permettant de modifier un visiteur
     */
    public void ModifierVisiteur(int id,String nom, String prenom, String adresse, int cp, String ville, String dateEmbauche, String secteur,String labo);
    /**
     * 
     * Méthode permettant d'insérer un nouveau responsable lors de l'inscription
     */
    public void InsererNum (String Prenom,String Nom,String numTel,String mail);
    /**
     * 
     * Méthode permettant de vérifier les identifiants lorsqu'une personne se connecte.
     */
    public Responsable VerfierIdentifiants(String Prenom, String Mail);
    /**
     * Méthode permettant de dessiner un graphe
     * @return 
     */
    public HashMap<String,Double> getDatasGraph1();
    /**
     *  Méthode permettant de dessiner un graphe 
     * @return 
     */
    public HashMap<String,Integer> getDatasGraph2();
    /**
     *  Méthode permettant de dessiner un graphe 
     * @return 
     */
    public HashMap<Integer,String> getDatasGraph3();
    /**
     * 
     * Méthode permettant d'attribuer une ou plusieurs régions à un visiteur
     */
   public void InsererTravailVisiteur(int id,String dateEmbauche,String region,String role);
}
