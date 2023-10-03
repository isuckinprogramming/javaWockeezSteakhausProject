package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

public class AdminDashboard extends  JFrame {

    public AdminDashboard() {
        // initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // private void initComponents() {

    //     OuterPanel = new  JPanel();
    //     InnerPanel = new  JPanel();
    //     AdminDashboard = new  JLabel();
    //     AddEmployee = new  JButton();
    //     addEmployeeAsAdmin = new  JButton();
    //     AddReservations = new  JButton();
    //     AddRoom = new  JButton();
    //     CancelReservation = new  JButton();
    //     FireEmployee = new  JButton();
    //     TurnDownRoom = new  JButton();
    //     SteakPic = new  JLabel();
    //     JavaWackeezName = new  JLabel();

    //     setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
    //     setPreferredSize(new  Dimension(700, 400));

    //     OuterPanel.setBackground(new  Color(206, 66, 87));
    //     OuterPanel.setPreferredSize(new  Dimension(720, 400));

    //     InnerPanel.setBackground(new  Color(255, 255, 255));

    //     AdminDashboard.setFont(new  Font("Poppins", 1, 14)); // NOI18N
    //     AdminDashboard.setForeground(new  Color(206, 66, 87));
    //     AdminDashboard.setText("Admin's Dashboard");

    //     AddEmployee.setForeground(new  Color(206, 66, 87));
    //     AddEmployee.setText("Add Employee");
    //     AddEmployee.setSize(new  Dimension(100, 25));
    //     AddEmployee.addActionListener(new   ActionListener() {
    //         public void actionPerformed(  ActionEvent evt) {
    //             AddEmployeeActionPerformed(evt);
    //         }
    //     });

    //     addEmployeeAsAdmin.setForeground(new  Color(206, 66, 87));
    //     addEmployeeAsAdmin.setText("Add Employee as Admin");
    //     addEmployeeAsAdmin.setPreferredSize(new  Dimension(175, 25));

    //     AddReservations.setForeground(new  Color(206, 66, 87));
    //     AddReservations.setText("Add Reservations");
    //     AddReservations.setPreferredSize(new  Dimension(140, 25));

    //     AddRoom.setForeground(new  Color(206, 66, 87));
    //     AddRoom.setText("Add Room");
    //     AddRoom.setPreferredSize(new  Dimension(100, 25));

    //     CancelReservation.setForeground(new  Color(206, 66, 87));
    //     CancelReservation.setText("Cancel Reservation");
    //     CancelReservation.setPreferredSize(new  Dimension(175, 25));

    //     FireEmployee.setForeground(new  Color(206, 66, 87));
    //     FireEmployee.setText("Fire Employee");
    //     FireEmployee.setPreferredSize(new  Dimension(175, 25));

    //     TurnDownRoom.setForeground(new  Color(206, 66, 87));
    //     TurnDownRoom.setText("Turn Down Room");
    //     TurnDownRoom.setPreferredSize(new  Dimension(175, 25));

    //     SteakPic.setIcon(new  ImageIcon(getClass().getResource("/javagui/Images/Steak.png"))); // NOI18N

    //     JavaWackeezName.setFont(new  Font("Poppins", 1, 14)); // NOI18N
    //     JavaWackeezName.setForeground(new  Color(206, 66, 87));
    //     JavaWackeezName.setText("Javawackeez's Steakhouse");

    //      GroupLayout InnerPanelLayout = new  GroupLayout(InnerPanel);
    //     InnerPanel.setLayout(InnerPanelLayout);
    //     InnerPanelLayout.setHorizontalGroup(
    //         InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
    //         .addGroup(InnerPanelLayout.createSequentialGroup()
    //             .addContainerGap(27, Short.MAX_VALUE)
    //             .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
    //                 .addGroup( GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
    //                     .addComponent(AddEmployee)
    //                     .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
    //                     .addComponent(addEmployeeAsAdmin,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
    //                     .addGap(18, 18, 18)
    //                     .addComponent(AddReservations,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
    //                     .addGap(18, 18, 18)
    //                     .addComponent(AddRoom,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
    //                     .addGap(24, 24, 24))
    //                 .addGroup( GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
    //                     .addComponent(CancelReservation,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
    //                     .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
    //                     .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
    //                         .addGroup(InnerPanelLayout.createSequentialGroup()
    //                             .addGap(9, 9, 9)
    //                             .addComponent(FireEmployee,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
    //                             .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
    //                             .addComponent(TurnDownRoom,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
    //                             .addGap(36, 36, 36))
    //                         .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
    //                             .addGroup( GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
    //                                 .addComponent(JavaWackeezName)
    //                                 .addGap(205, 205, 205))
    //                             .addGroup( GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
    //                                 .addComponent(SteakPic)
    //                                 .addGap(272, 272, 272)))))
    //                 .addGroup( GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
    //                     .addComponent(AdminDashboard)
    //                     .addGap(227, 227, 227))))
    //     );
    //     InnerPanelLayout.setVerticalGroup(
    //         InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
    //         .addGroup(InnerPanelLayout.createSequentialGroup()
    //             .addGap(12, 12, 12)
    //             .addComponent(AdminDashboard)
    //             .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
    //             .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.BASELINE)
    //                 .addComponent(AddEmployee)
    //                 .addComponent(addEmployeeAsAdmin,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
    //                 .addComponent(AddReservations,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
    //                 .addComponent(AddRoom,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
    //             .addGap(18, 18, 18)
    //             .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.BASELINE)
    //                 .addComponent(CancelReservation,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
    //                 .addComponent(FireEmployee,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
    //                 .addComponent(TurnDownRoom,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
    //             .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
    //             .addComponent(SteakPic)
    //             .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
    //             .addComponent(JavaWackeezName)
    //             .addGap(40, 40, 40))
    //     );

    //      GroupLayout OuterPanelLayout = new  GroupLayout(OuterPanel);
    //     OuterPanel.setLayout(OuterPanelLayout);
    //     OuterPanelLayout.setHorizontalGroup(
    //         OuterPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
    //         .addGroup(OuterPanelLayout.createSequentialGroup()
    //             .addGap(28, 28, 28)
    //             .addComponent(InnerPanel,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
    //             .addContainerGap(42, Short.MAX_VALUE))
    //     );
    //     OuterPanelLayout.setVerticalGroup(
    //         OuterPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
    //         .addGroup(OuterPanelLayout.createSequentialGroup()
    //             .addGap(31, 31, 31)
    //             .addComponent(InnerPanel,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
    //             .addContainerGap(69, Short.MAX_VALUE))
    //     );

    //      GroupLayout layout = new  GroupLayout(getContentPane());
    //     getContentPane().setLayout(layout);
    //     layout.setHorizontalGroup(
    //         layout.createParallelGroup( GroupLayout.Alignment.LEADING)
    //         .addComponent(OuterPanel,  GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
    //     );
    //     layout.setVerticalGroup(
    //         layout.createParallelGroup( GroupLayout.Alignment.LEADING)
    //         .addComponent(OuterPanel,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    //     );

    //     pack();
    //   }// </editor-fold>//GEN-END:initComponents


      public static JPanel getDashBoardPanel() {
        
        OuterPanel = new  JPanel();
        InnerPanel = new  JPanel();
        AdminDashboard = new  JLabel();
        AddEmployee = new  JButton();
        addEmployeeAsAdmin = new  JButton();
        AddReservations = new  JButton();
        AddRoom = new  JButton();
        CancelReservation = new  JButton();
        FireEmployee = new  JButton();
        TurnDownRoom = new  JButton();
        SteakPic = new  JLabel();
        JavaWackeezName = new  JLabel();

        // setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        // setPreferredSize(new  Dimension(700, 400));

        OuterPanel.setBackground(new  Color(206, 66, 87));
        OuterPanel.setPreferredSize(new  Dimension(720, 400));

        InnerPanel.setBackground(new  Color(255, 255, 255));

        AdminDashboard.setFont(new  Font("Poppins", 1, 14)); // NOI18N
        AdminDashboard.setForeground(new  Color(206, 66, 87));
        AdminDashboard.setText("Admin's Dashboard");

        AddEmployee.setForeground(new  Color(206, 66, 87));
        AddEmployee.setText("Add Employee");
        AddEmployee.setSize(new  Dimension(100, 25));
        AddEmployee.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                AddEmployeeActionPerformed(evt);
            }
        });

        addEmployeeAsAdmin.setForeground(new  Color(206, 66, 87));
        addEmployeeAsAdmin.setText("Add Employee as Admin");
        addEmployeeAsAdmin.setPreferredSize(new  Dimension(175, 25));

        AddReservations.setForeground(new  Color(206, 66, 87));
        AddReservations.setText("Add Reservations");
        AddReservations.setPreferredSize(new  Dimension(140, 25));

        AddRoom.setForeground(new  Color(206, 66, 87));
        AddRoom.setText("Add Room");
        AddRoom.setPreferredSize(new  Dimension(100, 25));

        CancelReservation.setForeground(new  Color(206, 66, 87));
        CancelReservation.setText("Cancel Reservation");
        CancelReservation.setPreferredSize(new  Dimension(175, 25));

        FireEmployee.setForeground(new  Color(206, 66, 87));
        FireEmployee.setText("Fire Employee");
        FireEmployee.setPreferredSize(new  Dimension(175, 25));

        TurnDownRoom.setForeground(new  Color(206, 66, 87));
        TurnDownRoom.setText("Turn Down Room");
        TurnDownRoom.setPreferredSize(new Dimension(175, 25));

        // "/javagui/Images/Steak.png"
        SteakPic.setIcon(new  ImageIcon("/src/Images/Steak.png") ); // NOI18N

        JavaWackeezName.setFont(new  Font("Poppins", 1, 14)); // NOI18N
        JavaWackeezName.setForeground(new  Color(206, 66, 87));
        JavaWackeezName.setText("Javawackeez's Steakhouse");

         GroupLayout InnerPanelLayout = new  GroupLayout(InnerPanel);
        InnerPanel.setLayout(InnerPanelLayout);
        InnerPanelLayout.setHorizontalGroup(
          InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
          .addGroup(InnerPanelLayout.createSequentialGroup()
              .addContainerGap(27, Short.MAX_VALUE)
              .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
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
                      .addComponent(CancelReservation,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                      .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
                          .addGroup(InnerPanelLayout.createSequentialGroup()
                              .addGap(9, 9, 9)
                              .addComponent(FireEmployee,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(TurnDownRoom,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                              .addGap(36, 36, 36))
                          .addGroup(InnerPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
                              .addGroup( GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                                  .addComponent(JavaWackeezName)
                                  .addGap(205, 205, 205))
                              .addGroup( GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                                  .addComponent(SteakPic)
                                  .addGap(272, 272, 272)))))
                  .addGroup( GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                      .addComponent(AdminDashboard)
                      .addGap(227, 227, 227))))
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
              .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
              .addComponent(SteakPic)
              .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
              .addComponent(JavaWackeezName)
              .addGap(40, 40, 40))
      );

        GroupLayout OuterPanelLayout = new  GroupLayout(OuterPanel);
      OuterPanel.setLayout(OuterPanelLayout);
      OuterPanelLayout.setHorizontalGroup(
          OuterPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
          .addGroup(OuterPanelLayout.createSequentialGroup()
              .addGap(28, 28, 28)
              .addComponent(InnerPanel,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
              .addContainerGap(42, Short.MAX_VALUE))
      );
      OuterPanelLayout.setVerticalGroup(
          OuterPanelLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
          .addGroup(OuterPanelLayout.createSequentialGroup()
              .addGap(31, 31, 31)
              .addComponent(InnerPanel,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
              .addContainerGap(69, Short.MAX_VALUE))
      );


      return OuterPanel;
    }


    private static void AddEmployeeActionPerformed(  ActionEvent evt) {//GEN-FIRST:event_AddEmployeeActionPerformed
        //Button

    }//GEN-LAST:event_AddEmployeeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static  JButton AddEmployee;
    private static JButton AddReservations;
    private static JButton AddRoom;
    private static JLabel AdminDashboard;
    private static JButton CancelReservation;
    private static JButton FireEmployee;
    private static JPanel InnerPanel;
    private static JLabel JavaWackeezName;
    private static JPanel OuterPanel;
    private static JLabel SteakPic;
    private static JButton TurnDownRoom;
    private static JButton addEmployeeAsAdmin;
    // End of variables declaration//GEN-END:variables
}
