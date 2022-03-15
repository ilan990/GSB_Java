    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author dan
 */
public class FonctionsMetier implements IMetier 
{
  
    /**
     * déclaration de variables pour les requêtes SQL
     */
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection maCnx;

    /**
     * 
     * on code la méthode pour récupérer tous les visiteurs 
     */
    @Override
    public ArrayList<Visiteurs> getAllVisiteurs() {
         ArrayList<Visiteurs>mesVisiteurs = new ArrayList <Visiteurs>();
          try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("SELECT visiteur.id_vis,visiteur.nom_vis,visiteur.prenom_vis,visiteur.adresse_vis,visiteur.CP_vis,visiteur.ville_vis,visiteur.dateEmbauche_vis,secteur.libelle_sec,labo.nom_labo,region.region_nom\n" +
"FROM visiteur \n" +
"INNER join labo on visiteur.id_labo = labo.id_labo \n" +
"inner join secteur on visiteur.id_sec=secteur.id_sec\n" +
"INNER join region on secteur.id_sec = region.id_sec\n" +            
"order by visiteur.id_vis;");
            rs=ps.executeQuery();
            while(rs.next())
            {
                Visiteurs vis =new Visiteurs(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)
                        ,rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getString(10));
                mesVisiteurs.add(vis);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesVisiteurs;
    
    }

    /**
     * 
     * on code la méthode getAllRegions pour récupérer toutes les régions 
     */
    @Override
    public ArrayList<Regions> getAllRegions() {
         ArrayList<Regions>mesRegions = new ArrayList<Regions>();
         try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("SELECT region.id_region,secteur.libelle_sec,region.region_nom FROM region inner JOIN secteur ON region.id_sec = secteur.id_sec;");
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                //Regions reg =new Regions(rs.getInt(1),rs.getInt(2),rs.getString(3));
                Regions reg = new Regions(rs.getInt(1),rs.getString(2),rs.getString(3));
                mesRegions.add(reg);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesRegions;
         
    }
    /**
     * 
     * la méthode getAllSecteurs permet d'afficher tous les secteurs 
     */
    @Override
    public ArrayList<Secteurs> getAllSecteur() {
        ArrayList <Secteurs>mesSecteurs = new ArrayList<Secteurs>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select secteur.id_sec,secteur.libelle_sec from secteur ");
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Secteurs sec =new Secteurs(rs.getInt(1),rs.getString(2));
                mesSecteurs.add(sec);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesSecteurs;
    }
    /**
     * 
     * on code la méthode pour récupérer tous les laboratoires  
     */
    @Override
    public ArrayList<Labo> getAllLabo() {
         ArrayList <Labo>mesLabo = new ArrayList<Labo>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select labo.nom_labo from labo");
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                Labo lab =new Labo(rs.getString("nom_labo"));
                mesLabo.add(lab);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesLabo;
        
    }
    
