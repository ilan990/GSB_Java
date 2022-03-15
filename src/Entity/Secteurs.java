/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author Dan
 * Création de la class Secteurs
 */
public class Secteurs
{
    private int idSecteur;
    private String libelleSecteur;

    /**
     * 
     * constructeur
     */
public Secteurs(int unId,String unLibelle)
    {
        idSecteur = unId;
        libelleSecteur = unLibelle;
        
    }


    public int getIdSecteur() {
        return idSecteur;
    }

    public void setIdSecteur(int idSecteur) {
        this.idSecteur = idSecteur;
    }

    public String getLibelleSecteur() {
        return libelleSecteur;
    }

 
    public void setLibelleSecteur(String libelleSecteur) {
        this.libelleSecteur = libelleSecteur;
    }
    
}
