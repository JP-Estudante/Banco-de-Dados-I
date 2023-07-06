package gui;

public class CadastroFornecedor extends javax.swing.JFrame {
    public CadastroFornecedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroFornecedorJPanel = new javax.swing.JPanel();
        razaoSocialJLabel = new javax.swing.JLabel();
        fornecedorJLabel = new javax.swing.JLabel();
        fornecedorJTextField = new javax.swing.JTextField();
        razaoSocialJTextField = new javax.swing.JTextField();
        cnpjJLabel = new javax.swing.JLabel();
        cnpjJFormattedTextField = new javax.swing.JFormattedTextField();
        bairroJTextField = new javax.swing.JTextField();
        bairroJLabel = new javax.swing.JLabel();
        municipioJTextField = new javax.swing.JTextField();
        municipioJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        botoesJPanel = new javax.swing.JPanel();
        gravarJButton = new javax.swing.JButton();
        gravarJButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Pessoa");

        cadastroFornecedorJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Fornecedor"));

        razaoSocialJLabel.setText("Razão Social:");

        fornecedorJLabel.setText("Fornecedor:");

        fornecedorJTextField.setBackground(new java.awt.Color(25, 25, 25));

        razaoSocialJTextField.setBackground(new java.awt.Color(25, 25, 25));

        cnpjJLabel.setText("CNPJ:");

        cnpjJFormattedTextField.setBackground(new java.awt.Color(25, 25, 25));
        try {
            cnpjJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        bairroJTextField.setBackground(new java.awt.Color(25, 25, 25));

        bairroJLabel.setText("Bairro:");

        municipioJTextField.setBackground(new java.awt.Color(25, 25, 25));

        municipioJLabel.setText("Município:");

        jLabel1.setText("Codigo Mun.:");

        jTextField1.setBackground(new java.awt.Color(25, 25, 25));

        javax.swing.GroupLayout cadastroFornecedorJPanelLayout = new javax.swing.GroupLayout(cadastroFornecedorJPanel);
        cadastroFornecedorJPanel.setLayout(cadastroFornecedorJPanelLayout);
        cadastroFornecedorJPanelLayout.setHorizontalGroup(
            cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroFornecedorJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(municipioJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addGroup(cadastroFornecedorJPanelLayout.createSequentialGroup()
                        .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fornecedorJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(fornecedorJLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bairroJLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bairroJTextField))
                            .addComponent(municipioJLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(razaoSocialJLabel)
                    .addComponent(razaoSocialJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cnpjJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroFornecedorJPanelLayout.createSequentialGroup()
                            .addComponent(cnpjJLabel)
                            .addContainerGap(96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cadastroFornecedorJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        cadastroFornecedorJPanelLayout.setVerticalGroup(
            cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroFornecedorJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornecedorJLabel)
                    .addComponent(razaoSocialJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornecedorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(razaoSocialJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroFornecedorJPanelLayout.createSequentialGroup()
                        .addComponent(cnpjJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnpjJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroFornecedorJPanelLayout.createSequentialGroup()
                        .addComponent(bairroJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairroJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(municipioJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(municipioJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        botoesJPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        gravarJButton.setBackground(new java.awt.Color(25, 25, 25));
        gravarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/exitIcon.png"))); // NOI18N
        gravarJButton.setText("Sair");
        gravarJButton.setToolTipText("");
        gravarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarJButtonActionPerformed(evt);
            }
        });

        gravarJButton1.setBackground(new java.awt.Color(25, 25, 25));
        gravarJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/gravarIcon.png"))); // NOI18N
        gravarJButton1.setText("Gravar");
        gravarJButton1.setToolTipText("");
        gravarJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botoesJPanelLayout = new javax.swing.GroupLayout(botoesJPanel);
        botoesJPanel.setLayout(botoesJPanelLayout);
        botoesJPanelLayout.setHorizontalGroup(
            botoesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gravarJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gravarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        botoesJPanelLayout.setVerticalGroup(
            botoesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botoesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gravarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gravarJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroFornecedorJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botoesJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastroFornecedorJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botoesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gravarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gravarJButtonActionPerformed

    private void gravarJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarJButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gravarJButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroJLabel;
    private javax.swing.JTextField bairroJTextField;
    private javax.swing.JPanel botoesJPanel;
    private javax.swing.JPanel cadastroFornecedorJPanel;
    private javax.swing.JFormattedTextField cnpjJFormattedTextField;
    private javax.swing.JLabel cnpjJLabel;
    private javax.swing.JLabel fornecedorJLabel;
    private javax.swing.JTextField fornecedorJTextField;
    private javax.swing.JButton gravarJButton;
    private javax.swing.JButton gravarJButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel municipioJLabel;
    private javax.swing.JTextField municipioJTextField;
    private javax.swing.JLabel razaoSocialJLabel;
    private javax.swing.JTextField razaoSocialJTextField;
    // End of variables declaration//GEN-END:variables
}
