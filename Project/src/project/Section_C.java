
package project;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Section_C extends javax.swing.JFrame {
    Section_C pm;
PreparedStatement ps;
ResultSet rs;
Connection conn;

    /**
     * Creates new form Section_C
     */
    public Section_C() {
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

        Csearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        CCourse = new javax.swing.JTextField();
        Section = new javax.swing.JLabel();
        StudentID = new javax.swing.JLabel();
        CcmbStat = new javax.swing.JComboBox<>();
        CstudentID = new javax.swing.JTextField();
        Csave = new javax.swing.JButton();
        StudentName = new javax.swing.JLabel();
        Cexit = new javax.swing.JButton();
        CSection = new javax.swing.JTextField();
        CName = new javax.swing.JTextField();
        Date = new javax.swing.JLabel();
        btnSearchC = new javax.swing.JButton();
        CDate = new javax.swing.JTextField();
        Course = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(75, 119, 190));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SECTION C");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(153, 153, 153))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        Status.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Status.setText("Status");

        CCourse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Section.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Section.setText("Section:");

        StudentID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        StudentID.setText("Student ID:");

        CcmbStat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Late", "Absent ", "Excuse", " " }));

        CstudentID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Csave.setText("Save");
        Csave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CsaveActionPerformed(evt);
            }
        });

        StudentName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        StudentName.setText("Student Name:");

        Cexit.setText("Exit");
        Cexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CexitActionPerformed(evt);
            }
        });

        CSection.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSectionActionPerformed(evt);
            }
        });

        CName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Date.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Date.setText("Date:");

        btnSearchC.setText("Search");
        btnSearchC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCActionPerformed(evt);
            }
        });

        CDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDateActionPerformed(evt);
            }
        });

        Course.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Course.setText("Course:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Csave, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Cexit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Csearch, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSearchC))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(StudentName))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Status)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Section)
                                                .addComponent(Course)
                                                .addComponent(Date)))
                                        .addComponent(StudentID, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CcmbStat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CstudentID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CSection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchC)
                    .addComponent(Csearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentID)
                    .addComponent(CstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentName)
                    .addComponent(CName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course)
                    .addComponent(CCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Section)
                    .addComponent(CSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date)
                    .addComponent(CDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Status)
                    .addComponent(CcmbStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cexit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Csave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CsaveActionPerformed

        String student = CstudentID.getText();
        String name= CName.getText();
        String course = CCourse.getText();
        String section = CSection.getText();
        String date= CDate.getText();
        String status =CcmbStat.getSelectedItem().toString();
        try{
            conn=Connectionr.getConnection();
            ps=conn.prepareStatement("insert into SECTION_C (ID, NAME, COURSE, SECTION, DATE, STATUS)values (?,?,?,?,?,?)");

            ps.setString(1,student);
            ps.setString(2,name);
            ps.setString(3,course);
            ps.setString(4,section);
            ps.setString(5,date);
            ps.setString(6,status);
            int ok = JOptionPane.showConfirmDialog(this, "Confirm to Save", "Are you sure..", JOptionPane.YES_NO_OPTION);
            if (ok==0){
                ps.execute();
                JOptionPane.showMessageDialog(this,"Successful", "DONE", 1);
            }
        }catch (Exception ex) {
            System.out.println(""+ex);
        }
    }//GEN-LAST:event_CsaveActionPerformed

    private void CexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CexitActionPerformed
        new Sections().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CexitActionPerformed

    private void CSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSectionActionPerformed

    }//GEN-LAST:event_CSectionActionPerformed

    private void btnSearchCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCActionPerformed
        try{

            String sql;
            sql = "select * from SECTION_A where NAME = ?";

            ps=conn.prepareStatement(sql);
            ps.setString(1 , Csearch.getText());

            rs=ps.executeQuery();
            if(rs.next()){
                String add1=rs.getString("ID");
                CstudentID.setText(add1);
                String add2=rs.getString("NAME");
                CName.setText(add2);
                String add3=rs.getString("COURSE");
                CCourse.setText(add3);
                String add4=rs.getString("SECTION");
                CSection.setText(add4);

            }
            else{ JOptionPane.showMessageDialog(this,"NO MATCH DATA","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnSearchCActionPerformed

    private void CDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CDateActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Section_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Section_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Section_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Section_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Section_C().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCourse;
    private javax.swing.JTextField CDate;
    private javax.swing.JTextField CName;
    private javax.swing.JTextField CSection;
    private javax.swing.JComboBox<String> CcmbStat;
    private javax.swing.JButton Cexit;
    private javax.swing.JLabel Course;
    private javax.swing.JButton Csave;
    private javax.swing.JTextField Csearch;
    private javax.swing.JTextField CstudentID;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Section;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel StudentID;
    private javax.swing.JLabel StudentName;
    private javax.swing.JButton btnSearchC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
