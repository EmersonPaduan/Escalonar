/*
 * formSobre.java
 *
 * Created on 09/12/2010
 */

package br.pro.paduan.forms;

/**
 * @author Emerson dos Santos Paduan
 * @since 09/12/2010
 */
public class formAbout extends javax.swing.JDialog {

        /* Creates new form formSobre */
        public formAbout(java.awt.Frame parent, boolean modal) {
                super(parent, modal);
                initComponents();
        }

        /*
         * This method is called from within the constructor to
         * initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                btnOK = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("br.pro.paduan.forms.Principal"); // NOI18N
                setTitle(bundle.getString("SOBRE")); // NOI18N
                setAlwaysOnTop(true);
                setResizable(false);
                setUndecorated(true);

                jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

                jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText(bundle.getString("ESCALONAR")); // NOI18N

                jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12));
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel4.setText(bundle.getString(
                                "<HTML><CENTER>ESTE PROGRAMA FOI DESENVOLVIDO PARA APOIAR O ENSINO DE ALGORITMOS DE ESCALONAMENTO NA DISCIPLINA DE SISTEMAS OPERACIONAIS.<BR>SE VOCÊ ENCONTRAR ERROS DE EXECUÇÃO, POR FAVOR ENVIE UM E-MAIL DESCREVENDO O ERRO ENCONTRADO E OS DADOS DE ENTRADA PARA QUE O ERRO SEJA ANALISADO E CORRIGIDO.</HTML>")); // NOI18N
                jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
                jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
                jLabel2.setText(bundle.getString("EMERSON DOS SANTOS PADUAN")); // NOI18N

                jLabel3.setText(bundle.getString("EMERSON.PADUAN@GMAIL.COM")); // NOI18N

                btnOK.setText(bundle.getString("OK")); // NOI18N
                btnOK.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnOKActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.CENTER)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                172,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                345,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(btnOK,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                56,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap()));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                39,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                112,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                21,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnOK)
                                                                .addContainerGap()));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(293, 293, 293)));

                java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
                setBounds((screenSize.width - 369) / 2, (screenSize.height - 286) / 2, 369, 286);
        }// </editor-fold>//GEN-END:initComponents

        private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnOKActionPerformed
                this.dispose();
        }// GEN-LAST:event_btnOKActionPerformed

        /*
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                                formAbout dialog = new formAbout(new javax.swing.JFrame(), true);
                                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                                        @Override
                                        public void windowClosing(java.awt.event.WindowEvent e) {
                                                System.exit(0);
                                        }
                                });
                                dialog.setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnOK;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        // End of variables declaration//GEN-END:variables

}
