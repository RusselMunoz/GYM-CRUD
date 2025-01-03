
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class NewMember extends javax.swing.JFrame {
    //ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("Gym.png")); //---if turn into jar file.setIconImage(logo.getImage()); 
    /**
     * Creates new form NewMember
     */
    public NewMember() {
        initComponents();
        //setIconImage(logo.getImage());
        setTitle("New Member");
    }
    
    public void loadData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/gym";
            String user = "root";
            String pass = "";
        
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            String sql = "SELECT * FROM member";
            ResultSet rs = st.executeQuery(sql);
            
            String i, n, m, a, s, em, eb, p, am, dp, dn, tn, tt;
            
            while(rs.next()){
                i = rs.getString("id");
                n = rs.getString("name");
                m = rs.getString("mobile_number");
                a = rs.getString("age");
                s = rs.getString("sex");
                em = rs.getString("emergency_contact_name");
                eb = rs.getString("emergency_contact_number");
                p = rs.getString("plan");
            }
        }catch(Exception e){
        System.out.println("Error " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        UpdateDelete = new javax.swing.JButton();
        NewMember = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Logs = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        new_member = new javax.swing.JLabel();
        name_Text = new javax.swing.JLabel();
        name_Label = new javax.swing.JTextField();
        mobilenumber_Text = new javax.swing.JLabel();
        mobile_numberLabel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ageLabel = new javax.swing.JTextField();
        sex_Text = new javax.swing.JLabel();
        emergencycontactName_Text = new javax.swing.JLabel();
        contactname_Label = new javax.swing.JTextField();
        sexComboBox = new javax.swing.JComboBox<>();
        emergencycontactNumber_Text = new javax.swing.JLabel();
        contactnumber_Label = new javax.swing.JTextField();
        plan_Text = new javax.swing.JLabel();
        planComboBox = new javax.swing.JComboBox<>();
        addMember = new javax.swing.JButton();
        clearAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new Color(98, 39, 24));

        UpdateDelete.setBackground(new Color(96, 81, 41));
        UpdateDelete.setForeground(new java.awt.Color(255, 255, 255));
        UpdateDelete.setText("Update/Delete");
        UpdateDelete.setBorder(null);
        UpdateDelete.setContentAreaFilled(false);
        UpdateDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDeleteActionPerformed(evt);
            }
        });

        NewMember.setBackground(new Color(96, 81, 41));
        NewMember.setForeground(new java.awt.Color(255, 255, 255));
        NewMember.setText("New Member");
        NewMember.setBorder(null);
        NewMember.setContentAreaFilled(false);
        NewMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewMemberActionPerformed(evt);
            }
        });

        Profile.setBackground(new Color(96, 81, 41));
        Profile.setForeground(new java.awt.Color(255, 255, 255));
        Profile.setText("Profiles");
        Profile.setBorder(null);
        Profile.setContentAreaFilled(false);
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });

        jButton5.setBackground(new Color(96, 81, 41));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Plans");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new Color(96, 81, 41));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Payments");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Logs.setBackground(new Color(96, 81, 41));
        Logs.setForeground(new java.awt.Color(255, 255, 255));
        Logs.setText("Logs");
        Logs.setBorder(null);
        Logs.setContentAreaFilled(false);
        Logs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(NewMember)
                .addGap(18, 18, 18)
                .addComponent(UpdateDelete)
                .addGap(18, 18, 18)
                .addComponent(Profile)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logs, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(UpdateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(NewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Logs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new Color(210, 97, 69));

        new_member.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        new_member.setText("New Member");

        name_Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name_Text.setText("Name");

        name_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_LabelActionPerformed(evt);
            }
        });

        mobilenumber_Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mobilenumber_Text.setText("Mobile Number");

        mobile_numberLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_numberLabelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Age");

        sex_Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sex_Text.setText("Sex");

        emergencycontactName_Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emergencycontactName_Text.setText("Emergency Contact Name");

        sexComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Male", "Female" }));
        sexComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexComboBoxActionPerformed(evt);
            }
        });

        emergencycontactNumber_Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emergencycontactNumber_Text.setText("Emergency Contact Number");

        plan_Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        plan_Text.setText("Plan");

        planComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Daily", "Half Month", "Monthly" }));
        planComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planComboBoxActionPerformed(evt);
            }
        });

        addMember.setText("Add Member");
        addMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberActionPerformed(evt);
            }
        });

        clearAll.setText("Clear All");
        clearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(new_member)
                .addGap(89, 89, 89))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobilenumber_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile_numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sex_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactname_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emergencycontactName_Text)
                    .addComponent(emergencycontactNumber_Text)
                    .addComponent(contactnumber_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plan_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(addMember, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(clearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(new_member, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emergencycontactName_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactname_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobilenumber_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emergencycontactNumber_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile_numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactnumber_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plan_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(sex_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addMember, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
        gymPayment x = new gymPayment();
                x.setVisible(true);
                x.loadData();
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void UpdateDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDeleteActionPerformed
        dispose();
        updateMember x = new updateMember();
                x.setVisible(true);
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_UpdateDeleteActionPerformed

    private void NewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewMemberActionPerformed

    private void sexComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexComboBoxActionPerformed

    private void planComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planComboBoxActionPerformed

    private void clearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllActionPerformed
        name_Label.setText("");
        mobile_numberLabel.setText("");
        ageLabel.setText("");
        contactname_Label.setText("");
        contactnumber_Label.setText("");
        sexComboBox.setSelectedItem(" ");
        planComboBox.setSelectedItem(" ");
    }//GEN-LAST:event_clearAllActionPerformed

    private void addMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberActionPerformed
        String nE, mR, aE, sX, eE, eR, pN, query, query2, query3, dP, dE, aM;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/gym";
            String user = "root";
            String pass = "";
        
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            if("".equals(name_Label.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Name is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(mobile_numberLabel.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Mobile Number is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(ageLabel.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Age is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            }else if(" ".equals(sexComboBox.getSelectedItem())){
                JOptionPane.showMessageDialog(new JFrame(), "Select the following choices below", "Dialog", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(contactname_Label.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Name is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(contactnumber_Label.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Number is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            }else if(" ".equals(planComboBox.getSelectedItem())){
                JOptionPane.showMessageDialog(new JFrame(), "Select the following choices below", "Dialog", JOptionPane.ERROR_MESSAGE);
            }else{
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDateTime startDateTime = LocalDateTime.now();
                Duration duration = Duration.ofDays(30);
                Duration duration2 = Duration.ofDays(15);
                LocalDateTime expirationDateTime = startDateTime.plus(duration);
                LocalDateTime expirationDateTime2 = startDateTime.plus(duration2);
                String formattedExpirationDateTime = expirationDateTime.format(formatter);
                String formattedExpirationDateTime2 = expirationDateTime2.format(formatter);
                
                nE = name_Label.getText();
                mR = mobile_numberLabel.getText();
                aE = ageLabel.getText();
                sX = (String) sexComboBox.getSelectedItem();
                eE = contactname_Label.getText();
                eR = contactnumber_Label.getText();
                pN = (String) planComboBox.getSelectedItem();
                
                query = "INSERT INTO member (name, mobile_number, age, sex, emergency_contact_name, emergency_contact_number, plan) " + "VALUES ('"+nE+"', '"+mR+"', '"+aE+"', '"+sX+"', '"+eE+"', '"+eR+"', '"+pN+"')";
                st.executeUpdate(query);
                
                LocalDateTime now = LocalDateTime.now();
                String formattedDateTime = now.format(formatter);
                
                if("Daily".equals(pN)){
                    aM = String.valueOf(70);
                    dP = formattedDateTime;
                    dE = formattedDateTime;
                    
                    query2 = "INSERT INTO payment (amount, date_paid, date_expiration)" + "VALUES ('"+aM+"', '"+dP+"', '"+dE+"')";
                    st.executeUpdate(query2);
                }else if("Half Month".equals(pN)){
                    aM = String.valueOf(400);
                    dP = formattedDateTime;
                    dE = formattedExpirationDateTime2;
                    
                    query2 = "INSERT INTO payment (amount, date_paid, date_expiration)" + "VALUES ('"+aM+"', '"+dP+"', '"+dE+"')";
                    st.executeUpdate(query2);
                }else if("Monthly".equals(pN)){
                    aM = String.valueOf(700);
                    dP = formattedDateTime;
                    dE = formattedExpirationDateTime;
                    
                    query2 = "INSERT INTO payment (amount, date_paid, date_expiration)" + "VALUES ('"+aM+"', '"+dP+"', '"+dE+"')";
                    st.executeUpdate(query2);
                }
                
                name_Label.setText("");
                mobile_numberLabel.setText("");
                ageLabel.setText("");
                contactname_Label.setText("");
                contactnumber_Label.setText("");
                sexComboBox.setSelectedItem(" ");
                planComboBox.setSelectedItem(" ");
                
                showMessageDialog(null, "Successfully registered");
                
                loadData();
                con.close();
            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_addMemberActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        dispose();
        gymProfile x = new gymProfile();
                x.setVisible(true);
                x.loadData();
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_ProfileActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void LogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogsActionPerformed
        dispose();
        gymLogs x = new gymLogs();
                x.setVisible(true);
                x.loadData();
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_LogsActionPerformed

    private void name_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_LabelActionPerformed
        
    }//GEN-LAST:event_name_LabelActionPerformed

    private void mobile_numberLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_numberLabelActionPerformed
        //if (mobile_numberLabel)
    }//GEN-LAST:event_mobile_numberLabelActionPerformed

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
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewMember x = new NewMember();
                x.setVisible(true);
                x.loadData();
                x.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton Logs;
    private javax.swing.JButton NewMember;
    private javax.swing.JButton Profile;
    private javax.swing.JButton UpdateDelete;
    private javax.swing.JButton addMember;
    private javax.swing.JTextField ageLabel;
    private javax.swing.JButton clearAll;
    private javax.swing.JTextField contactname_Label;
    private javax.swing.JTextField contactnumber_Label;
    private javax.swing.JLabel emergencycontactName_Text;
    private javax.swing.JLabel emergencycontactNumber_Text;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mobile_numberLabel;
    private javax.swing.JLabel mobilenumber_Text;
    private javax.swing.JTextField name_Label;
    private javax.swing.JLabel name_Text;
    private javax.swing.JLabel new_member;
    private javax.swing.JComboBox<String> planComboBox;
    private javax.swing.JLabel plan_Text;
    private javax.swing.JComboBox<String> sexComboBox;
    private javax.swing.JLabel sex_Text;
    // End of variables declaration//GEN-END:variables
}