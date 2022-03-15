/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Dan
 * Création de la class Responsable 
 */
public class Responsable 
{
    private int idResponsable;
    private String nomResponsable;
    private String prenomResponsable;
    private String numTel;
    private String mailResponsable;
    
/**
 * 
 * 1er constructeur
 */    
    public Responsable(int unId, String unNom,String unPrenom,String unNum,String unMail)
    {
        idResponsable = unId;
        nomResponsable = unNom;
        prenomResponsable = unPrenom;
        numTel = unNum;
        mailResponsable = unMail;
    }

/**
 * 
 * 2eme constructeur
 */
    public Responsable(String unPrenom, String unMail) 
    {
      prenomResponsable = unPrenom;
      mailResponsable = unMail;
    }

   
    public int getIdResponsable() {
        return idResponsable;
    }

    /**
     * @param idResponsable the idResponsable to set
     */
    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

   
    public String getNomResponsable() {
        return nomResponsable;
    }

    
    public void setNomResponsable(String nomResponsable) {
        this.nomResponsable = nomResponsable;
    }

   
    public String getPrenomResponsable() {
        return prenomResponsable;
    }

    
    public void setPrenomResponsable(String prenomResponsable) {
        this.prenomResponsable = prenomResponsable;
    }

   
    public String getNumTel() {
        return numTel;
    }

   
    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

   
    public String getMailResponsable() {
        return mailResponsable;
    }

    public void setMailResponsable(String mailResponsable) {
        this.mailResponsable = mailResponsable;
    }
    
}
