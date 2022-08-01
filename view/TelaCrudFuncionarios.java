
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ufjf.dcc025.trabalhooo.controller.ButtonFunction;
import ufjf.dcc025.trabalhooo.controller.UsuarioController;
import ufjf.dcc025.trabalhooo.model.Usuario;

/**
 *
 * @author arthu
 */
public class TelaCrudFuncionarios extends JFrame implements ButtonFunction {

    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    private static List<Usuario> usuarios = new ArrayList<>();

    public TelaCrudFuncionarios() {
        initComponents();
    }

    @Override
    public void backButtonActionPerformed(ActionEvent evt) {
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

    @Override
    public void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        tfName.setText("");
        tfPassword.setText("");
        tfEmail.setText("");
    }

    @Override
    public void editButtonActionPerformed(ActionEvent evt, int id) {
        DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
        UsuarioController userUp = new UsuarioController();
        Usuario editU = new Usuario();
        editU = userUp.update(tfName.getText(), tfEmail.getText(), tfPassword.getText(), jComboBox1.getSelectedItem().toString(), id);
        tblmodel.setValueAt(editU.getNome(), jTable1.getSelectedRow(), 1);
        tblmodel.setValueAt(editU.getEmail(), jTable1.getSelectedRow(), 2);
        tblmodel.setValueAt(editU.getCargo(), jTable1.getSelectedRow(), 3);

    }

    @Override
    public void deleteButtonActionPerformed(java.awt.event.ActionEvent evt, int id) {
        UsuarioController produto = new UsuarioController();
        int option = JOptionPane.showConfirmDialog(null, "Excluindo Produto", "Confirmar Exclusão?", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            produto.delete(id);
            DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
            tblmodel.removeRow(jTable1.getSelectedRow());
        } else {

        }

    }

    private void jTable1MouseClicked(MouseEvent evt) {
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        String tblname = tbl.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblEmail = tbl.getValueAt(jTable1.getSelectedRow(), 2).toString();
        tfName.setText(tblname);
        tfEmail.setText(tblEmail);

    }

    @Override
    public void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        UsuarioController user = new UsuarioController();
        Usuario created;
        created = user.create(tfName.getText(), tfEmail.getText(), tfPassword.getText(), jComboBox1.getSelectedItem().toString());
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{created.getId(), created.getNome(), created.getEmail(), created.getCargo()});

    }

    public void montaTela() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCrudFuncionarios().setVisible(true);
            }
        });
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 194, 117));

        jTable1.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Id", "Nome", "Email", "Cargo"
                }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        for (Usuario u : usuarios) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{u.getId(), u.getNome(), u.getEmail(), u.getCargo()});
        }
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel1.setText("Nome: ");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel2.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel4.setText("Cadastro de Funcionários");

        addButton.setBackground(new java.awt.Color(234, 220, 166));
        addButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        addButton.setText("Cadastrar");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(234, 220, 166));
        editButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        editButton.setText("Editar");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
                String idText = tbl.getValueAt(jTable1.getSelectedRow(), 0).toString();
                int id = Integer.parseInt(idText);
                editButtonActionPerformed(evt, id);
            }
        });

        deleteButton.setBackground(new java.awt.Color(234, 220, 166));
        deleteButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        deleteButton.setText("Excluir");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
                String idText = tbl.getValueAt(jTable1.getSelectedRow(), 0).toString();
                int id = Integer.parseInt(idText);
                deleteButtonActionPerformed(evt, id);
            }
        });

        resetButton.setBackground(new java.awt.Color(234, 220, 166));
        resetButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(234, 220, 166));
        backButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        backButton.setText("Voltar");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel6.setText("Senha:");

        jComboBox1.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Gerente", "Padeiro", "Caixa"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel7.setText("Cargo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(backButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(jLabel7))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(resetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                                                                        .addComponent(editButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
                                                                .addGap(26, 26, 26)))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6)
                                                .addGap(12, 12, 12)
                                                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7))
                                                .addGap(32, 32, 32)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addButton)
                                                        .addComponent(editButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(resetButton)
                                                        .addComponent(deleteButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(backButton)))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                                            
}
