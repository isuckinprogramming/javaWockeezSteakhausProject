package GUI;

// package javagui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;

import DatabaseTables.Customer;
import DatabaseTables.Employees;
import ExternalUtilityClasses.DBTableUtility;
import SystemObjects.DatabaseInitialize;
import SystemObjects.ProgramUser;

public class AdminDashboardUpdated extends javax.swing.JFrame {
    
    public static void main(String[] args) {

        // AdminDashboardUpdated test = new AdminDashboardUpdated();
        // test.setVisible(true);
    }

    public AdminDashboardUpdated(
      Employees employeesTableReference, ProgramUser programUserReference
    ) {
      
      this.employeeTableReference = employeesTableReference;
      this.programUserReference = programUserReference;

      initComponents();
      this.setVisible(true);
    }
    
    Employees employeeTableReference;
    ProgramUser programUserReference;
    // unsa mani?????"?"
    // //Creating abstaction class to call 
    AdminDashboardUpdated admins = this;
    
    addEmployeeFrame addEmployee = new addEmployeeFrame();
    AddReservations add = new AddReservations();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OuterPanel = new javax.swing.JPanel();
        InnerPanel = new javax.swing.JPanel();
        AdminDashboard = new javax.swing.JLabel();
        AddEmployee = new javax.swing.JButton();
        addEmployeeAsAdmin = new javax.swing.JButton();
        AddReservations = new javax.swing.JButton();
        AddRoom = new javax.swing.JButton();
        CancelReservation = new javax.swing.JButton();
        FireEmployee = new javax.swing.JButton();
        TurnDownRoom = new javax.swing.JButton();
        ViewEmployee = new javax.swing.JButton();
        ViewReservations = new javax.swing.JButton();
        CustomerService = new javax.swing.JButton();
        ViewRooms = new javax.swing.JButton();
        ViewCustomers = new javax.swing.JButton();
        AdminDashboard1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OuterPanel.setBackground(new java.awt.Color(206, 66, 87));
        OuterPanel.setPreferredSize(new java.awt.Dimension(720, 400));

        InnerPanel.setBackground(new java.awt.Color(255, 255, 255));

        AdminDashboard.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        AdminDashboard.setForeground(new java.awt.Color(206, 66, 87));
        AdminDashboard.setText("Admin's Dashboard");

