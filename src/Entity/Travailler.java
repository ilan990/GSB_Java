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
 * création de la class Travailler
 */
public class Travailler 
{
    private int idVisiteur;
    private Date DateTravailler;
    private int idRegion;
    private String roleTravailler;
    private String nomVisiteur;
    private String prenomVisiteur;
    private String nomRegion;
/**
 * 
 * constructeur
 */
    public Travailler(int unIdVis,Date uneDateTravailler,int unIdReg,String unRole)
    {
        idVisiteur = unIdVis;
        DateTravailler = uneDateTravailler;
        idRegion = unIdReg;
        roleTravailler = unRole;
    }

    Travailler(String unNomVis, String unPrenomVis, java.sql.Date uneDateTravailler, String unNomRegion, String unRole) 
    {
        nomVisiteur = unNomVis;
        prenomVisiteur=unPrenomVis;
        DateTravailler = uneDateTravailler;
        nomRegion = unNomRegion;
        roleTravailler = unRole;
    }

  
    public int getIdVisiteur() {
        return idVisiteur;
    }

    
    public void setIdVisiteur(int idVisiteur) {
        this.idVisiteur = idVisiteur;
    }

    public Date getDateTravailler() {
        return DateTravailler;
    }

    public void setDateTravailler(Date DateTravailler) {
        this.DateTravailler = DateTravailler;
    }

   
    public int getIdRegion() {
        return idRegion;
    }

   
    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    
    public String getRoleTravailler() {
        return roleTravailler;
    }

   
    public void setRoleTravailler(String roleTravailler) {
        this.roleTravailler = roleTravailler;
    }

    /**
     * @return the nomVisiteur
     */
    public String getNomVisiteur() {
        return nomVisiteur;
    }

    /**
     * @param nomVisiteur the nomVisiteur to set
     */
    public void setNomVisiteur(String nomVisiteur) {
        this.nomVisiteur = nomVisiteur;
    }

    /**
     * @return the prenomVisiteur
     */
    public String getPrenomVisiteur() {
        return prenomVisiteur;
    }

    /**
     * @param prenomVisiteur the prenomVisiteur to set
     */
    public void setPrenomVisiteur(String prenomVisiteur) {
        this.prenomVisiteur = prenomVisiteur;
    }

    /**
     * @return the nomRegion
     */
    public String getNomRegion() {
        return nomRegion;
    }

    /**
     * @param nomRegion the nomRegion to set
     */
    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }
    
}
