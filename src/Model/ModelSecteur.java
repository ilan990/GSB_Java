/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.Secteurs;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dan
 * Création de la class ModelSecteur permettant de générer le tableau
 */
public class ModelSecteur extends AbstractTableModel{

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
    
    public void LoadDats2Colonnes(ArrayList<Secteurs> lesSecteurs)
    {
        nomColonnes= new String[]{"id","libelle"};
        lignes = new Vector<>();
        for (Secteurs sec: lesSecteurs){
            lignes.add(new String[]{String.valueOf(sec.getIdSecteur()),sec.getLibelleSecteur()});
        }
        fireTableDataChanged();
    }
    
}
