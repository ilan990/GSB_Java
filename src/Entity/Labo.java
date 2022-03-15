/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Dan
 * création de la class Labo 
 */
public class Labo 
{
    private int idLabo;
    private String nomLabo;
    private String chefVenteLabo;
    
    /**
     * 
     * Constructeur
     */
    public Labo(int unId,String unNom,String unChef)
    {
        idLabo = unId;
        nomLabo = unNom;
        chefVenteLabo = unChef;
    }

    Labo(String unNom) {
        nomLabo = unNom;
    }

    
    public int getIdLabo() {
        return idLabo;
    }

    
    public void setIdLabo(int idLabo) {
        this.idLabo = idLabo;
    }

    
    public String getNomLabo() {
        return nomLabo;
    }

    
    public void setNomLabo(String nomLabo) {
        this.nomLabo = nomLabo;
    }

   
    public String getChefVenteLabo() {
        return chefVenteLabo;
    }

    
    public void setChefVenteLabo(String chefVenteLabo) {
        this.chefVenteLabo = chefVenteLabo;
    }
    
}
