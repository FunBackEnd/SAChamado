/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas.A
 */
public class Cadastro_Chamados extends javax.swing.JInternalFrame {
    //int t
    /**
     * Creates new form Cadastro_Chamados
     */
    public Cadastro_Chamados() {
        initComponents();
        comboBoxSolicitação.setSelectedIndex(-1);
        comboBoxNivel.setSelectedIndex(-1);
        comboBoxStatus.setSelectedIndex(-1);
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
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboBoxStatus = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboBoxNivel = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSolicitante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescrição = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSolucao = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        comboBoxSolicitação = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtTecnico = new javax.swing.JTextField();
        bntCadastra = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();
        bntLimparCampos = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        setClosable(true);
        setForeground(new java.awt.Color(255, 153, 0));
        setIconifiable(true);
        setResizable(true);
        setTitle("Abertura de Chamado");
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(600, 510));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel1.setText("Titulo :");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel2.setText("Cliente: ");

        jLabel3.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel3.setText("Status do Chamado:");

        comboBoxStatus.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        comboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguardando Atendimento", "Aguardando Cliente", "Atendimento Cancelado", "Atendimento em Andamento", "Atendimento Encerrado" }));

        jLabel4.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel4.setText("Nivel:");

        comboBoxNivel.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        comboBoxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixo", "Medio", "Alto", "Urgente" }));

        jLabel5.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel5.setText("Data de Abertura:");

        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtData.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel6.setText("Solicitante:");

        jLabel7.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel7.setText("ID:");

        jLabel8.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel8.setText("Descrição do Chamado:");

        txtDescrição.setColumns(20);
        txtDescrição.setRows(5);
        jScrollPane1.setViewportView(txtDescrição);

        jLabel9.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel9.setText("Diagnostico:");

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        jScrollPane2.setViewportView(txtDiagnostico);

        jLabel10.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel10.setText("Solução:");

        txtSolucao.setColumns(20);
        txtSolucao.setRows(5);
        jScrollPane3.setViewportView(txtSolucao);

        jLabel11.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel11.setText("Tipo de Solicitação:");

        comboBoxSolicitação.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        comboBoxSolicitação.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manutenção", "Duvida", "Melhoria", "Solicitação", "Bugs", "Visita Tecnica" }));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel12.setText("Tecnico Responsavel:");

        bntCadastra.setBackground(new java.awt.Color(51, 255, 51));
        bntCadastra.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        bntCadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/verify.png"))); // NOI18N
        bntCadastra.setText("CADASTRAR");
        bntCadastra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 51)));
        bntCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastraActionPerformed(evt);
            }
        });

        bntCancelar.setBackground(new java.awt.Color(255, 51, 51));
        bntCancelar.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        bntCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/browser.png"))); // NOI18N
        bntCancelar.setText("CANCELAR");
        bntCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 51)));
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        bntLimparCampos.setBackground(new java.awt.Color(204, 204, 204));
        bntLimparCampos.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        bntLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/clear.png"))); // NOI18N
        bntLimparCampos.setText("LIMPAR TELA");
        bntLimparCampos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 51)));
        bntLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxSolicitação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTecnico))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSolicitante))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(203, 203, 203))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(210, 210, 210))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(bntCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(bntLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(comboBoxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(comboBoxSolicitação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntLimparCampos)
                    .addComponent(bntCadastra)
                    .addComponent(bntCancelar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        int teste = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar o chamado? ", "TITULO", JOptionPane.YES_NO_OPTION);
        if (teste == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Chamado cancelado com sucesso");
            dispose();
        } else {

        }
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void bntLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparCamposActionPerformed
        txtTitulo.setText("");
        txtCliente.setText("");
        comboBoxStatus.setSelectedIndex(-1);
        comboBoxSolicitação.setSelectedIndex(-1);
        comboBoxNivel.setSelectedIndex(-1);
        txtData.setText("");
        txtDescrição.setText("");
        txtDiagnostico.setText("");
        txtId.setText("");
        txtSolicitante.setText("");
        txtSolucao.setText("");
        txtTecnico.setText("");
comboBoxStatus.setSelectedIndex(-1);
        comboBoxSolicitação.setSelectedIndex(-1);
        comboBoxNivel.setSelectedIndex(-1);
    }//GEN-LAST:event_bntLimparCamposActionPerformed

    private void bntCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastraActionPerformed
        String str = String.format("ID: %s\nTitulo: %s\nCliente: %s\n"
                        + "Status do Chamado: %s\nNivel: %s\n"
                        + "Data de Abertura: %s\n"
                        + "Tipo de solicitação: %s\nTecnico responsavel: %s\n",txtId.getText(), txtTitulo.getText(), txtCliente.getText(),comboBoxStatus.getSelectedItem() ,comboBoxNivel.getSelectedItem(),
                        txtData.getText(),comboBoxSolicitação.getSelectedItem(),txtTecnico.getText());
        String stu = String.format("Descrição: %s\nDiagnostico: %s\nSolução: "+txtDescrição.getText(),txtDiagnostico.getText(),txtSolucao.getText());

        JOptionPane.showMessageDialog(null,str);
        JOptionPane.showMessageDialog(null, stu);


        JOptionPane.showMessageDialog(null, "Pedido de chamado cadastrado");
    }//GEN-LAST:event_bntCadastraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCadastra;
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntLimparCampos;
    private javax.swing.JComboBox<String> comboBoxNivel;
    private javax.swing.JComboBox<String> comboBoxSolicitação;
    private javax.swing.JComboBox<String> comboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextArea txtDescrição;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSolicitante;
    private javax.swing.JTextArea txtSolucao;
    private javax.swing.JTextField txtTecnico;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