      /**
     * 
     * on code la méthode pour récupérer tous les travaux des visiteurs
     * @return 
     */
    @Override
    public ArrayList<Travailler> getAllTravail() {
    ArrayList<Travailler>mesTravaux = new ArrayList <Travailler>();
          try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("SELECT visiteur.nom_vis,visiteur.prenom_vis,travailler.date,region.region_nom,travailler.role_tra\n" +
                                        "FROM travailler\n" +
                                        "INNER join visiteur on travailler.id_vis = visiteur.id_vis\n" +
                                        "INNER join region on travailler.id_region = region.id_region\n" +
                                        "order by visiteur.id_vis");
            rs=ps.executeQuery();
            while(rs.next())
            {
                Travailler tra =new Travailler(rs.getString(1),rs.getString(2),rs.getDate(3),rs.getString(4),rs.getString(5));
                mesTravaux.add(tra);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesTravaux;   
    }
    
  
    /**
     * 
     * La méthode InsererVisiteurs permet d'enregistrer un nouveau visiteur en lui attribuant un nom, un prénom,une adresse,un code postal, une ville, une date d'embauche,un secteur, un laboratoire et une région
     */
    @Override
    public void InsererVisiteurs(String nom, String Prenom,String adresse ,String cp, String ville,String dateEmbauche, String secteur, String labo,String region) {
        
        try {
           maCnx=ConnexionBdd.getCnx();
           
            ps= maCnx.prepareStatement("select id_labo from labo where nom_labo = '"+labo+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numLabo = rs.getInt(1);
            rs.close();
            
            ps= maCnx.prepareStatement("select id_sec from secteur where libelle_sec = '"+secteur+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numSecteur = rs.getInt(1);
            rs.close();
            
            ps= maCnx.prepareStatement("select id_region from region where region_nom = '"+region+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numRegion = rs.getInt(1);
            rs.close();
            
            ps= maCnx.prepareStatement("INSERT INTO visiteur VALUES (null,'"+nom+"','"+Prenom+"','"+adresse+"','"+cp+"','"+ville+"','"+dateEmbauche+"',"+numSecteur+","+numLabo+","+numRegion+")");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/**
 * 
 * InsererRegion permet d'enregistrer une nouvelle région en lui affectant un nom et un libellé
 */
    @Override
    public void InsererRegion(String nom,String libelle) 
    {
        try {
            maCnx=ConnexionBdd.getCnx();
           
            ps= maCnx.prepareStatement("select secteur.id_sec from secteur where secteur.libelle_sec = '"+libelle+"'");
            rs=ps.executeQuery();
            rs.next();
            
            int numSecteur = rs.getInt(1);
            rs.close();
            
            String maSQL= "INSERT INTO region(region.region_nom, region.id_sec) VALUES ('"+nom+"','"+numSecteur+"')";
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/**
 * 
 * InsererSecteur permet d'enregistrer un nouveau secteur en lui affectant un libellé
 */
    @Override
    public void InsererSecteur(String libelle) {
        try {
            maCnx=ConnexionBdd.getCnx();
            String maSQL= "INSERT INTO secteur(secteur.libelle_sec) VALUES ('"+libelle+"')";
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/**
 * 
 * Cette méthode permet de modifier un visiteur déjà existant
 */
    @Override
    public void ModifierVisiteur(int id,String nom, String prenom, String adresse, int cp, String ville, String dateEmbauche, String secteur,String labo,String region) {
       try {
            maCnx=ConnexionBdd.getCnx();
            String maSQL="SELECT secteur.id_sec FROM secteur WHERE secteur.libelle_sec='"+secteur+"'";
            ps= maCnx.prepareStatement(maSQL);
            rs=ps.executeQuery();
            rs.next();
            int numSecteur = rs.getInt(1);
            rs.close();
            
            maCnx=ConnexionBdd.getCnx();
            maSQL="SELECT labo.id_labo FROM labo WHERE labo.nom_labo='"+labo+"'";
            ps= maCnx.prepareStatement(maSQL);
            rs=ps.executeQuery();
            rs.next();
            int numLabo = rs.getInt(1);
            rs.close();
            
            maCnx=ConnexionBdd.getCnx();
            maSQL="SELECT region.id_region FROM region WHERE region.region_nom='"+region+"'";
            ps= maCnx.prepareStatement(maSQL);
            rs=ps.executeQuery();
            rs.next();
            int numRegion = rs.getInt(1);
            rs.close();
            
            maCnx=ConnexionBdd.getCnx();
            maSQL= "UPDATE visiteur SET visiteur.nom_vis='"+nom+"',visiteur.prenom_vis='"+prenom+"',"
                    + "visiteur.adresse_vis='"+adresse+"',visiteur.CP_vis='"+cp+"',visiteur.ville_vis='"+ville+"',"
                    + "visiteur.dateEmbauche_vis='"+dateEmbauche+"',visiteur.id_sec='"+numSecteur+"',visiteur.id_labo='"+numLabo+"',"
                    + "visiteur.id_region='"+numRegion+"' WHERE visiteur.id_vis ="+id;
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

/**
 * 
 * Cette méthode permet de modifier une région déjà existante
 */
    @Override
    public void modifierRegion(int idReg,String nomReg) {
        try {
            maCnx=ConnexionBdd.getCnx();
            String maSQL= "UPDATE region SET region.region_nom='"+nomReg+"' WHERE region.id_region ="+idReg;
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
/**
 * 
 * Cette méthode permet de modifier un secteur déjà existant
 */
    @Override
    public void modifierSecteur(int id,String secteur) {
        try {
            maCnx=ConnexionBdd.getCnx();
            String maSQL= "UPDATE secteur SET secteur.libelle_sec='"+secteur+"' WHERE secteur.id_sec ="+id;
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * 
     * Avec cette méthode, on ajoute en base de données un nouveau reponsable lorsqu'il clique sur inscription
     */
    @Override
    public void InsererNum(String Nom,String Prenom, String numTel,String mail)
    {
        try {
            maCnx=ConnexionBdd.getCnx();
            String maSQL= "INSERT INTO responsable(responsable.nom_res,responsable.prenom_res,responsable.telephone,responsable.mail) VALUES ('"+Nom+"','"+Prenom+"','"+numTel+"','"+mail+"')";
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/**
 * 
 * VerifierIdentifiants consiste à verifier le mail et le nom lors de la connexion pour savoir si ils sont déjà en base de données. 
 */
    @Override
    public Responsable VerfierIdentifiants(String Prenom, String Mail) 
    {
        Responsable res = null;
        try {
            maCnx=ConnexionBdd.getCnx();
            
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("Select * from responsable where prenom_res = '"+Prenom+"' AND mail='"+Mail+"'");
            
            rs=ps.executeQuery();
            
            //rs.next retourne boolean donc si c'est vrai 
            if(rs.next())
            {
                res=new Responsable(rs.getString(1),rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    @Override
    public HashMap<String,Double> getDatasGraph1()
        {
            HashMap<String,Double> lesDatas = new HashMap<>();
        try {
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT secteur.libelle_sec,COUNT(region.id_region) FROM region "
                    + "INNER JOIN secteur ON region.id_sec=secteur.id_sec "
                    + "GROUP BY secteur.libelle_sec;");
            rs= ps.executeQuery();
            while(rs.next())
            {
                lesDatas.put(rs.getString(1), rs.getDouble(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
           return lesDatas; 
        }

    @Override
    public void InsererTravailVisiteur(int id,String dateEmbauche,String region,String role)
    {
        try {
            maCnx=ConnexionBdd.getCnx();
      
            String maSQL="SELECT region.id_region FROM region WHERE region.region_nom='"+region+"'";
            ps= maCnx.prepareStatement(maSQL);
            rs=ps.executeQuery();
            rs.next();
            int numRegion = rs.getInt(1);
            rs.close();
            
            maCnx=ConnexionBdd.getCnx();
            maSQL= "INSERT INTO `travailler`(`id_vis`, `date`, `id_region`, `role_tra`) VALUES ("+id+",'"+dateEmbauche+"',"+numRegion+",'"+role+"')";            
            ps= maCnx.prepareStatement(maSQL);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public HashMap<String, Integer> getDatasGraph2() 
    {
        HashMap<String,Integer> lesDatas = new HashMap<>();
        try {
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT region.region_nom,COUNT(visiteur.id_vis)\n" +
"FROM region\n" +
"INNER JOIN travailler on region.id_region = travailler.id_region\n" +
"INNER JOIN visiteur on travailler.id_vis=visiteur.id_vis\n" +
"GROUP BY region.region_nom;");
            rs= ps.executeQuery();
            int compteur = 1;
            while(rs.next())
            {
                lesDatas.put(rs.getString(1), rs.getInt(2));
                compteur++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
           return lesDatas; 
        }

    @Override
    public HashMap<Integer,String > getDatasGraph3() 
    {
        HashMap<Integer,String> lesDatas = new HashMap<>();
        try {
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT COUNT(visiteur.id_vis),visiteur.dateEmbauche_vis\n" +
"FROM visiteur\n" +
"GROUP BY visiteur.dateEmbauche_vis");
            rs= ps.executeQuery();
            while(rs.next())
            {
                lesDatas.put(rs.getInt(1), rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lesDatas;      
    }
    
}