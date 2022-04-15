package sistemapdv;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Cliente extends javax.swing.JFrame {

    ConexaoMySQL conecta = new ConexaoMySQL();

    private int codigoCliente;

    public Cliente() {
        initComponents();

        conecta.ConectaBanco();

        exibeDadosTabela("SELECT * FROM cliente ORDER BY nome ASC");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE CLIENTE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nome do cliente");

        btNovo.setText("Novo");
        btNovo.setPreferredSize(new java.awt.Dimension(90, 30));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.setPreferredSize(new java.awt.Dimension(90, 30));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.setPreferredSize(new java.awt.Dimension(90, 30));
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.setPreferredSize(new java.awt.Dimension(90, 30));

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);
        if (tabelaCliente.getColumnModel().getColumnCount() > 0) {
            tabelaCliente.getColumnModel().getColumn(0).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabelaCliente.getColumnModel().getColumn(1).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(1).setPreferredWidth(500);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed

        limpaCampos();


    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        salvarCliente();
        limpaCampos();


    }//GEN-LAST:event_btSalvarActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked

        int posicaoLinha = tabelaCliente.getSelectedRow();

        codigoCliente = Integer.parseInt(tabelaCliente.getValueAt(posicaoLinha, 0).toString());

        campoNome.setText(tabelaCliente.getValueAt(posicaoLinha, 1).toString());

    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed

        atualizarCliente();


    }//GEN-LAST:event_btAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCliente;
    // End of variables declaration//GEN-END:variables

    //MEUS MÉTODOS
    //MÉTODO LIMPA CAMPOS
    private void limpaCampos() {

        campoNome.setText("");

    }

    //MÉTODO SALVAR
    private void salvarCliente() {

        String nome;
        nome = campoNome.getText();
        PreparedStatement executaSQL;

        try {

            executaSQL = conecta.conexao.prepareStatement("INSERT INTO cliente (nome,cpf) VALUES (?)");
            executaSQL.setString(1, nome);
            executaSQL.execute();

            JOptionPane.showMessageDialog(null, "OPERAÇÃO REALIZADA COM SUCESSO!");

            exibeDadosTabela("SELECT * FROM cliente ORDER BY nome ASC");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO NA OPERAÇÃO!\nERRO: " + ex.getMessage());
        }
    }

    //MÉTODO ATUALIZAR CLIENTE
    private void atualizarCliente() {

        String nome, SQL = null;

        nome = campoNome.getText();

        SQL = "UPDATE cliente SET nome = '" + nome + "' WHERE codigo =" + codigoCliente;

        PreparedStatement executaSQL;

        try {

            executaSQL = conecta.conexao.prepareStatement(SQL);
            executaSQL.execute();

            JOptionPane.showMessageDialog(null, "OPERAÇÃO REALIZADA COM SUCESSO!");

            limpaCampos();

            exibeDadosTabela("SELECT * FROM cliente ORDER BY nome ASC");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO NA OPERAÇÃO!\nERRO: " + ex.getMessage());
        }

    }

    //MÉTODO PARA REMOVER CLIENTE
    private void removerCliente() {

        String SQL = null;

        SQL = "DELETE FROM cliente  WHERE codigo =" + codigoCliente;

        PreparedStatement executaSQL;

        try {

            executaSQL = conecta.conexao.prepareStatement(SQL);
            executaSQL.execute();

            JOptionPane.showMessageDialog(null, "OPERAÇÃO REALIZADA COM SUCESSO!");

            limpaCampos();

            exibeDadosTabela("SELECT * FROM cliente ORDER BY nome ASC");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO NA OPERAÇÃO!\nERRO: " + ex.getMessage());
        }
    }

    //MÉTODO PARA EXIBIR OS DADOS DO CLIENTE NA TABELA
    public void exibeDadosTabela(String SQL) {

        //VARIÁVEL QUE IRÁ EXECUTAR AS INSTRUÇÃO SQL  
        PreparedStatement executaSQL;

        try {

            executaSQL = conecta.conexao.prepareStatement(SQL);

            conecta.resultado = executaSQL.executeQuery();

            DefaultTableModel modeloTabela = (DefaultTableModel) tabelaCliente.getModel();
            modeloTabela.setNumRows(0);

            while (conecta.resultado.next()) {
                modeloTabela.addRow(new Object[]{
                    conecta.resultado.getString("codigo"),
                    conecta.resultado.getString("nome")
                });
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO NA OPERAÇÃO!\nERRO: " + ex.getMessage());
        }

    }

}
