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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import ufjf.dcc025.trabalhooo.controller.ButtonFunction;
import ufjf.dcc025.trabalhooo.controller.PJController;
import ufjf.dcc025.trabalhooo.model.PJ;
import ufjf.dcc025.trabalhooo.util.Arquivo;
import ufjf.dcc025.trabalhooo.util.JsonPJ;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class TelaCrudPJ extends JFrame implements ButtonFunction {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private static List<PJ> pjs = new ArrayList<>();

    public TelaCrudPJ() {
        pjs = PJ.getPJs();
        initComponents();
    }

    public void montaTela() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCrudPJ().setVisible(true);
            }
        });
    }
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(226, 194, 117));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "id", "Razão Social", "Email", "CNPJ"
                }
        ));
        for (PJ p : pjs) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{p.getId(), p.getNome(), p.getEmail(), p.getRegistro()});
        }
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Razão Social: ");

        jLabel2.setText("Email:");

        jLabel3.setText("CNPJ");

        jLabel4.setFont(new Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Cadastro PJ");

        jButton1.setBackground(new Color(234, 220, 166));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new Color(234, 220, 166));
        jButton2.setText("Editar");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
                String idText = tbl.getValueAt(jTable1.getSelectedRow(), 0).toString();
                int id = Integer.parseInt(idText);
                editButtonActionPerformed(evt, id);
            }
        });

        jButton3.setBackground(new Color(234, 220, 166));
        jButton3.setText("Excluir");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
                String idText = tbl.getValueAt(jTable1.getSelectedRow(), 0).toString();
                int id = Integer.parseInt(idText);
                deleteButtonActionPerformed(evt, id);
            }
        });

        jButton4.setBackground(new Color(234, 220, 166));
        jButton4.setText("Resetar");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jButton5.setBackground(new Color(234, 220, 166));
        jButton5.setText("Voltar");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(70, 70, 70))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(20, 20, 20))
                                                        .addComponent(jTextField1)
                                                        .addComponent(jTextField2)
                                                        .addComponent(jTextField3)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(jButton5))
                                                                        .addComponent(jLabel1))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addGap(4, 4, 4)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3)
                                                .addGap(5, 5, 5)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton1)
                                                        .addComponent(jButton2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton4)
                                                        .addComponent(jButton3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                                .addComponent(jButton5))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
        this.setSize(790,400);
    }
    
    
     @Override
    public void addButtonActionPerformed(ActionEvent evt) {
        if (jTextField3.getText().length() == 14) {
            PJController pj = new PJController();
            PJ created = new PJ();
            created = pj.create(jTextField1.getText(), jTextField2.getText(), jTextField3.getText());
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{created.getId(), created.getNome(), created.getEmail(), created.getRegistro(), ""});
        } else {
            JOptionPane.showMessageDialog(null, "Formato de registro inválido");
        }

    }

    @Override
    public void editButtonActionPerformed(ActionEvent evt, int id) {
        if (jTextField3.getText().length() == 14) {
            PJController pj = new PJController();
            PJ edited = new PJ();
            edited = pj.update(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), id);
            DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
            tblmodel.setValueAt(edited.getNome(), jTable1.getSelectedRow(), 1);
            tblmodel.setValueAt(edited.getEmail(), jTable1.getSelectedRow(), 2);
            tblmodel.setValueAt(edited.getRegistro(), jTable1.getSelectedRow(), 3);
        } else {
            JOptionPane.showMessageDialog(null, "Formato de registro inválido");
        }
    }

    @Override
    public void deleteButtonActionPerformed(ActionEvent evt, int id) {
        PJController pf = new PJController();
        int option = JOptionPane.showConfirmDialog(null, "Excluindo Cliente PJ", "Confirmar Exclusão?", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            pf.delete(id);
            DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
            tblmodel.removeRow(jTable1.getSelectedRow());
        }
    }

    @Override
    public void resetButtonActionPerformed(ActionEvent evt) {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }

    @Override
    public void backButtonActionPerformed(ActionEvent evt) {
        String arqUser = JsonPJ.toJSON(PJ.getPJs());
        Arquivo.escreverArquivo("pjs.json", arqUser);
        TelaEscolheCliente cliente = new TelaEscolheCliente();
        this.dispose();
        cliente.montaTela();
    }

    private void jTable1MouseClicked(MouseEvent evt) {
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        String tblname = tbl.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblEmail = tbl.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tblReg = tbl.getValueAt(jTable1.getSelectedRow(), 3).toString();
        jTextField1.setText(tblname);
        jTextField2.setText(tblEmail);
        jTextField3.setText(tblReg);
    }
}
