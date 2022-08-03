/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import ufjf.dcc025.trabalhooo.model.Produto;
import ufjf.dcc025.trabalhooo.model.Usuario;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class TelaHomeCashier extends JFrame {

    private JButton calcBruto;
    private JButton clientsButton;
    private JButton exitButton;
    private JPanel jPanel1;
    private JButton productsButton;
    private JLabel subtitleLabel;
    private JLabel titleLabel;
    private static List<Produto> produtos = new ArrayList<>();

    public TelaHomeCashier() {
        initComponents();
    }

    public void montaTela() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHomeCashier().setVisible(true);
            }
        });
    }

    public void initComponents() {
        jPanel1 = new JPanel();
        titleLabel = new JLabel();
        subtitleLabel = new JLabel();
        clientsButton = new JButton();
        productsButton = new JButton();
        calcBruto = new JButton();
        exitButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(226, 194, 117));

        titleLabel.setBackground(new java.awt.Color(0, 0, 0));
        titleLabel.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        titleLabel.setText("       Bem-Vindo " + Usuario.getLoggedUser().getNome());

        subtitleLabel.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        subtitleLabel.setText("         Selecione uma categoria:");

        clientsButton.setBackground(new java.awt.Color(234, 220, 166));
        clientsButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        clientsButton.setText("Clientes");
        clientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsButtonActionPerformed(evt);
            }
        });

        productsButton.setBackground(new java.awt.Color(234, 220, 166));
        productsButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        productsButton.setText("Produtos");
        productsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsButtonActionPerformed(evt);
            }
        });

        calcBruto.setBackground(new java.awt.Color(234, 220, 166));
        calcBruto.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        calcBruto.setText("Faturamento");
        calcBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBrutoActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(234, 220, 166));
        exitButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        exitButton.setText("Sair");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(153, 153, 153)
                                                .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                                .addComponent(exitButton))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(productsButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(calcBruto, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(clientsButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(subtitleLabel, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(clientsButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(calcBruto, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(productsButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(93, Short.MAX_VALUE))
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

    private void clientsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TelaEscolheCliente cliente = new TelaEscolheCliente();
        this.dispose();
        cliente.montaTela();
    }

    private void calcBrutoActionPerformed(java.awt.event.ActionEvent evt) {
        double valor = 0;
        produtos = Produto.getProdutos();
        for (Produto p : produtos) {
            valor += p.getPreco() * p.getQuantidade();
        }
        JOptionPane.showMessageDialog(null, "O faturamento será: " + valor);
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int input = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair?", "Logout", JOptionPane.YES_NO_OPTION);
        if (input == 0) {
            TelaLogin logout = new TelaLogin();
            this.dispose();
            logout.montaTela();
        } else {

        }
    }

    private void productsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TelacCrudProduto crudProduto = new TelacCrudProduto();
        this.dispose();
        crudProduto.montaTela();
    }

}
