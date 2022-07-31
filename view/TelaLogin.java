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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import ufjf.dcc025.trabalhooo.controller.LoginController;
import ufjf.dcc025.trabalhooo.model.Usuario;

/**
 *
 * @author arthu
 */
public class TelaLogin extends JFrame {

    private JButton exitButton;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JButton loginButton;
    private JLabel passwordLabel;
    private JLabel subtitleLabel;
    private JPasswordField tfPassword;
    private JTextField tfUser;
    private JLabel titleLabel;
    private JLabel userLabel;

    public TelaLogin() {
        initComponents();
    }

    private void exitButtonActionPerformed(ActionEvent evt) {
        int input = JOptionPane.showConfirmDialog(null, "Saindo...", "Deseja mesmo sair?", JOptionPane.YES_NO_OPTION);
        if(input ==0){
            this.dispose();
            System.exit(0);
        }
        else{
            
        }
    }
    private void loginButtonActionPerformed(ActionEvent evt) {                                            
        LoginController login = new LoginController();
        if(login.logar(tfUser.getText(), (new String(tfPassword.getPassword())))){
            Usuario user = Usuario.getLoggedUser();
            if(user.getCargo().equals("Gerente")){
                TelaHomeManager manager = new TelaHomeManager();
                this.dispose();
                manager.montaTela();
            }
            else if(user.getCargo().equals("Caixa")){
                TelaHomeCashier cashier = new TelaHomeCashier();
                this.dispose();
                cashier.montaTela();
            }
            else if(user.getCargo().equals("Padeiro")){
                TelaHomeBaker baker = new TelaHomeBaker();
                this.dispose();
                baker.montaTela();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuário/Senha Inválida");
        }
        
    }  

    public void initComponents() {
        jPanel1 = new JPanel();
        userLabel = new JLabel();
        subtitleLabel = new JLabel();
        tfUser = new JTextField();
        passwordLabel = new JLabel();
        tfPassword = new JPasswordField();
        loginButton = new JButton();
        exitButton = new JButton();
        jPanel2 = new JPanel();
        titleLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(226, 194, 117));

        userLabel.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        userLabel.setText("Email");

        subtitleLabel.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        subtitleLabel.setText("Faça Login para continuar");

        passwordLabel.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        passwordLabel.setText("Senha:");

        loginButton.setBackground(new Color(234, 220, 166));
        loginButton.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        loginButton.setText("Entrar");
         loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loginButtonActionPerformed(evt);
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

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(userLabel)
                    .addComponent(passwordLabel))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(tfUser, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(exitButton)
                                .addContainerGap())
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(subtitleLabel)
                                .addGap(112, 112, 112)))
                        .addComponent(tfPassword, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loginButton)
                        .addGap(157, 157, 157))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(subtitleLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(tfUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new Color(196, 105, 45));

        titleLabel.setFont(new Font("Lucida Bright", 1, 14)); // NOI18N
        titleLabel.setText("Padaria Sonho Bom - Login");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(19, 19, 19))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    public void montaTela() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

}
