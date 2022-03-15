/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Travailler;
import Entity.Visiteurs;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ilan_
 */
public class ModelTravailler extends AbstractTableModel {
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
    
    public void LoadDats5Colonnes(ArrayList<Travailler> lestravaux)
    {
        nomColonnes= new String[]{"nom","prenom","date","region","rôle"};
        lignes = new Vector<>();
        for (Travailler tra: lestravaux){
            lignes.add(new String[]{tra.getNomVisiteur(),tra.getPrenomVisiteur(),String.valueOf(tra.getDateTravailler()),tra.getNomRegion(),tra.getRoleTravailler()});
        }
        fireTableDataChanged();
    }
}
