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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
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
import ufjf.dcc025.trabalhooo.controller.ProdutoController;
import ufjf.dcc025.trabalhooo.controller.ButtonFunction;
import ufjf.dcc025.trabalhooo.model.Usuario;
import ufjf.dcc025.trabalhooo.model.Produto;

/**
 *
 * @author arthu
 */
public class TelacCrudProduto extends JFrame implements ButtonFunction {

    private JButton addButton;
    private JButton backButton;
    private JButton deleteButton;
    private JButton editButton;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JLabel nameLabel;
    private JLabel priceLabel;
    private JLabel quantLabel;
    private JButton resetButton;
    private JTextField tfName;
    private JTextField tfPrice;
    private JTextField tfQuant;
    private static List<Produto> produto = new ArrayList<>();

    public TelacCrudProduto() {
        initComponents();
        produto = Produto.getProdutos();
    }
    private void jTable1MouseClicked(MouseEvent evt){
       DefaultTableModel tbl = (DefaultTableModel)jTable1.getModel();
       String tblname = tbl.getValueAt(jTable1.getSelectedRow(),1).toString();
       String tblprice = tbl.getValueAt(jTable1.getSelectedRow(),3 ).toString();
       String tblqtd = tbl.getValueAt(jTable1.getSelectedRow(), 2).toString();
       
       tfName.setText(tblname);
       tfPrice.setText(tblprice);
       tfQuant.setText(tblqtd);
       
       
    }


    @Override
    public void editButtonActionPerformed(java.awt.event.ActionEvent evt, int id) {
        DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
        ProdutoController edit  = new ProdutoController();
        Produto editado;
        editado = edit.update(tfName.getText(), tfQuant.getText(), tfPrice.getText(), id);
        
        tblmodel.setValueAt(editado.getNome(),jTable1.getSelectedRow() , 1);
        tblmodel.setValueAt(editado.getQuantidade(), jTable1.getSelectedRow(), 2);
        tblmodel.setValueAt(editado.getPreco(), jTable1.getSelectedRow(), 3);
        
    }
    @Override
    public void deleteButtonActionPerformed(java.awt.event.ActionEvent evt, int id) {
        ProdutoController produto = new ProdutoController();
        int option = JOptionPane.showConfirmDialog(null,"Excluindo Produto", "Confirmar Exclusão?", JOptionPane.YES_NO_OPTION);
        if(option == 0){
        produto.delete(id);
        DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
        tblmodel.removeRow(jTable1.getSelectedRow());
        }
        else{
            
        }
        
    }

    @Override
    public void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ProdutoController prod = new ProdutoController();
        Produto created;
        created = prod.create(tfName.getText(), tfQuant.getText(), tfPrice.getText());
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{created.getId(), created.getNome(), created.getQuantidade(), created.getPreco()});
        
    }

    public void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        tfName.setText("");
        tfPrice.setText("");
        tfQuant.setText("");
    }

    public void montaTela() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelacCrudProduto().setVisible(true);
            }
        });
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

    private void initComponents() {

        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        nameLabel = new JLabel();
        tfName = new JTextField();
        quantLabel = new JLabel();
        tfPrice = new JTextField();
        priceLabel = new JLabel();
        jLabel4 = new JLabel();
        addButton = new JButton();
        editButton = new JButton();
        deleteButton = new JButton();
        resetButton = new JButton();
        backButton = new JButton();
        tfQuant = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(226, 194, 117));

        jTable1.setFont(new Font("Lucida Bright", 0, 12)); // NOI18N
        jTable1.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Id", "Nome", "Quantidade", "Preço"
                }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });

        for (Produto p : produto) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{p.getId(), p.getNome(), p.getQuantidade(), p.getPreco()});
        }
        jScrollPane1.setViewportView(jTable1);

        nameLabel.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        nameLabel.setText("Nome:");

        quantLabel.setText("Quantidade");

        priceLabel.setText("Preço");

        jLabel4.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel4.setText("Cadastro de Produtos");

        addButton.setBackground(new Color(234, 220, 166));
        addButton.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        addButton.setText("Cadastrar");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new Color(234, 220, 166));
        editButton.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        editButton.setText("Editar");
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DefaultTableModel tbl = (DefaultTableModel)jTable1.getModel();
                String idText =tbl. getValueAt(jTable1.getSelectedRow(), 0).toString();
                int id  = Integer.parseInt(idText);
                editButtonActionPerformed(evt, id);
            }
        });

        deleteButton.setBackground(new Color(234, 220, 166));
        deleteButton.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        deleteButton.setText("Excluir");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               DefaultTableModel tbl = (DefaultTableModel)jTable1.getModel();
                String idText =tbl. getValueAt(jTable1.getSelectedRow(), 0).toString();
                int id  = Integer.parseInt(idText);
                deleteButtonActionPerformed(evt, id);
            }
        });

        resetButton.setBackground(new Color(234, 220, 166));
        resetButton.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        resetButton.setText("Resetar");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new Color(234, 220, 166));
        backButton.setFont(new Font("Lucida Bright", 1, 12)); // NOI18N
        backButton.setText("Voltar");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

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
                                                                .addGap(6, 6, 6)
                                                                .addComponent(quantLabel, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(tfName, GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tfPrice, GroupLayout.Alignment.LEADING)
                                                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(priceLabel, GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(nameLabel, GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel4, GroupLayout.Alignment.LEADING))
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(addButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(deleteButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(resetButton, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                                                                        .addComponent(editButton, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                                                                        .addComponent(tfQuant, GroupLayout.Alignment.LEADING))
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
                                                .addComponent(nameLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(quantLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tfQuant, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)
                                                .addComponent(priceLabel)
                                                .addGap(5, 5, 5)
                                                .addComponent(tfPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(104, 104, 104)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addButton)
                                                        .addComponent(editButton))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
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
    }// </editor-fold>         
}
