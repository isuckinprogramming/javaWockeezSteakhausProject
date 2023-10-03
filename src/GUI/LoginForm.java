package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import DatabaseTables.Employees;
import SystemObjects.ProgramUser;

public class LoginForm extends  JFrame {

    /**
     * Creates new form Frame
     */
    private ProgramUser currentReferenceToProgramUser;

    private Employees employeeTableReference;

    public LoginForm(ProgramUser user, Employees employeeTable) {
      initComponents();
      currentReferenceToProgramUser = user;
      employeeTableReference = employeeTable;
    }
    /** TODO the buttons can be found at the bottom, do not touch everything just for the function only.
    */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftSidePanel = new  JPanel();
        SteakLogo = new  JLabel();
        TitleJavaWackeezPanel = new  JPanel();
        jLabel4 = new  JLabel();
        jLabel5 = new  JLabel();
        RightSidePanel = new  JPanel();
        UpperPanel = new  JPanel();
        AdminPicture = new  JLabel();
        MiddlePanel = new  JPanel();
        EmployeeIDText = new  JLabel();
        EmployeeID = new  JTextField();
        PasswordText = new  JLabel();
        Password = new  JPasswordField();
        AdminUser = new  JLabel();
        LoginPanel = new  JPanel();
        LoginButton = new  JButton();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new  Dimension(700, 400));

        LeftSidePanel.setBackground(new  Color(206, 66, 87));
        LeftSidePanel.setPreferredSize(new Dimension(300, 0));

        // "/javagui/Images/Steak.png"
        SteakLogo.setIcon(new ImageIcon("/src/Images/Steak.png")); // NOI18N

        TitleJavaWackeezPanel.setBackground(new  Color(206, 66, 87));

        jLabel4.setFont(new  Font("Poppins", 2, 12)); // NOI18N
        jLabel4.setForeground(new  Color(255, 255, 255));
        jLabel4.setText("Finest Steakhouse in Davao");

        jLabel5.setFont(new  Font("Poppins", 1, 14)); // NOI18N
        jLabel5.setForeground(new  Color(255, 255, 255));
        jLabel5.setText("JavaWackeez's Steakhouse");

         GroupLayout TitleJavaWackeezPanelLayout = new  GroupLayout(TitleJavaWackeezPanel);
        TitleJavaWackeezPanel.setLayout(TitleJavaWackeezPanelLayout);
        TitleJavaWackeezPanelLayout.setHorizontalGroup(
            TitleJavaWackeezPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(TitleJavaWackeezPanelLayout.createSequentialGroup()
                .addGroup(TitleJavaWackeezPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(TitleJavaWackeezPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(TitleJavaWackeezPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        TitleJavaWackeezPanelLayout.setVerticalGroup(
            TitleJavaWackeezPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(TitleJavaWackeezPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addContainerGap())
        );

         GroupLayout LeftSidePanelLayout = new  GroupLayout(LeftSidePanel);
        LeftSidePanel.setLayout(LeftSidePanelLayout);
        LeftSidePanelLayout.setHorizontalGroup(
            LeftSidePanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(LeftSidePanelLayout.createSequentialGroup()
                .addGroup(LeftSidePanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(LeftSidePanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(TitleJavaWackeezPanel,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftSidePanelLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(SteakLogo)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        LeftSidePanelLayout.setVerticalGroup(
            LeftSidePanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(LeftSidePanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(SteakLogo)
                .addGap(18, 18, 18)
                .addComponent(TitleJavaWackeezPanel,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        getContentPane().add(LeftSidePanel,  BorderLayout.WEST);

        RightSidePanel.setBackground(new  Color(255, 255, 255));

        UpperPanel.setBackground(new  Color(255, 255, 255));
        UpperPanel.setPreferredSize(new Dimension(400, 100));

        // "/javagui/Images/User.png"
        // NOI18N
        AdminPicture.setIcon(new  ImageIcon("/src/Images/User.png")); 

         GroupLayout UpperPanelLayout = new  GroupLayout(UpperPanel);
        UpperPanel.setLayout(UpperPanelLayout);
        UpperPanelLayout.setHorizontalGroup(
            UpperPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(AdminPicture)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        UpperPanelLayout.setVerticalGroup(
            UpperPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup( GroupLayout.Alignment.TRAILING, UpperPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(AdminPicture)
                .addContainerGap())
        );

        RightSidePanel.add(UpperPanel);

        MiddlePanel.setBackground(new  Color(255, 255, 255));
        MiddlePanel.setPreferredSize(new  Dimension(400, 170));

        EmployeeIDText.setFont(new  Font("Poppins", 0, 13)); // NOI18N
        EmployeeIDText.setText("Employee ID");

        EmployeeID.setFont(new  Font("Poppins", 0, 12)); // NOI18N
        EmployeeID.setPreferredSize(new  Dimension(70, 25));
        EmployeeID.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                EmployeeIDActionPerformed(evt);
            }
        });

        PasswordText.setFont(new  Font("Poppins", 0, 13)); // NOI18N
        PasswordText.setText("Password");

        Password.setFont(new  Font("Poppins", 0, 13)); // NOI18N
        Password.setPreferredSize(new  Dimension(70, 25));
        Password.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        AdminUser.setFont(new  Font("Poppins", 1, 14)); // NOI18N
        AdminUser.setForeground(new  Color(206, 66, 87));
        AdminUser.setText("Admin User");

         GroupLayout MiddlePanelLayout = new  GroupLayout(MiddlePanel);
        MiddlePanel.setLayout(MiddlePanelLayout);
        MiddlePanelLayout.setHorizontalGroup(
            MiddlePanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(MiddlePanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(MiddlePanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING, false)
                    .addComponent(PasswordText)
                    .addComponent(EmployeeIDText)
                    .addComponent(EmployeeID,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Password,  GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup( GroupLayout.Alignment.TRAILING, MiddlePanelLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(AdminUser)
                .addGap(157, 157, 157))
        );
        MiddlePanelLayout.setVerticalGroup(
            MiddlePanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(MiddlePanelLayout.createSequentialGroup()
                .addComponent(AdminUser)
                .addGap(9, 9, 9)
                .addComponent(EmployeeIDText)
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeID,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordText)
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RightSidePanel.add(MiddlePanel);

        LoginPanel.setBackground(new  Color(255, 255, 255));
        LoginPanel.setPreferredSize(new  Dimension(400, 100));

        LoginButton.setText("Login");
        LoginButton.setPreferredSize(new  Dimension(100, 25));
        LoginButton.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        LoginPanel.add(LoginButton);

        RightSidePanel.add(LoginPanel);

        getContentPane().add(RightSidePanel,  BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeeIDActionPerformed(  ActionEvent evt) {//GEN-FIRST:event_EmployeeIDActionPerformed
        // TODO Employee ID here == UserEmployeeID.getInput();
    }//GEN-LAST:event_EmployeeIDActionPerformed

    private void PasswordActionPerformed(  ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO Password here == UserPassword.getInput();
    }//GEN-LAST:event_PasswordActionPerformed

    private void LoginButtonActionPerformed(  ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
      // TODO add Button Function
      
      String employeeIdEntryRaw = EmployeeID.getText();
      String employeePassWordEntryRaw = String.valueOf(Password.getPassword());
     
      try {
        int employeeIdConverted = Integer.parseInt(employeeIdEntryRaw);
        
        boolean isLogInSuccesful = currentReferenceToProgramUser.logInCredentialsGUIVersion(
          employeeTableReference, 
          employeeIdConverted,
          employeePassWordEntryRaw
        );

        if (isLogInSuccesful) {
                  JOptionPane.showMessageDialog(
            rootPane,
            "Log In Success. Welcome!!",
            "LOG IN Succesful Message",
           JOptionPane.INFORMATION_MESSAGE);
        }

      }catch (NumberFormatException e) {
        // TODO: handle exception
        // e.printStackTrace();
        JOptionPane.showMessageDialog(
            rootPane,
            "INCORRECT INPUT FOR EMPLOYEE ID.\nPlease use numbers only for your employee id.",
            "LOG-IN PROCESS PROBLEM",
           JOptionPane.WARNING_MESSAGE);
      }catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
      }

      
    }//GEN-LAST:event_LoginButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private  JLabel AdminPicture;
    private  JLabel AdminUser;
    private  JTextField EmployeeID;
    private  JLabel EmployeeIDText;
    private  JPanel LeftSidePanel;
    private  JButton LoginButton;
    private  JPanel LoginPanel;
    private  JPanel MiddlePanel;
    private  JPasswordField Password;
    private  JLabel PasswordText;
    private  JPanel RightSidePanel;
    private  JLabel SteakLogo;
    private  JPanel TitleJavaWackeezPanel;
    private  JPanel UpperPanel;
    private  JLabel jLabel4;
    private  JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
