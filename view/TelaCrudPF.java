/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.view;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JButton;
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
import ufjf.dcc025.trabalhooo.controller.FormatDate;
import ufjf.dcc025.trabalhooo.controller.PFController;
import ufjf.dcc025.trabalhooo.model.PF;
import ufjf.dcc025.trabalhooo.util.Arquivo;
import ufjf.dcc025.trabalhooo.util.JsonPF;


/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class TelaCrudPF extends JFrame implements FormatDate, ButtonFunction {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JDateChooser jDateChooser1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private static List<PF> pf = new ArrayList<>();

    public TelaCrudPF() {
        pf = PF.getPFs();
        initComponents();
    }

    public void montaTela() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCrudPF().setVisible(true);
            }
        });
    }

    

    private void initComponents() {

        
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel1 = new JLabel();
        jTextField1 = new JTextField();
        jLabel2 = new JLabel();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser(new Date(), "dd/MM/yyyy");
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(226, 194, 117));

        jTable1.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "id", "Nome", "Email", "CPF", "Data de Nascimento"
                }
        ));
        for(PF p: pf){
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{p.getId(), p.getNome(), p.getEmail(), p.getRegistro(), p.getDate()});
        }
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Nome:");

        jLabel2.setText("Email:");

        jLabel3.setText("CPF:");

        jLabel4.setFont(new Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Cadastro PF");

        jLabel5.setText("Data de Nascimento:");

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
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                                .addGap(70, 70, 70))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(20, 20, 20))
                                                        .addComponent(jTextField1)
                                                        .addComponent(jTextField2)
                                                        .addComponent(jTextField3)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel5, GroupLayout.Alignment.TRAILING))
                                                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(jButton5))
                                                                        .addComponent(jLabel1))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jDateChooser1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 471, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addGap(4, 4, 4)
                                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3)
                                                .addGap(5, 5, 5)
                                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDateChooser1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton1)
                                                        .addComponent(jButton2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton4)
                                                        .addComponent(jButton3))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                                .addComponent(jButton5))
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
    public void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextField3.getText().length() == 11) {
            Date data = jDateChooser1.getDate();
            String strDate = DateFormat.getDateInstance().format(data);
            strDate = formataData(strDate);
            PFController pf = new PFController();
            PF created = new PF();
            created = pf.create(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), strDate);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{created.getId(), created.getNome(), created.getEmail(), created.getRegistro(), created.getDate()});
        } else {
            JOptionPane.showMessageDialog(null, "Formato de registro inválido");
        }

    }

    @Override
    public void editButtonActionPerformed(ActionEvent evt, int id) {
        if (jTextField3.getText().length() == 11) {
            Date data = jDateChooser1.getDate();
            String strDate = DateFormat.getDateInstance().format(data);
            strDate = formataData(strDate);
            PFController pf = new PFController();
            PF edited = new PF();
          
            edited = pf.update(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), strDate, id);
            DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
            
            tblmodel.setValueAt(edited.getNome(), jTable1.getSelectedRow(), 1);
            tblmodel.setValueAt(edited.getEmail(), jTable1.getSelectedRow(), 2);
            tblmodel.setValueAt(edited.getRegistro(), jTable1.getSelectedRow(), 3);
            tblmodel.setValueAt(edited.getDate(), jTable1.getSelectedRow(), 4);
        } else {
            JOptionPane.showMessageDialog(null, "Formato de registro inválido");
        }
    }

    @Override
    public void deleteButtonActionPerformed(ActionEvent evt, int id) {
        PFController pf = new PFController();
        int option = JOptionPane.showConfirmDialog(null, "Excluindo Cliente PF", "Confirmar Exclusão?", JOptionPane.YES_NO_OPTION);
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
        String arqUser = JsonPF.toJSON(PF.getPFs());
        Arquivo.escreverArquivo("pfs.json", arqUser);
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

    @Override
    public String formataData(String d) {
        String[] sub;
        sub = d.split(" ");
        switch (sub[2]) {
            case "jan":
                sub[2] = "01";
                break;
            case "feb":
                sub[2] = "02";
                break;
            case "mar":
                sub[2] = "03";
                break;
            case "abr":
                sub[2] = "04";
                break;
            case "mai":
                sub[2] = "05";
                break;
            case "jun":
                sub[2] = "06";
                break;
            case "jul":
                sub[2] = "07";
                break;
            case "ago":
                sub[2] = "08";
                break;
            case "set":
                sub[2] = "09";
                break;
            case "out":
                sub[2] = "10";
                break;
            case "nov":
                sub[2] = "11";
                break;
            case "dez":
                sub[2] = "12";
                break;
        }
        d = sub[0] + "/" + sub[2] + "/" + sub[4];
        return d;
    }

}
