package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;

import DatabaseTables.Customer;
import DatabaseTables.CustomerService;
import DatabaseTables.DBTableUtility;
import DatabaseTables.Employees;
import DatabaseTables.Reservations;
import DatabaseTables.Rooms;
import SystemObjects.ProgramUser;

public class AdminDashboardUpdated extends JFrame {
    
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
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents


    private void initializeGUIComponents() {
        OuterPanel = new JPanel();
        InnerPanel = new JPanel();
        AdminDashboard = new JLabel();
        AddEmployee = new JButton();
        addEmployeeAsAdmin = new JButton();
        AddReservations = new JButton();
        AddRoom = new JButton();
        CancelReservation = new JButton();
        FireEmployee = new JButton();
        TurnDownRoom = new JButton();
        ViewEmployee = new JButton();
        ViewReservations = new JButton();
        viewCustomerService = new JButton();
        ViewRooms = new JButton();
        ViewCustomers = new JButton();
        AdminDashboard1 = new JLabel();
    }
    
    private void initComponents() {
        
        initializeGUIComponents();
        
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);

        OuterPanel.setBackground(new  Color(206, 66, 87));
        OuterPanel.setPreferredSize(new  Dimension(720, 400));

        InnerPanel.setBackground(new  Color(255, 255, 255));

        AdminDashboard.setFont(new  Font("Poppins", 1, 14)); // NOI18N
        AdminDashboard.setForeground(new  Color(206, 66, 87));
        AdminDashboard.setText("Admin's Dashboard");
        
        setUpButtonSettings();

        AdminDashboard1.setFont(new  Font("Poppins", 1, 14)); // NOI18N
        AdminDashboard1.setForeground(new  Color(206, 66, 87));
        AdminDashboard1.setText("Main Functions");

        setUpLayoutForInnerPanel();

        SetUpLayoutForOuterPanel();

