/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author Dan
 * Création de la class Visiteurs
 */
public class Visiteurs 
{
    private int idVisiteur;
    private String nomVisiteur;
    private String prenomVisiteur;
    private String adresseVisiteur;
    private int cpVisiteur;
    private String villeVisiteur;
    private Date dateEmbaucheVisiteur;
    private int idSecteur;
    private int idLabo;
    private String libelleSecteur;
    private String nomLabo;
    private int idRegion;
    private String nomRegion;
    
    /**
     * 
     * 1er constructeur
     */
    public Visiteurs(int unId,String unNom,String unPrenom,String uneAdresse,int unCP,String uneVille,Date uneDate,int unIdSec,int unIdLabo)
    {
        idVisiteur = unId;
        nomVisiteur = unNom;
        prenomVisiteur = unPrenom;
        adresseVisiteur = uneAdresse;
        cpVisiteur = unCP;
        villeVisiteur = uneVille;
        dateEmbaucheVisiteur = uneDate;
        idSecteur = unIdSec;
        idLabo = unIdLabo;
    }

    /**
     * 
     * 2eme constructeur
     */
    public Visiteurs(int unId,String unNom,String unPrenom,String uneAdresse,int unCP,String uneVille,Date uneDate,String unLibelle,String UnNomLabo,String unNomRegion)
    {
        idVisiteur = unId;
        nomVisiteur = unNom;
        prenomVisiteur = unPrenom;
        adresseVisiteur = uneAdresse;
        cpVisiteur = unCP;
        villeVisiteur = uneVille;
        dateEmbaucheVisiteur = uneDate;
        libelleSecteur = unLibelle;
        nomLabo = UnNomLabo;
        nomRegion = unNomRegion;
    }
   
    public int getIdVisiteur() {
        return idVisiteur;
    }

    
    public void setIdVisiteur(int idVisiteur) {
        this.idVisiteur = idVisiteur;
    }

    
    public String getNomVisiteur() {
        return nomVisiteur;
    }

    
    public void setNomVisiteur(String nomVisiteur) {
        this.nomVisiteur = nomVisiteur;
    }

   
    public String getPrenomVisiteur() {
        return prenomVisiteur;
    }

    public void setPrenomVisiteur(String prenomVisiteur) {
        this.prenomVisiteur = prenomVisiteur;
    }

  
    public String getAdresseVisiteur() {
        return adresseVisiteur;
    }

  
    public void setAdresseVisiteur(String adresseVisiteur) {
        this.adresseVisiteur = adresseVisiteur;
    }

    /**
     * @return the cpVisiteur
     */
    public int getCpVisiteur() {
        return cpVisiteur;
    }

    /**
     * @param cpVisiteur the cpVisiteur to set
     */
    public void setCpVisiteur(int cpVisiteur) {
        this.cpVisiteur = cpVisiteur;
    }

   
    public String getVilleVisiteur() {
        return villeVisiteur;
    }

  
    public void setVilleVisiteur(String villeVisiteur) {
        this.villeVisiteur = villeVisiteur;
    }

   
    public Date getDateEmbaucheVisiteur() {
        return dateEmbaucheVisiteur;
    }

  
    public void setDateEmbaucheVisiteur(Date dateEmbaucheVisiteur) {
        this.dateEmbaucheVisiteur = dateEmbaucheVisiteur;
    }

    public int getIdSecteur() {
        return idSecteur;
    }

  
    public void setIdSecteur(int idSecteur) {
        this.idSecteur = idSecteur;
    }

  
    public int getIdLabo() {
        return idLabo;
    }

  
    public void setIdLabo(int idLabo) {
        this.idLabo = idLabo;
    }

   
    public String getLibelleSecteur() {
        return libelleSecteur;
    }

 
    public void setLibelleSecteur(String libelleSecteur) {
        this.libelleSecteur = libelleSecteur;
    }

   
    public String getNomLabo() {
        return nomLabo;
    }

    public void setNomLabo(String nomLabo) {
        this.nomLabo = nomLabo;
    }

    
    public int getIdRegion() {
        return idRegion;
    }

    
    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    
    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }
    
    
}
