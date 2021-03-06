/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import dao.mysql.ProjetoDAO;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Flavia
 */
public class TelaSelecionarProjeto extends javax.swing.JFrame {

    private String UsuarioLogado = "";
    private int codigoSelecionado = 0;

    private static TelaSelecionarProjeto myInstance;
    private ProjetoDAO projeDAO;

    public TelaSelecionarProjeto() {
        TelaLogin login = new TelaLogin(null, true);
        login.setVisible(true);

        UsuarioLogado = login.getUsuario();
        if (!UsuarioLogado.equals("")) {
            initComponents();
        }
        projeDAO = new ProjetoDAO();
    }

    public static TelaSelecionarProjeto getInstance() {
        if (myInstance == null) {
            myInstance = new TelaSelecionarProjeto();
        }
        return myInstance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProjeto = new javax.swing.JTable();
        btnNovoProjeto = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Projetos");

        tblProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProjetoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProjeto);

        btnNovoProjeto.setText("Cadastrar Novo ");
        btnNovoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProjetoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(0, 452, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNovoProjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProjeto)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProjetoActionPerformed
        TelaCadastroProjeto tela = new TelaCadastroProjeto(null, true, 0);
        tela.setVisible(true);
        atualizaTabela();
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnNovoProjetoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        atualizaTabela();

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        if (JOptionPane.showConfirmDialog(this, "Deseja sair do programa?", "Atenção",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        TelaCadastroProjeto tela = new TelaCadastroProjeto(null, true, codigoSelecionado);
        tela.setVisible(true);
        atualizaTabela();
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        if (codigoSelecionado != 0) {
            if (JOptionPane.showConfirmDialog(this, "Deseja excluir esse Projeto?", "Atenção",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                projeDAO.excluir(codigoSelecionado);
                atualizaTabela();
                codigoSelecionado = 0;
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProjetoMouseClicked
        // TODO add your handling code here:
        JTable tabela = (JTable) evt.getSource();
        int row = tabela.rowAtPoint(evt.getPoint());
        //int column = source.columnAtPoint(evt.getPoint());

        String codigo = tabela.getModel().getValueAt(row, 0) + "";
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);

        codigoSelecionado = Integer.parseInt(codigo);
    }//GEN-LAST:event_tblProjetoMouseClicked
    public void atualizaTabela() {
        ResultSet rs = projeDAO.selecionarTabela();
        try {
            ResultSetMetaData metaData = rs.getMetaData();
// names of columns
            Vector<String> columnNames = new Vector<String>();
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++) {
                columnNames.add(metaData.getColumnName(column));
            }
// data of the table
            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> vector = new Vector<Object>();
                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                    vector.add(rs.getObject(columnIndex));
                }
                data.add(vector);
            }
            tblProjeto.setModel(new DefaultTableModel(data, columnNames));
//            int vColIndex = 0;
//            tblProjeto.getColumnModel().getColumn(vColIndex).setHeaderValue("Novo Nome");  
        } catch (SQLException ex) {
            Logger.getLogger(TelaSelecionarProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(TelaSelecionarProjeto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSelecionarProjeto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSelecionarProjeto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSelecionarProjeto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSelecionarProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovoProjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProjeto;
    // End of variables declaration//GEN-END:variables
}
