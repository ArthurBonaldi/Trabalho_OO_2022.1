/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import ufjf.dcc025.trabalhooo.model.Usuario;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class TelaHomeBaker extends JFrame {

    private JButton exitButton;
    private JPanel jPanel1;
    private JButton machineButton;
    private JButton productsButton;
    private JLabel subtitleLabel;
    private JLabel titleLabel;

    public TelaHomeBaker() {
        initComponents();
    }

    public void montaTela() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHomeBaker().setVisible(true);
            }
        });
    }

    public void initComponents() {
        jPanel1 = new JPanel();
        titleLabel = new JLabel();
        subtitleLabel = new JLabel();
        machineButton = new JButton();
        productsButton = new JButton();
        exitButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(226, 194, 117));

        titleLabel.setBackground(new Color(0, 0, 0));
        titleLabel.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        titleLabel.setText("       Bem-Vindo " + Usuario.getLoggedUser().getNome());

        subtitleLabel.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        subtitleLabel.setText("         Selecione uma categoria:");

        machineButton.setBackground(new Color(234, 220, 166));
        machineButton.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        machineButton.setText("Máquinas");
        machineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                machineButtonActionPerformed(evt);
            }
        });

        productsButton.setBackground(new Color(234, 220, 166));
        productsButton.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        productsButton.setText("Produtos");
        productsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                productsButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new Color(234, 220, 166));
        exitButton.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        exitButton.setText("Sair");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                                                .addGap(111, 111, 111)
                                                .addComponent(exitButton))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(121, 121, 121)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(subtitleLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(productsButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(machineButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 126, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(exitButton)))
                                .addGap(18, 18, 18)
                                .addComponent(subtitleLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(machineButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(productsButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void exitButtonActionPerformed(ActionEvent evt) {
        int input = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair?", "Logout", JOptionPane.YES_NO_OPTION);
        if (input == 0) {
            TelaLogin logout = new TelaLogin();
            this.dispose();
            logout.montaTela();
        } else {

        }

    }

    private void machineButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TelaCrudMaquina maquina = new TelaCrudMaquina();
        this.dispose();
        maquina.montaTela();
    }

    private void productsButtonActionPerformed(java.awt.event.ActionEvent evt) {

        TelacCrudProduto prods = new TelacCrudProduto();
        this.dispose();
        prods.montaTela();
    }

}
