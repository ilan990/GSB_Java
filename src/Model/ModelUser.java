/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.Visiteurs;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Dan
 * Création de la class ModelUser permettant de générer le tableau
 */
public class ModelUser extends AbstractTableModel{

    private String[] nomColonnes;
    private Vector<String[]> lignes;
    @Override
    public int getRowCount() {
        return lignes.size();
    }

    @Override
    public int getColumnCount() {
        return nomColonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes.get(rowIndex)[columnIndex];
    }
    @Override
    public String getColumnName(int numColonne)
    {
        return nomColonnes[numColonne];
    }
    
    public void LoadDats10Colonnes(ArrayList<Visiteurs> lesVisiteurs)
    {
        nomColonnes= new String[]{"id","nom","prenom","adresse","Code Postal","ville","date Embauche","secteur","labo","region"};
        lignes = new Vector<>();
        for (Visiteurs Vis: lesVisiteurs){
            lignes.add(new String[]{String.valueOf(Vis.getIdVisiteur()),Vis.getNomVisiteur(),Vis.getPrenomVisiteur(),Vis.getAdresseVisiteur(),String.valueOf(Vis.getCpVisiteur()),Vis.getVilleVisiteur(),String.valueOf(Vis.getDateEmbaucheVisiteur()),Vis.getLibelleSecteur(),Vis.getNomLabo(),Vis.getNomRegion()});
        }
        fireTableDataChanged();
    }
    
}
