/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.Regions;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dan
 * Création de la class ModelRegion permettant de générer le tableau
 */
public class ModelRegion extends AbstractTableModel{

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
    /**
     * 
     * on lui passe les noms des colones 
     */
    public void LoadDats3Colonnes(ArrayList<Regions> lesRegions)
    {
        nomColonnes= new String[]{"id Region","Libellé Secteur","Nom Region"};
        lignes = new Vector<>();
        for (Regions reg: lesRegions){
            lignes.add(new String[]{String.valueOf(reg.getIdRegion()),reg.getLibelleSec(),reg.getNomRegion()});
        }
        fireTableDataChanged();
    }
    
}
