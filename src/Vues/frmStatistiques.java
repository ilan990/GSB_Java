/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.ConnexionBdd;
import Entity.FonctionsMetier;
import com.mysql.jdbc.Connection;
import java.text.SimpleDateFormat;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author ilan_
 */
public class frmStatistiques extends javax.swing.JFrame {
   
    /**
     * Creates new form frmStatistiques
     */
    public frmStatistiques() {
        initComponents();
     
        Connection maCnx;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        lblGSBF = new javax.swing.JLabel();
        btnGraph1 = new javax.swing.JButton();
        btnRetour1 = new javax.swing.JButton();
        btnGraph2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/battement-de-coeur (1).png"))); // NOI18N

        lblGSBF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblGSBF.setText("GSB France");

        btnGraph1.setBackground(new java.awt.Color(255, 255, 255));
        btnGraph1.setText("Graphique 1");
        btnGraph1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGraph1MouseClicked(evt);
            }
        });

        btnRetour1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRetour1.setText("<");
        btnRetour1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetour1MouseClicked(evt);
            }
        });

        btnGraph2.setBackground(new java.awt.Color(255, 255, 255));
        btnGraph2.setText("Graphique 2");
        btnGraph2.setBorder(null);
        btnGraph2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGraph2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRetour1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(lblImg)
                        .addGap(123, 123, 123))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGraph1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGraph2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblGSBF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnRetour1)))
                .addGap(18, 18, 18)
                .addComponent(lblGSBF)
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGraph2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGraph1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(351, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ConnexionBdd cnx = new ConnexionBdd();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnGraph1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGraph1MouseClicked
        // TODO add your handling code here:
        FonctionsMetier fm;
        fm = new FonctionsMetier();
        
        DefaultCategoryDataset donnees = new DefaultCategoryDataset();
        // Permet de remplir un jeu de séries dans notre objet donnees
        // DatasSet
        for(Map.Entry valeur : fm.getDatasGraph1().entrySet())
        {
            donnees.setValue(Double.parseDouble(valeur.getValue().toString()),"nombre régions",valeur.getKey().toString());
        }  
    
        JFreeChart graph = ChartFactory.createLineChart("nombre de régions par secteur", "secteurs", "regions", (CategoryDataset) donnees);
        ChartFrame fra = new ChartFrame("Graphique n°1", graph);
        fra.pack();
        fra.setVisible(true);
        
    }//GEN-LAST:event_btnGraph1MouseClicked

    private void btnRetour1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetour1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        frmTableauDeBord frmTDB = new frmTableauDeBord();
        frmTDB.setVisible(true);
    }//GEN-LAST:event_btnRetour1MouseClicked

    private void btnGraph2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGraph2MouseClicked
        // TODO add your handling code here:
        FonctionsMetier fm;
        fm = new FonctionsMetier();
        
        DefaultPieDataset donnees = new DefaultPieDataset();
        
        for(Map.Entry valeur: fm.getDatasGraph2().entrySet())
        {
            donnees.setValue(valeur.getKey().toString(),Integer.parseInt(valeur.getValue().toString()));
        }
        JFreeChart graph = ChartFactory.createPieChart("régions ou travaille les visiteurs",donnees,true,true,true);
        ChartFrame fra = new ChartFrame("Graphique n°2", graph);
        fra.pack();
        fra.setVisible(true);
        
        
//      DefaultCategoryDataset donnees = new DefaultCategoryDataset();
//        
//        for(Map.Entry valeur : fm.getDatasGraph2().entrySet())
//        {
//            Double compteur  = Double.parseDouble((valeur.getValue()).toString());
//            String nomRegion = valeur.getValue().toString();
//            Integer nbVisiteur = Integer.parseInt(valeur.getValue().toString());
//            donnees.setValue(compteur, nomRegion, nbVisiteur);
//        }
//        JFreeChart graph = ChartFactory.createBarChart("régions ou travaille les visiteurs", "nom des traders","nomsecteur", donnees,PlotOrientation.VERTICAL,true,true,false);
//        ChartFrame fra = new ChartFrame("Graphique n°2", graph);
//        fra.pack();
//        fra.setVisible(true);
    }//GEN-LAST:event_btnGraph2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmStatistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmStatistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmStatistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmStatistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmStatistiques().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGraph1;
    private javax.swing.JButton btnGraph2;
    private javax.swing.JButton btnRetour1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGSBF;
    private javax.swing.JLabel lblImg;
    // End of variables declaration//GEN-END:variables
}
