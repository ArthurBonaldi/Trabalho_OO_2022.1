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
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import ufjf.dcc025.trabalhooo.model.Maquina;
import ufjf.dcc025.trabalhooo.model.Produto;
import ufjf.dcc025.trabalhooo.model.Usuario;
import ufjf.dcc025.trabalhooo.util.Arquivo;
import ufjf.dcc025.trabalhooo.util.JsonMaquina;
import ufjf.dcc025.trabalhooo.util.JsonProduto;
import ufjf.dcc025.trabalhooo.util.JsonUsuario;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class TelaHomeManager extends JFrame {

    private JButton calcBruto;
    private JButton clientsButton;
    private JButton exitButton;
    private JPanel jPanel1;
    private JButton machineButton;
    private JButton productsButton;
    private JButton profitButton;
    private JLabel subtitleLabel;
    private JLabel titleLabel;
    private JButton viewFuncButton;
    private static List<Produto> produtos = new ArrayList<>();
    private static List<Usuario> usuarios = new ArrayList<>();
    private static int size;

    public TelaHomeManager() {
        initComponents();
    }

    public void montaTela() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHomeManager().setVisible(true);
            }
        });
    }

    public void initComponents() {

        jPanel1 = new JPanel();
        titleLabel = new JLabel();
        subtitleLabel = new JLabel();
        viewFuncButton = new JButton();
        machineButton = new JButton();
        clientsButton = new JButton();
        productsButton = new JButton();
        calcBruto = new JButton();
        profitButton = new JButton();
        exitButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(226, 194, 117));

        titleLabel.setBackground(new Color(0, 0, 0));
        titleLabel.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        titleLabel.setText("       Bem-Vindo " + Usuario.getLoggedUser().getNome());

        subtitleLabel.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        subtitleLabel.setText("         Selecione uma categoria:");

        viewFuncButton.setBackground(new Color(234, 220, 166));
        viewFuncButton.setFont(new Font("Lucida Bright", 1, 11)); // NOI18N
        viewFuncButton.setText("Funcionários");
        viewFuncButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    funcButtonActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TelaHomeManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        machineButton.setBackground(new Color(234, 220, 166));
        machineButton.setFont(new Font("Lucida Bright", 1, 11)); // NOI18N
        machineButton.setText("Máquinas");
        machineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    machineButtonActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TelaHomeManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        clientsButton.setBackground(new Color(234, 220, 166));
        clientsButton.setFont(new Font("Lucida Bright", 1, 11)); // NOI18N
        clientsButton.setText("Clientes");
        clientsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clientsButtonActionPerformed(evt);
            }
        });

        productsButton.setBackground(new Color(234, 220, 166));
        productsButton.setFont(new Font("Lucida Bright", 1, 11)); // NOI18N
        productsButton.setText("Produtos");
        productsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    productsButtonActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TelaHomeManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        calcBruto.setBackground(new Color(234, 220, 166));
        calcBruto.setFont(new Font("Lucida Bright", 1, 11)); // NOI18N
        calcBruto.setText("Faturamento");
        calcBruto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calcBrutoActionPerformed(evt);
            }
        });

        profitButton.setBackground(new Color(234, 220, 166));
        profitButton.setFont(new Font("Lucida Bright", 1, 11)); // NOI18N
        profitButton.setText("Lucro");
        profitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                profitButtonActionPerformed(evt);
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
                                                .addGap(68, 68, 68)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(productsButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(calcBruto, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(viewFuncButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(machineButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(clientsButton, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                                        .addComponent(profitButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(153, 153, 153)
                                                .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                                .addComponent(exitButton)))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(subtitleLabel, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
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
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subtitleLabel)
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(viewFuncButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(machineButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clientsButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(productsButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(calcBruto, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(profitButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(23, Short.MAX_VALUE))
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

    private void clientsButtonActionPerformed(ActionEvent evt) {
        TelaEscolheCliente cliente = new TelaEscolheCliente();
        this.dispose();
        cliente.montaTela();
    }

    private void calcBrutoActionPerformed(ActionEvent evt) {
        double valor = 0;
        produtos = Produto.getProdutos();
        for (Produto p : produtos) {
            valor += p.getPreco() * p.getQuantidade();
        }
        JOptionPane.showMessageDialog(null, "O faturamento será: R$" + valor);
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

    private void profitButtonActionPerformed(ActionEvent evt) {
        double valor = 0;
        produtos = Produto.getProdutos();
        usuarios = Usuario.getUsuarios();
        for (Produto p : produtos) {
            valor += p.getPreco() * p.getQuantidade();
        }
        valor = valor / 4;
        for (Usuario u : usuarios) {
            if (u.getCargo().equals("Gerente")) {
                valor = valor - 2000;

            } else if (u.getCargo().equals("Padeiro")) {
                valor = valor - 1500;
            } else {
                valor = valor - 1200;
            }
        }
        if (valor > 0) {
            String resposta = String.format("O lucro será de:R$ %.2f ", valor);
            JOptionPane.showMessageDialog(null, resposta);
        } else {
            String resposta = String.format("O prejuízo será de:R$ %.2f ", valor);
            JOptionPane.showMessageDialog(null, resposta);
        }

    }

    private void machineButtonActionPerformed(ActionEvent evt) throws FileNotFoundException {
        String maqJson;
        List<Maquina> maquinas = new ArrayList<>();
        maqJson = Arquivo.leArquivo("maquinas.json");
        maquinas = JsonMaquina.toMaquinas(maqJson);
        Maquina.setMaquinas(maquinas);
        size = maquinas.size();
        Maquina.setCurrentId(Maquina.getCurrentId() + size);
        TelaCrudMaquina maquina = new TelaCrudMaquina();
        this.dispose();
        maquina.montaTela();
    }

    private void funcButtonActionPerformed(ActionEvent evt) throws FileNotFoundException {
        String userJson;
        List<Usuario> usuarios = new ArrayList<>();
        userJson = Arquivo.leArquivo("funcionarios.json");
        usuarios = JsonUsuario.toUsuarios(userJson);
        Usuario.setUsuarios(usuarios);
        this.size = usuarios.size();
        Usuario.setCurrentId(Usuario.getCurrentId() + size);
        TelaCrudFuncionarios func = new TelaCrudFuncionarios();
        this.dispose();
        func.montaTela();
    }

    private void productsButtonActionPerformed(ActionEvent evt) throws FileNotFoundException {
        String prodJson;
        List<Produto> produtos = new ArrayList<>();
        prodJson = Arquivo.leArquivo("produtos.json");
        produtos = JsonProduto.toProdutos(prodJson);
        Produto.setProdutos(produtos);
        size = produtos.size();
        Produto.setCurrentId(Usuario.getCurrentId() + size);
        TelacCrudProduto crudProduto = new TelacCrudProduto();
        this.dispose();
        crudProduto.montaTela();
    }

}