        GroupLayout layout = new GroupLayout(getContentPane());
         
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addComponent(OuterPanel,  GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addComponent(OuterPanel,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void setUpButtonSettings() {
    
    
        AddEmployee.setForeground(new  Color(206, 66, 87));
        AddEmployee.setText("Add Employee");
        AddEmployee.setSize(new  Dimension(100, 25));
        AddEmployee.addActionListener( addEmployeeAction );

        addEmployeeAsAdmin.setForeground(new  Color(206, 66, 87));
        addEmployeeAsAdmin.setText("Add Employee as Admin");
        addEmployeeAsAdmin.setPreferredSize(new  Dimension(180, 25));
        addEmployeeAsAdmin.addActionListener( addEmployeeAdAdminAction );

        AddReservations.setForeground(new  Color(206, 66, 87));
        AddReservations.setText("Add Reservations");
        AddReservations.setPreferredSize(new  Dimension(140, 25));
        AddReservations.addActionListener( addReservationAction );

        AddRoom.setForeground(new  Color(206, 66, 87));
        AddRoom.setText("Add Room");
        AddRoom.setPreferredSize(new  Dimension(100, 25));
        AddRoom.addActionListener( addRoomAction );

        CancelReservation.setForeground(new  Color(206, 66, 87));
        CancelReservation.setText("Cancel Reservation");
        CancelReservation.setPreferredSize(new  Dimension(175, 25));
        CancelReservation.addActionListener( cancelReservationAction );

        FireEmployee.setForeground(new  Color(206, 66, 87));
        FireEmployee.setText("Fire Employee");
        FireEmployee.setPreferredSize(new  Dimension(175, 25));
        FireEmployee.addActionListener( fireEmployeeAction );

        TurnDownRoom.setForeground(new  Color(206, 66, 87));
        TurnDownRoom.setText("Turn Down Room");
        TurnDownRoom.setPreferredSize(new  Dimension(175, 25));
        TurnDownRoom.addActionListener( turnDownRoomAction );

        ViewEmployee.setForeground(new  Color(206, 66, 87));
        ViewEmployee.setText("View Employees");
        ViewEmployee.setPreferredSize(new Dimension(156, 30));
        ViewEmployee.addActionListener( ( e ) -> {
            DBTableUtility.displayAllDataFromTable(Employees.tableName);
        } );

        ViewReservations.setForeground(new  Color(206, 66, 87));
        ViewReservations.setText("View Reservations");
        ViewReservations.setPreferredSize(new Dimension(138, 30));
        ViewReservations.addActionListener( (e) -> {        
            DBTableUtility.displayAllDataFromTable(Reservations.tableName);
        } );
        

        viewCustomerService.setForeground(new  Color(206, 66, 87));
        viewCustomerService.setText("View Customer Service");
        viewCustomerService.setPreferredSize(new Dimension(165, 30));
        viewCustomerService.addActionListener( ( e) -> {
            DBTableUtility.displayAllDataFromTable(CustomerService.tableName);
        } );
        
        ViewRooms.setForeground(new  Color(206, 66, 87));
        ViewRooms.setText("View Rooms");
        ViewRooms.setPreferredSize(new  Dimension(156, 30));
        ViewRooms.addActionListener( ( event ) -> {
            DBTableUtility.displayAllDataFromTable(Rooms.tableName);
        } );

        ViewCustomers.setForeground(new  Color(206, 66, 87));
        ViewCustomers.setText("View Customers");
        ViewCustomers.setPreferredSize(new  Dimension(156, 30));
        ViewCustomers.addActionListener((event) -> {
            DBTableUtility.displayAllDataFromTable(Customer.tableName);
        } );
    }

    private void SetUpLayoutForOuterPanel() {
        
        GroupLayout OuterPanelLayout = new  GroupLayout(OuterPanel);
        OuterPanel.setLayout(OuterPanelLayout);
        OuterPanelLayout.setHorizontalGroup(
            OuterPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(OuterPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(InnerPanel,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        OuterPanelLayout.setVerticalGroup(
            OuterPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(OuterPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(InnerPanel,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    
    }

    private void setUpLayoutForInnerPanel() {
    
        GroupLayout InnerPanelLayout = new  GroupLayout(InnerPanel);
        InnerPanel.setLayout(InnerPanelLayout);
        InnerPanelLayout.setHorizontalGroup(
            InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(InnerPanelLayout.createSequentialGroup()
                .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(ViewRooms,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ViewCustomers,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(ViewEmployee,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ViewReservations,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewCustomerService,  GroupLayout.PREFERRED_SIZE, 180,  GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup( GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup( GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                        .addComponent(CancelReservation,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FireEmployee,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TurnDownRoom,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup( GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                        .addComponent(AddEmployee)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addEmployeeAsAdmin,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddReservations,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddRoom,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup( GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                        .addComponent(AdminDashboard)
                        .addGap(239, 239, 239))
                    .addGroup( GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                        .addComponent(AdminDashboard1)
                        .addGap(258, 258, 258))))
        );
        InnerPanelLayout.setVerticalGroup(
            InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(InnerPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(AdminDashboard)
                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(AddEmployee)
                    .addComponent(addEmployeeAsAdmin,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddReservations,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddRoom,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelReservation,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(FireEmployee,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(TurnDownRoom,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(AdminDashboard1)
                .addGap(18, 18, 18)
                .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewEmployee,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewReservations,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewCustomerService,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewRooms,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewCustomers,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

    
    }


    private void AddEmployeeActionPerformed(  ActionEvent evt) {//GEN-FIRST:event_AddEmployeeActionPerformed
        //TODO ButtonForAdding Employee
        //Here once we click the button, it will go to addEmployeeFrame (Sample Code, Sample Run) >>
        // admins.addWindowListener(new WindowAdapter() {
        //     public void windowClosed(WindowEvent e) {
        //         // addEmployee.setVisible(true);
        //         /* TODO once we click the button ADD EMPLOYEE then JOption will pop up
        //         String pop up = JOptionPane.showMessageDialog(null, "Employee Registered");*/
        //     }
        // });
       
        // admins.dispose();
        //After adding goes back to "setVisible Dashboard"
        
        /* sample code for opening a new window and closing an old window*/
    }//GEN-LAST:event_AddEmployeeActionPerformed


    private void AddReservationsActionPerformed(  ActionEvent evt) {//GEN-FIRST:event_AddReservationsActionPerformed
           
            // admins.addWindowListener(new WindowAdapter() {
               
            //     public void windowClosed(WindowEvent e) {
            //         add.setLocationRelativeTo(null);
            //         add.setVisible(true);
            //     }
            // });
            
            // admins.dispose();

            //After adding goes back to "setVisible Dashboard"
           
    }//GEN-LAST:event_AddReservationsActionPerformed
    
// --------------VIEW TABLE FUNCTIONS------------------
    
    //Methods for isAdmin or isEmployee    
    // public boolean isEmployee() {
        //     return programUserReference.isAdmin;
        // }
    
    //TODO Function for disabling employee to admin's functions

    public void disableEmployeesFunction() {

        if (!programUserReference.isUserAdmin()) {
            return;
        }

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
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    
    // jlabels
    private  JLabel AdminDashboard;
    private JLabel AdminDashboard1;
    
    // jpanels
    private  JPanel InnerPanel;
    private JPanel OuterPanel;
    
    
    // jbuttons 
    // TODO view buttons
    private JButton ViewCustomers;
    private JButton ViewEmployee;
    private JButton ViewReservations;
    private JButton ViewRooms;
    private JButton viewCustomerService;
    
    // TODO action buttons
    // FLAG BUTTONS
    private JButton CancelReservation;
    private JButton FireEmployee; 
    private JButton TurnDownRoom;
    
    // ADD BUTTONS 
    private JButton addEmployeeAsAdmin;
    private JButton AddEmployee;
    private JButton AddReservations;
    private JButton AddRoom;
    
    
    // ----- FLAGGING FUNCTIONS ----------------------------
    private ActionListener turnDownRoomAction = (event)-> {
        // TODO will use a joptionpane to receive roomid to turn into an unavailable room
    };

    
    private ActionListener cancelReservationAction = (event) -> {
        // TODO will use a  joptionpane to receive reservationid to cancel
    };
    
    
    private ActionListener fireEmployeeAction = (event)-> {
        // will use a joptionpane to receive employeeid to fire employee
    };
    
    // ------------------- ADD FUNCTIONS -------------------
    private ActionListener addReservationAction = (event) -> {
        AddReservations reservationFrame = new AddReservations(programUserReference);
        reservationFrame.setVisible(true);

    };

    private ActionListener addRoomAction = (event)-> {
        // will use a joption pane to present notification message
    };
    
    private ActionListener addEmployeeAction = (event) -> {
        addEmployeeFrame addEmployee = new addEmployeeFrame();

        // addEmployeeFrame addEmployee = new addEmployeeFrame( programUserReference );
        addEmployee.setVisible(true);
    };
    
    //------------------ ADD & FLAG FUNCTION    
    private ActionListener addEmployeeAdAdminAction = (event) -> {
        // will use joption pane to update the flag 
    };


    // End of variables declaration//GEN-END:variables
                
}