        AddEmployee.setForeground(new java.awt.Color(206, 66, 87));
        AddEmployee.setText("Add Employee");
        AddEmployee.setSize(new java.awt.Dimension(100, 25));
        AddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeActionPerformed(evt);
            }
        });

        addEmployeeAsAdmin.setForeground(new java.awt.Color(206, 66, 87));
        addEmployeeAsAdmin.setText("Add Employee as Admin");
        addEmployeeAsAdmin.setPreferredSize(new java.awt.Dimension(180, 25));
        addEmployeeAsAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeAsAdminActionPerformed(evt);
            }
        });

        AddReservations.setForeground(new java.awt.Color(206, 66, 87));
        AddReservations.setText("Add Reservations");
        AddReservations.setPreferredSize(new java.awt.Dimension(140, 25));
        AddReservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddReservationsActionPerformed(evt);
            }
        });

        AddRoom.setForeground(new java.awt.Color(206, 66, 87));
        AddRoom.setText("Add Room");
        AddRoom.setPreferredSize(new java.awt.Dimension(100, 25));
        AddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRoomActionPerformed(evt);
            }
        });

        CancelReservation.setForeground(new java.awt.Color(206, 66, 87));
        CancelReservation.setText("Cancel Reservation");
        CancelReservation.setPreferredSize(new java.awt.Dimension(175, 25));
        CancelReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelReservationActionPerformed(evt);
            }
        });

        FireEmployee.setForeground(new java.awt.Color(206, 66, 87));
        FireEmployee.setText("Fire Employee");
        FireEmployee.setPreferredSize(new java.awt.Dimension(175, 25));
        FireEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FireEmployeeActionPerformed(evt);
            }
        });

        TurnDownRoom.setForeground(new java.awt.Color(206, 66, 87));
        TurnDownRoom.setText("Turn Down Room");
        TurnDownRoom.setPreferredSize(new java.awt.Dimension(175, 25));
        TurnDownRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnDownRoomActionPerformed(evt);
            }
        });

        ViewEmployee.setForeground(new java.awt.Color(206, 66, 87));
        ViewEmployee.setText("View Employees");
        ViewEmployee.setPreferredSize(new java.awt.Dimension(156, 30));

        ViewReservations.setForeground(new java.awt.Color(206, 66, 87));
        ViewReservations.setText("View Reservations");
        ViewReservations.setPreferredSize(new java.awt.Dimension(138, 30));

        CustomerService.setForeground(new java.awt.Color(206, 66, 87));
        CustomerService.setText("View Customer Service");
        CustomerService.setPreferredSize(new java.awt.Dimension(165, 30));

        ViewRooms.setForeground(new java.awt.Color(206, 66, 87));
        ViewRooms.setText("View Rooms");
        ViewRooms.setPreferredSize(new java.awt.Dimension(156, 30));
        ViewRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRoomsActionPerformed(evt);
            }
        });

        ViewCustomers.setForeground(new java.awt.Color(206, 66, 87));
        ViewCustomers.setText("View Customers");
        ViewCustomers.setPreferredSize(new java.awt.Dimension(156, 30));
        ViewCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            ViewCustomersActionPerformed(evt);
              
            }
        });

        AdminDashboard1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        AdminDashboard1.setForeground(new java.awt.Color(206, 66, 87));
        AdminDashboard1.setText("Main Functions");

        javax.swing.GroupLayout InnerPanelLayout = new javax.swing.GroupLayout(InnerPanel);
        InnerPanel.setLayout(InnerPanelLayout);
        InnerPanelLayout.setHorizontalGroup(
            InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerPanelLayout.createSequentialGroup()
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(ViewRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ViewCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(ViewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ViewReservations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CustomerService, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                        .addComponent(CancelReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FireEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TurnDownRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                        .addComponent(AddEmployee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addEmployeeAsAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddReservations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                        .addComponent(AdminDashboard)
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                        .addComponent(AdminDashboard1)
                        .addGap(258, 258, 258))))
        );
        InnerPanelLayout.setVerticalGroup(
            InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(AdminDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddEmployee)
                    .addComponent(addEmployeeAsAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddReservations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FireEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TurnDownRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(AdminDashboard1)
                .addGap(18, 18, 18)
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewReservations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout OuterPanelLayout = new javax.swing.GroupLayout(OuterPanel);
        OuterPanel.setLayout(OuterPanelLayout);
        OuterPanelLayout.setHorizontalGroup(
            OuterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OuterPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(InnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        OuterPanelLayout.setVerticalGroup(
            OuterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OuterPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(InnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OuterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OuterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeActionPerformed
        //TODO ButtonForAdding Employee
        //Here once we click the button, it will go to addEmployeeFrame (Sample Code, Sample Run) >>
        admins.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                // addEmployee.setVisible(true);
                /* TODO once we click the button ADD EMPLOYEE then JOption will pop up
                String pop up = JOptionPane.showMessageDialog(null, "Employee Registered");*/
            }
        });
       
        admins.dispose();
        //After adding goes back to "setVisible Dashboard"
        
        /* sample code for opening a new window and closing an old window*/
    }//GEN-LAST:event_AddEmployeeActionPerformed

    private void addEmployeeAsAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeAsAdminActionPerformed
        // TODO addEmployee as admin
        //Apply JOptionPane Here
        //After adding goes back to "setVisible Dashboard"
    }//GEN-LAST:event_addEmployeeAsAdminActionPerformed

    private void AddReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddReservationsActionPerformed
           
            admins.addWindowListener(new WindowAdapter() {
               
                public void windowClosed(WindowEvent e) {
                    add.setLocationRelativeTo(null);
                    add.setVisible(true);
                }
            });
            
            admins.dispose();
            //After adding goes back to "setVisible Dashboard"
           
    }//GEN-LAST:event_AddReservationsActionPerformed

    private void AddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRoomActionPerformed
        // TODO AddRoom
        /* Put JOption Here */
        //After adding goes back to "setVisible Dashboard"
               
    }//GEN-LAST:event_AddRoomActionPerformed

    private void CancelReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelReservationActionPerformed
        // TODO CancelReservation
        // Add JOption Here: Reservation ID and goes back to dashboard "admins.setVisible();
        //After adding goes back to "setVisible Dashboard"
    }//GEN-LAST:event_CancelReservationActionPerformed

    private void FireEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FireEmployeeActionPerformed
        // TODO FireEmployee
        // Add JOption Here    
        //After adding goes back to "setVisible Dashboard"
    }//GEN-LAST:event_FireEmployeeActionPerformed

    private void TurnDownRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnDownRoomActionPerformed
        // TODO turnDownRoom
        // Add JOption Here
        //After adding goes back to "setVisible Dashboard"
    }//GEN-LAST:event_TurnDownRoomActionPerformed

    private void ViewRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRoomsActionPerformed
        // TODO ViewRooms function Here
        //After adding goes back to "setVisible Dashboard"
        ResultSet rs = DatabaseInitialize.executeMySQLQueryForResultSet("SELECT * FROM rooms ");
        DBTableUtility.displayResultSetDataToJFrame(rs);
    }//GEN-LAST:event_ViewRoomsActionPerformed

    private void ViewCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCustomersActionPerformed
        // TODO ViewCustomers function here
        //After adding goes back to "setVisible Dashboard"

        ResultSet rs = DatabaseInitialize.executeMySQLQueryForResultSet("SELECT * FROM " + Customer.tableName);
        DBTableUtility.displayResultSetDataToJFrame(rs);
    }//GEN-LAST:event_ViewCustomersActionPerformed
 
    //Methods for isAdmin or isEmployee    
    // public boolean isEmployee() {
    //     return programUserReference.isAdmin;
    // }
    
    //TODO Function for disabling employee to admin's functions
    public void disableEmployeesFunction() {
         if(programUserReference.isUserAdmin()) {
             AddEmployee.setEnabled(false);
             AddEmployee.setVisible(true);
             // Seperator
             FireEmployee.setVisible(false);   
             // Seperator
             addEmployeeAsAdmin.setEnabled(false);
             addEmployeeAsAdmin.setVisible(false);
             // Seperator
             ViewEmployee.setVisible(false);       
         }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmployee;
    private javax.swing.JButton AddReservations;
    private javax.swing.JButton AddRoom;
    private javax.swing.JLabel AdminDashboard;
    private javax.swing.JLabel AdminDashboard1;
    private javax.swing.JButton CancelReservation;
    private javax.swing.JButton CustomerService;
    private javax.swing.JButton FireEmployee;
    private javax.swing.JPanel InnerPanel;
    private javax.swing.JPanel OuterPanel;
    private javax.swing.JButton TurnDownRoom;
    private javax.swing.JButton ViewCustomers;
    private javax.swing.JButton ViewEmployee;
    private javax.swing.JButton ViewReservations;
    private javax.swing.JButton ViewRooms;
    private javax.swing.JButton addEmployeeAsAdmin;
    // End of variables declaration//GEN-END:variables
}
