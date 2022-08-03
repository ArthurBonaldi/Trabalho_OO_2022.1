
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import ufjf.dcc025.trabalhooo.controller.ButtonFunction;
import ufjf.dcc025.trabalhooo.controller.UsuarioController;
import ufjf.dcc025.trabalhooo.model.Usuario;
import ufjf.dcc025.trabalhooo.util.Arquivo;
import ufjf.dcc025.trabalhooo.util.JsonUsuario;

/**
 *
 * @author arthu
 */
public class TelaCrudFuncionarios extends JFrame implements ButtonFunction {

    private JButton addButton;
    private JButton backButton;
    private JButton deleteButton;
    private JButton editButton;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JButton resetButton;
    private JTextField tfEmail;
    private JTextField tfName;
    private JTextField tfPassword;
    private static List<Usuario> usuarios = new ArrayList<>();

    public TelaCrudFuncionarios() {
        usuarios = Usuario.getUsuarios();
        initComponents();
    }

   
    public void montaTela() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCrudFuncionarios().setVisible(true);
            }
        });
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel1 = new JLabel();
        tfName = new JTextField();
        jLabel2 = new JLabel();
        tfEmail = new JTextField();
        jLabel4 = new JLabel();
        addButton = new JButton();
        editButton = new JButton();
        deleteButton = new JButton();
        resetButton = new JButton();
        backButton = new JButton();
        jLabel6 = new JLabel();
        tfPassword = new JTextField();
        jComboBox1 = new JComboBox<>();
        jLabel7 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 194, 117));

        jTable1.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jTable1.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Id", "Nome", "Email", "Cargo"
                }
        ));
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
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
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
                String idText = tbl.getValueAt(jTable1.getSelectedRow(), 0).toString();
                int id = Integer.parseInt(idText);
                editButtonActionPerformed(evt, id);
            }
        });

        deleteButton.setBackground(new java.awt.Color(234, 220, 166));
        deleteButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        deleteButton.setText("Excluir");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
                String idText = tbl.getValueAt(jTable1.getSelectedRow(), 0).toString();
                int id = Integer.parseInt(idText);
                deleteButtonActionPerformed(evt, id);
            }
        });

        resetButton.setBackground(new java.awt.Color(234, 220, 166));
        resetButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(234, 220, 166));
        backButton.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        backButton.setText("Voltar");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel6.setText("Senha:");

        jComboBox1.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{"Gerente", "Padeiro", "Caixa"}));
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel7.setText("Cargo:");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(backButton)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(tfPassword, GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tfName, GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tfEmail, GroupLayout.Alignment.LEADING)
                                                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel1, GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel4, GroupLayout.Alignment.LEADING))
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(addButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(deleteButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(jLabel7))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jComboBox1, GroupLayout.Alignment.TRAILING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(resetButton, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                                                                        .addComponent(editButton, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
                                                                .addGap(26, 26, 26)))))
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 471, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6)
                                                .addGap(12, 12, 12)
                                                .addComponent(tfPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7))
                                                .addGap(32, 32, 32)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addButton)
                                                        .addComponent(editButton))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(resetButton)
                                                        .addComponent(deleteButton))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(backButton)))
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
     @Override
    public void backButtonActionPerformed(ActionEvent evt) {
        String arqUser = JsonUsuario.toJSON(Usuario.getUsuarios());
        Arquivo.escreverArquivo("funcionarios.json", arqUser);
        
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
    public void resetButtonActionPerformed(ActionEvent evt) {
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
    public void deleteButtonActionPerformed(ActionEvent evt, int id) {
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
    public void addButtonActionPerformed(ActionEvent evt) {
        UsuarioController user = new UsuarioController();
        Usuario created;
        created = user.create(tfName.getText(), tfEmail.getText(), tfPassword.getText(), jComboBox1.getSelectedItem().toString());
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{created.getId(), created.getNome(), created.getEmail(), created.getCargo()});

    }

}
