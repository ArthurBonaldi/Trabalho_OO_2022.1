/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.view;

import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ufjf.dcc025.trabalhooo.controller.FormatDate;
import ufjf.dcc025.trabalhooo.controller.MaquinaController;
import ufjf.dcc025.trabalhooo.model.Maquina;
import ufjf.dcc025.trabalhooo.model.Usuario;

/**
 *
 * @author arthu
 */
public class TelaCrudMaquina extends JFrame implements FormatDate {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private List<Maquina> maquinas = new ArrayList<>();

    public TelaCrudMaquina() {
        maquinas = Maquina.getMaquinas();
        initComponents();
    }

    public void montaTela() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCrudMaquina().setVisible(true);
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
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser(new Date(), "dd/MM/yyyy");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(226, 194, 117));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Id", "Nome", "Peso", "Manutenção"
                }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Nome ");

        jLabel2.setText("Peso:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Cadastro de Máquinas");

        jButton1.setBackground(new java.awt.Color(234, 220, 166));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(234, 220, 166));
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
                String idText = tbl.getValueAt(jTable1.getSelectedRow(), 0).toString();
                int id = Integer.parseInt(idText);
                jButton2ActionPerformed(evt, id);
            }
        });

        jButton3.setBackground(new java.awt.Color(234, 220, 166));
        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
                String idText = tbl.getValueAt(jTable1.getSelectedRow(), 0).toString();
                int id = Integer.parseInt(idText);
                jButton3ActionPerformed(evt, id);
            }
        });

        jButton4.setBackground(new java.awt.Color(234, 220, 166));
        jButton4.setText("Resetar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(234, 220, 166));
        jButton5.setText("Voltar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Data de Manutenção:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                                                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
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
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2)
                                                .addGap(4, 4, 4)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(85, 85, 85)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton1)
                                                        .addComponent(jButton2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton4)
                                                        .addComponent(jButton3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5)))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Date data = jDateChooser1.getDate();
        String strDate = DateFormat.getDateInstance().format(data);
        strDate = formataData(strDate);
        MaquinaController maquina = new MaquinaController();
        Maquina created = new Maquina();
        created = maquina.create(jTextField1.getText(), jTextField2.getText(), strDate);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{created.getId(), created.getNome(), created.getPeso(), created.getDataDeManutencao()});
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt, int id) {
        Date data = jDateChooser1.getDate();
        String strDate = DateFormat.getDateInstance().format(data);
        strDate = formataData(strDate);
        DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
        MaquinaController edit = new MaquinaController();
        Maquina editado;
        editado = edit.update(jTextField1.getText(), jTextField2.getText(), strDate, id);

        tblmodel.setValueAt(editado.getNome(), jTable1.getSelectedRow(), 1);
        tblmodel.setValueAt(editado.getPeso(), jTable1.getSelectedRow(), 2);
        tblmodel.setValueAt(editado.getDataDeManutencao(), jTable1.getSelectedRow(), 3);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt, int id) {
        MaquinaController maquina = new MaquinaController();
        int option = JOptionPane.showConfirmDialog(null,"Excluindo Produto", "Confirmar Exclusão?", JOptionPane.YES_NO_OPTION);
        if(option == 0){
        maquina.delete(id);
        DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
        tblmodel.removeRow(jTable1.getSelectedRow());
        }
        else{
            
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("");
        jTextField2.setText("");
    }

    private void jTable1MouseClicked(MouseEvent evt) {
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        String tblname = tbl.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblpeso = tbl.getValueAt(jTable1.getSelectedRow(), 2).toString();

        jTextField1.setText(tblname);
        jTextField2.setText(tblpeso);

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
