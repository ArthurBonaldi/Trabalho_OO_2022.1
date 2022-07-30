/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author arthu
 */
public class TelaHomeManager extends JFrame {

    public TelaHomeManager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void clientsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TelaCrudCliente cliente = new TelaCrudCliente();
        this.dispose();
        cliente.montaTela();
    }

    private void calcBrutoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TelaLogin login = new TelaLogin();
        JOptionPane.showConfirmDialog(null, "Deseja mesmo sair?");
        //login.montaTela();
        this.dispose();
        login.montaTela();
    }
    private void profitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    } 
    private void machineButtonActionPerformed(java.awt.event.ActionEvent evt){
        TelaCrudMaquina maquina = new TelaCrudMaquina();
        this.dispose();
        maquina.montaTela();
    }
    private void funcButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        TelaCrudFuncionarios func = new TelaCrudFuncionarios();
        this.dispose();
        func.montaTela();
    } 
    
    private void productsButtonActionPerformed(java.awt.event.ActionEvent evt){
        TelacCrudProduto crudProduto = new TelacCrudProduto();
        this.dispose();
        crudProduto.montaTela();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton calcBruto;
    private javax.swing.JButton clientsButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton machineButton;
    private javax.swing.JButton productsButton;
    private javax.swing.JButton profitButton;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewFuncButton;

    // End of variables declaration        

    public void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        viewFuncButton = new javax.swing.JButton();
        machineButton = new javax.swing.JButton();
        clientsButton = new javax.swing.JButton();
        productsButton = new javax.swing.JButton();
        calcBruto = new javax.swing.JButton();
        profitButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(226, 194, 117));

        titleLabel.setBackground(new java.awt.Color(0, 0, 0));
        titleLabel.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        titleLabel.setText("      Bem-Vindo(a) Fulano(a)");

        subtitleLabel.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        subtitleLabel.setText("         Selecione uma categoria:");

        viewFuncButton.setBackground(new java.awt.Color(234, 220, 166));
        viewFuncButton.setFont(new java.awt.Font("Lucida Bright", 1, 11)); // NOI18N
        viewFuncButton.setText("Funcionários");
        viewFuncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcButtonActionPerformed(evt);
            }
        });

        machineButton.setBackground(new java.awt.Color(234, 220, 166));
        machineButton.setFont(new java.awt.Font("Lucida Bright", 1, 11)); // NOI18N
        machineButton.setText("Máquinas");
        machineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machineButtonActionPerformed(evt);
            }
        });

        clientsButton.setBackground(new java.awt.Color(234, 220, 166));
        clientsButton.setFont(new java.awt.Font("Lucida Bright", 1, 11)); // NOI18N
        clientsButton.setText("Clientes");
        clientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsButtonActionPerformed(evt);
            }
        });

        productsButton.setBackground(new java.awt.Color(234, 220, 166));
        productsButton.setFont(new java.awt.Font("Lucida Bright", 1, 11)); // NOI18N
        productsButton.setText("Produtos");
        productsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsButtonActionPerformed(evt);
            }
             });

        calcBruto.setBackground(new java.awt.Color(234, 220, 166));
        calcBruto.setFont(new java.awt.Font("Lucida Bright", 1, 11)); // NOI18N
        calcBruto.setText("Faturamento");
        calcBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBrutoActionPerformed(evt);
            }
        });

        profitButton.setBackground(new java.awt.Color(234, 220, 166));
        profitButton.setFont(new java.awt.Font("Lucida Bright", 1, 11)); // NOI18N
        profitButton.setText("Lucro");
        
        exitButton.setBackground(new java.awt.Color(234, 220, 166));
        exitButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        exitButton.setText("Sair");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(productsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(calcBruto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(viewFuncButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(machineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(clientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                                        .addComponent(profitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(153, 153, 153)
                                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                                .addComponent(exitButton)))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(subtitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(exitButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subtitleLabel)
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(viewFuncButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(machineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(productsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(calcBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(profitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }


    public void montaTela() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHomeManager().setVisible(true);
            }
        });
    }

}
