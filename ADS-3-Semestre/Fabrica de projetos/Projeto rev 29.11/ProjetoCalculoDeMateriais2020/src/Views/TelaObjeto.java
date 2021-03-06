/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import dao.mysql.MateriaisDAO;
import dao.mysql.ObjetoCalculoDAO;
import dao.mysql.ObjetoDAO;
import dao.mysql.ObjetoRecorteDAO;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.Materiais;
import models.ObjetoCalculoMaterial;
import models.ObjetoCalculoMaterialMateriais;
import models.ObjetoCalculoMaterialRecorte;

/**
 *
 * @author ngarcia
 */
public class TelaObjeto extends javax.swing.JDialog {

    private ObjetoDAO objDAO;
    private MateriaisDAO matDAO;
    private ObjetoRecorteDAO objRDAO;
    private ObjetoCalculoDAO calDAO;
    private int id_ambiente;

    public TelaObjeto(java.awt.Frame parent, boolean modal, int id_ambiente) {
        super(parent, modal);
        initComponents();
        this.id_ambiente = id_ambiente;
        
        objDAO = new ObjetoDAO();
        matDAO = new MateriaisDAO();
        objRDAO = new ObjetoRecorteDAO();
        calDAO = new ObjetoCalculoDAO();
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
        txtAltura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLargura = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        BtnRecorte = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCalculo = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        lblAmbiente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboMaterial = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        scrTabela = new javax.swing.JScrollPane();
        tblRecorte = new javax.swing.JTable();
        btnSalvar1 = new javax.swing.JButton();
        txtQtd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQtdMao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblAreaUtill = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nome");

        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });

        jLabel2.setText("Largura");

        jLabel3.setText("Altura");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        BtnRecorte.setText("Cadastro Recorte");
        BtnRecorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecorteActionPerformed(evt);
            }
        });

        tblCalculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblCalculo);

        jButton5.setText("Voltar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lblAmbiente.setText("Cadastro de Objeto");

        jLabel4.setText("Recorte");

        comboMaterial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMaterialItemStateChanged(evt);
            }
        });
        comboMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMaterialActionPerformed(evt);
            }
        });

        jLabel5.setText("Material");

        tblRecorte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRecorte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRecorteMouseClicked(evt);
            }
        });
        scrTabela.setViewportView(tblRecorte);

        btnSalvar1.setText("Salvar");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });

        jLabel6.setText("Quantidade");

        txtQtdMao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdMaoActionPerformed(evt);
            }
        });

        jLabel7.setText("Qtd Mão");

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jLabel8.setText("Objeto de Cálculo");

        lblAreaUtill.setText("--/--");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(scrTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BtnRecorte)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAreaUtill)
                            .addGap(41, 41, 41))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(comboMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(txtQtdMao)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(242, 242, 242))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(txtNome))
                                .addGap(87, 87, 87)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtLargura, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addContainerGap(65, Short.MAX_VALUE)))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAmbiente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAmbiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLargura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BtnRecorte)
                    .addComponent(lblAreaUtill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtdMao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(btnImprimir))
                .addGap(67, 67, 67))
        );

        setSize(new java.awt.Dimension(538, 653));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed
    public void atualizaComboboxMaterial() {
        ArrayList<Materiais> objeto = matDAO.selecionar();
        comboMaterial.setModel(new DefaultComboBoxModel<Materiais>(objeto.toArray(new Materiais[objeto.size()])));
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ObjetoCalculoMaterial obj = new ObjetoCalculoMaterial();

        obj.setNome_objCalcMat(txtNome.getText());
        obj.setAltura(Float.parseFloat(txtAltura.getText()));
        obj.setLargura(Float.parseFloat(txtLargura.getText()));
        obj.setId_ambiente(id_ambiente);
        objDAO.inserir(obj);

        JOptionPane.showMessageDialog(this, "Salvo com sucesso!");

        dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    public void atualizaTabelaRecorte() {

        ResultSet tbl = objRDAO.selecionarTabela();
        try {
            ResultSetMetaData metaData = tbl.getMetaData();
            // names of columns
            Vector<String> columnNamesTbl = new Vector<String>();
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++) {
                columnNamesTbl.add(metaData.getColumnName(column));
            }
            // data of the table
            Vector<Vector<Object>> dataTbl = new Vector<Vector<Object>>();
            while (tbl.next()) {
                Vector<Object> vectorTbl = new Vector<Object>();
                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                    vectorTbl.add(tbl.getObject(columnIndex));
                }
                dataTbl.add(vectorTbl);
            }
            tblRecorte.setModel(new DefaultTableModel(dataTbl, columnNamesTbl));
            int vColIndex = 0;
            tblRecorte.getColumnModel().getColumn(vColIndex).setHeaderValue("Código Objeto");
            tblRecorte.getColumnModel().getColumn(1).setHeaderValue("Nome Objeto");
            tblRecorte.getColumnModel().getColumn(2).setHeaderValue("Altura");
            tblRecorte.getColumnModel().getColumn(3).setHeaderValue("Largura");
        } catch (SQLException ex) {
            Logger.getLogger(TelaSelecionarProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void atualizaTabelaCalculo() {

        ResultSet tbl1 = calDAO.selecionarTabela();
        try {
            ResultSetMetaData metaData = tbl1.getMetaData();
// names of columns
            Vector<String> columnNamesTbl1 = new Vector<String>();
            int columnCount1 = metaData.getColumnCount();
            for (int column = 1; column <= columnCount1; column++) {
                columnNamesTbl1.add(metaData.getColumnName(column));
            }
// data of the table
            Vector<Vector<Object>> dataTbl1 = new Vector<Vector<Object>>();
            while (tbl1.next()) {
                Vector<Object> vectorTbl = new Vector<Object>();
                for (int columnIndex = 1; columnIndex <= columnCount1; columnIndex++) {
                    vectorTbl.add(tbl1.getObject(columnIndex));
                }
                dataTbl1.add(vectorTbl);
            }
            tblCalculo.setModel(new DefaultTableModel(dataTbl1, columnNamesTbl1));
            tblCalculo.getColumnModel().getColumn(0).setHeaderValue("Código Objeto");
            tblCalculo.getColumnModel().getColumn(1).setHeaderValue("Quantidade");
            tblCalculo.getColumnModel().getColumn(2).setHeaderValue("Material");
            tblCalculo.getColumnModel().getColumn(3).setHeaderValue("Obj");
            tblCalculo.getColumnModel().getColumn(4).setHeaderValue("Rendimento");
        } catch (SQLException ex) {
            Logger.getLogger(TelaSelecionarProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void BtnRecorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecorteActionPerformed
        TelaCadastroRecorte t = new TelaCadastroRecorte(null, true);
        t.setVisible(true);
        atualizaTabelaRecorte();
        AtaulizarObjeto();
    }//GEN-LAST:event_BtnRecorteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void comboMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMaterialActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizaComboboxMaterial();
    }//GEN-LAST:event_formWindowActivated

    private void comboMaterialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMaterialItemStateChanged
        Materiais mat = (Materiais) comboMaterial.getSelectedItem();
    }//GEN-LAST:event_comboMaterialItemStateChanged

    private void tblRecorteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecorteMouseClicked
        JTable tabela = (JTable) evt.getSource();
        int row = tabela.rowAtPoint(evt.getPoint());
        //int column = source.columnAtPoint(evt.getPoint());

        String codigo = tabela.getModel().getValueAt(row, 0) + "";

        //        btnEdit.setEnabled(true);
    }//GEN-LAST:event_tblRecorteMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        atualizaTabelaRecorte();
        atualizaTabelaCalculo();                       
    }//GEN-LAST:event_formWindowOpened

    private void AtaulizarObjeto() {
        ArrayList<ObjetoCalculoMaterialRecorte> listRecorte =  objRDAO.selecionarPorIdCalculo(1);
        
        ObjetoCalculoMaterial obj = new ObjetoCalculoMaterial();
        obj.setNome_objCalcMat(txtNome.getText());
        obj.setAltura(Float.parseFloat(txtAltura.getText()));
        obj.setLargura(Float.parseFloat(txtLargura.getText()));
        obj.setId_ambiente(id_ambiente);
        
        float area = obj.CalcularArea();
        float areaUtil = obj.CalcularAreaUtil(listRecorte);     
        
        lblAreaUtill.setText(areaUtil + "/" + area);        
    } 
    
    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed

        ObjetoCalculoMaterialMateriais cal = new ObjetoCalculoMaterialMateriais();
        Materiais usu = (Materiais) comboMaterial.getSelectedItem();
        cal.setId_ocmMat(usu.getId_mat());
        cal.setQuantidade(Integer.parseInt(txtQtd.getText()));
        cal.setQntDmao_ocm(Integer.parseInt(txtQtdMao.getText()));
        cal.setId_ocmMatCalc(1);

        calDAO.inserir(cal);

        JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
        atualizaTabelaCalculo();
        TelaObjeto t = new TelaObjeto(null, true, id_ambiente);
        t.setVisible(true);


    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdActionPerformed

    private void txtQtdMaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdMaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdMaoActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // Buscando pasta para salvar o PDF
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        j.showSaveDialog(this);
        path = j.getSelectedFile().getPath();

        try {
            //Gerando documento pdf
            PdfWriter writer = new PdfWriter(path + "/Listagem.pdf");
            PdfDocument pdf = new PdfDocument(writer);
            pdf.setTagged();
            pdf.setDefaultPageSize(PageSize.A4);
            Document doc = new Document(pdf);

            //Criando cabeçalho
            Paragraph titulo = new Paragraph("Lista de Materiais/Orçamento");
            titulo.setBold();
            titulo.setFontSize(15);
            titulo.setTextAlignment(TextAlignment.CENTER);
            doc.add(titulo);

            //Criando a tabela
            Table tbl = new Table(4).useAllAvailableWidth();
            tbl.addCell("Codigo");
            tbl.addCell("Quantidade");
            tbl.addCell("Material");
            tbl.addCell("Obj");

            for (int i = 0; i < tblCalculo.getRowCount(); i++) {
                tbl.addCell(tblCalculo.getValueAt(i, 0).toString());
                tbl.addCell(tblCalculo.getValueAt(i, 1).toString());
                tbl.addCell(tblCalculo.getValueAt(i, 2).toString());
                tbl.addCell(tblCalculo.getValueAt(i, 3).toString());

            }
            doc.add(tbl);

            doc.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao gerar relatório " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaObjeto dialog = new TelaObjeto(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRecorte;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox<Materiais> comboMaterial;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAmbiente;
    private javax.swing.JLabel lblAreaUtill;
    private javax.swing.JScrollPane scrTabela;
    private javax.swing.JTable tblCalculo;
    private javax.swing.JTable tblRecorte;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtLargura;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtQtdMao;
    // End of variables declaration//GEN-END:variables
}
