/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.view;

import java.awt.EventQueue;
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
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import ufjf.dcc025.trabalhooo.model.PF;
import ufjf.dcc025.trabalhooo.model.PJ;
import ufjf.dcc025.trabalhooo.model.Usuario;
import ufjf.dcc025.trabalhooo.util.Arquivo;
import ufjf.dcc025.trabalhooo.util.JsonPF;
import ufjf.dcc025.trabalhooo.util.JsonPJ;

/**
 *
 * @author arthu
 */
public class TelaEscolheCliente extends JFrame {

    private JButton exitButton;
    private JPanel jPanel1;
    private JButton machineButton;
    private JButton productsButton;
    private JLabel subtitleLabel;
    private JLabel titleLabel;
    private int size;

   

    public TelaEscolheCliente() {
        initComponents();
    }
    
     public void montaTela() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEscolheCliente().setVisible(true);
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

        jPanel1.setBackground(new java.awt.Color(226, 194, 117));

        subtitleLabel.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        subtitleLabel.setText("     Selecione o tipo de Cliente:");

        machineButton.setBackground(new java.awt.Color(234, 220, 166));
        machineButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        machineButton.setText("Física");
        machineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    pfButtonActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TelaEscolheCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        productsButton.setBackground(new java.awt.Color(234, 220, 166));
        productsButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        productsButton.setText("Jurídica");
        productsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    pjButtonActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TelaEscolheCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        exitButton.setBackground(new java.awt.Color(234, 220, 166));
        exitButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        exitButton.setText("Voltar");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
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

    private void pfButtonActionPerformed(ActionEvent evt) throws FileNotFoundException {
        String pfJson;
        List<PF> pfs = new ArrayList<>();
         pfJson = Arquivo.leArquivo("pfs.json");
        pfs = JsonPF.toPFs(pfJson);
        PF.setPessoasF(pfs);
        size = pfs.size();
        PF.setCurrentId(PF.getCurrentId()+size);
        TelaCrudPF pf = new TelaCrudPF();
        this.dispose();
        pf.montaTela();
    }

    private void pjButtonActionPerformed(ActionEvent evt) throws FileNotFoundException {
        String pjJson;
        List<PJ> pjs = new ArrayList<>();
         pjJson = Arquivo.leArquivo("pjs.json");
        pjs = JsonPJ.toPJs(pjJson);
        PJ.setPessoasJ(pjs);
        size = pjs.size();
        PJ.setCurrentId(PJ.getCurrentId()+size);

        TelaCrudPJ pj = new TelaCrudPJ();
        this.dispose();
        pj.montaTela();
    }

   

}
