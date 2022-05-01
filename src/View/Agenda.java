/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author nunes
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloAgenda = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        Cliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        Servico = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Valor = new javax.swing.JLabel();
        IntValor = new javax.swing.JComboBox<>();
        Data = new javax.swing.JLabel();
        DatData = new javax.swing.JTextField();
        Hora = new javax.swing.JLabel();
        DatHora = new javax.swing.JTextField();
        lblObservacao = new javax.swing.JLabel();
        txtPbservacao = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        imgFundo = new javax.swing.JLabel();
        imgArea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloAgenda.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TituloAgenda.setForeground(new java.awt.Color(255, 255, 255));
        TituloAgenda.setText("Agenda");
        getContentPane().add(TituloAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        codigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        codigo.setForeground(new java.awt.Color(255, 255, 255));
        codigo.setText("Código");
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        txtIdCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 190, -1));

        Cliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cliente.setForeground(new java.awt.Color(255, 255, 255));
        Cliente.setText("Cliente");
        getContentPane().add(Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        txtNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 190, -1));

        Servico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Servico.setForeground(new java.awt.Color(255, 255, 255));
        Servico.setText("Serviço");
        getContentPane().add(Servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 190, -1));

        Valor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Valor.setForeground(new java.awt.Color(255, 255, 255));
        Valor.setText("Valor R$");
        getContentPane().add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        IntValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IntValor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(IntValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 190, -1));

        Data.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Data.setForeground(new java.awt.Color(255, 255, 255));
        Data.setText("Data");
        getContentPane().add(Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        DatData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(DatData, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 190, -1));

        Hora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Hora.setForeground(new java.awt.Color(255, 255, 255));
        Hora.setText("Hora");
        getContentPane().add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        DatHora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(DatHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 190, -1));

        lblObservacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblObservacao.setForeground(new java.awt.Color(255, 255, 255));
        lblObservacao.setText("Observação");
        getContentPane().add(lblObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        txtPbservacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        txtPbservacao.setViewportView(jTextArea1);

        getContentPane().add(txtPbservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 290, 150));

        jButton1.setBackground(new java.awt.Color(133, 63, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agendar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 290, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 750, 160));

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/areaAgenda.png"))); // NOI18N
        getContentPane().add(imgFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        imgArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/login.jpg"))); // NOI18N
        getContentPane().add(imgArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cliente;
    private javax.swing.JTextField DatData;
    private javax.swing.JTextField DatHora;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Hora;
    private javax.swing.JComboBox<String> IntValor;
    private javax.swing.JLabel Servico;
    private javax.swing.JLabel TituloAgenda;
    private javax.swing.JLabel Valor;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel imgArea;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JScrollPane txtPbservacao;
    // End of variables declaration//GEN-END:variables
}