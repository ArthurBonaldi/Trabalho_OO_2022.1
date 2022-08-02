/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.view;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalhooo.model.Usuario;

/**
 *
 * @author arthu
 */
public class TelaEscolheCliente extends JFrame {

    private javax.swing.JButton exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton machineButton;
    private javax.swing.JButton productsButton;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel titleLabel;

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Usuario user = Usuario.getLoggedUser();
        if (user.getCargo().equals("Padeiro")) {
            TelaHomeBaker baker = new TelaHomeBaker();
            this.dispose();
            baker.montaTela();

        } else if (user.getCargo().equals("Gerente")) {
            TelaHomeManager manager = new TelaHomeManager();
            this.dispose();
            manager.montaTela();
        } else {
            TelaHomeCashier cashier = new TelaHomeCashier();
            this.dispose();
            cashier.montaTela();
        }

    }

    private void pfButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TelaCrudPF pf = new TelaCrudPF();
        this.dispose();
        pf.montaTela();
    }

    private void pjButtonActionPerformed(java.awt.event.ActionEvent evt) {

        TelaCrudPJ pj = new TelaCrudPJ();
        this.dispose();
        pj.montaTela();
    }

    public TelaEscolheCliente() {
        initComponents();
    }

    public void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        machineButton = new javax.swing.JButton();
        productsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 194, 117));

        subtitleLabel.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        subtitleLabel.setText("     Selecione o tipo de Cliente:");

        machineButton.setBackground(new java.awt.Color(234, 220, 166));
        machineButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        machineButton.setText("Física");
        machineButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfButtonActionPerformed(evt);
            }
        });

        productsButton.setBackground(new java.awt.Color(234, 220, 166));
        productsButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        productsButton.setText("Jurídica");
        productsButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pjButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(234, 220, 166));
        exitButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        exitButton.setText("Voltar");
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
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(111, 111, 111)
                                                .addComponent(exitButton))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(121, 121, 121)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(subtitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(productsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(machineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 126, Short.MAX_VALUE)))
                                .addContainerGap())
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
                                .addGap(18, 18, 18)
                                .addComponent(subtitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(machineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(productsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63))
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
                new TelaEscolheCliente().setVisible(true);
            }
        });
    }

}
