/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Dan
 * Création de la class Regions 
 */
public class Regions 
{
    private int idRegion;
    private int idSecteur;
    private String nomRegion;
    private String libelleSec;
/**
 * 
 * 1er constructeur
 */
    public Regions(int unId,int unIdSec,String unNom)
    {
        idRegion = unId;
        idSecteur = unIdSec ;
        nomRegion = unNom;
    }
/**
 * 
 * 2eme constructeur
 */
   public Regions(int unId, String unLibelleSec, String unNom) 
    {
        idRegion = unId;
        libelleSec = unLibelleSec;
        nomRegion = unNom;
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

   
    public int getIdSecteur() {
        return idSecteur;
    }

    public void setIdSecteur(int idSecteur) {
        this.idSecteur = idSecteur;
    }

    
    public String getLibelleSec() {
        return libelleSec;
    }

    
    public void setLibelleSec(String libelleSec) {
        this.libelleSec = libelleSec;
    }
    
}
