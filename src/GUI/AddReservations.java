/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author juderafael
 */
public class AddReservations extends javax.swing.JFrame {

    /**
     * Creates new form AddReservations
     */
    public AddReservations() {
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

        Holder = new javax.swing.JPanel();
        PanelHolder = new javax.swing.JPanel();
        ReservationLabel = new javax.swing.JLabel();
        AddReservationLabel = new javax.swing.JPanel();
        StartingTimeLabel = new javax.swing.JLabel();
        StartingTime = new javax.swing.JTextField();
        FormatLabel = new javax.swing.JLabel();
        EndingTime = new javax.swing.JTextField();
        EndingTimeLabel = new javax.swing.JLabel();
        PartySize = new javax.swing.JTextField();
        PartySizeLabel = new javax.swing.JLabel();
        AddCustomerPanel = new javax.swing.JPanel();
        FirstNameLabel = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        LastNameLabel = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        ContactNumber = new javax.swing.JTextField();
        ContactNumberLavel = new javax.swing.JLabel();
        AddReservation = new javax.swing.JButton();
        AddCustomerDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 450));

        PanelHolder.setBackground(new java.awt.Color(255, 255, 255));

        ReservationLabel.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        ReservationLabel.setForeground(new java.awt.Color(206, 66, 87));
        ReservationLabel.setText("ADD RESERVATIONS");

        AddReservationLabel.setBackground(new java.awt.Color(206, 66, 87));

        StartingTimeLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        StartingTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        StartingTimeLabel.setText("Starting Time ");

        StartingTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartingTimeActionPerformed(evt);
            }
        });

        FormatLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        FormatLabel.setForeground(new java.awt.Color(255, 255, 255));
        FormatLabel.setText("Format: 2022 - month - day T 8:00:00PM");

        EndingTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndingTimeActionPerformed(evt);
            }
        });

        EndingTimeLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        EndingTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        EndingTimeLabel.setText("Ending Time ");

        PartySize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartySizeActionPerformed(evt);
            }
        });

        PartySizeLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        PartySizeLabel.setForeground(new java.awt.Color(255, 255, 255));
        PartySizeLabel.setText("Party Size ");

        javax.swing.GroupLayout AddReservationLabelLayout = new javax.swing.GroupLayout(AddReservationLabel);
        AddReservationLabel.setLayout(AddReservationLabelLayout);
        AddReservationLabelLayout.setHorizontalGroup(
            AddReservationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddReservationLabelLayout.createSequentialGroup()
                .addGroup(AddReservationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddReservationLabelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(FormatLabel)
                        .addGap(0, 105, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddReservationLabelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(AddReservationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EndingTime, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StartingTime)
                            .addGroup(AddReservationLabelLayout.createSequentialGroup()
                                .addGroup(AddReservationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PartySizeLabel)
                                    .addComponent(EndingTimeLabel)
                                    .addComponent(StartingTimeLabel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(PartySize))))
                .addGap(28, 28, 28))
        );
        AddReservationLabelLayout.setVerticalGroup(
            AddReservationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddReservationLabelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(StartingTimeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StartingTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormatLabel)
                .addGap(12, 12, 12)
                .addComponent(EndingTimeLabel)
                .addGap(8, 8, 8)
                .addComponent(EndingTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PartySizeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PartySize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AddCustomerPanel.setBackground(new java.awt.Color(206, 66, 87));

        FirstNameLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        FirstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        FirstNameLabel.setText("First name");

        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });

        LastNameLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        LastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        LastNameLabel.setText("Last name");

        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });

        EmailLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("Email");

        ContactNumberLavel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ContactNumberLavel.setForeground(new java.awt.Color(255, 255, 255));
        ContactNumberLavel.setText("Contact number");

        javax.swing.GroupLayout AddCustomerPanelLayout = new javax.swing.GroupLayout(AddCustomerPanel);
        AddCustomerPanel.setLayout(AddCustomerPanelLayout);
        AddCustomerPanelLayout.setHorizontalGroup(
            AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCustomerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LastNameLabel)
                    .addComponent(FirstNameLabel)
                    .addComponent(EmailLabel)
                    .addComponent(ContactNumberLavel)
                    .addComponent(FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(LastName)
                    .addComponent(Email)
                    .addComponent(ContactNumber))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        AddCustomerPanelLayout.setVerticalGroup(
            AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCustomerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(FirstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LastNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ContactNumberLavel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        AddReservation.setForeground(new java.awt.Color(206, 66, 87));
        AddReservation.setText("Add Reservation");
        AddReservation.setPreferredSize(new java.awt.Dimension(127, 30));
        AddReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddReservationActionPerformed(evt);
            }
        });

        AddCustomerDetails.setForeground(new java.awt.Color(206, 66, 87));
        AddCustomerDetails.setText("Add Customer Details");
        AddCustomerDetails.setPreferredSize(new java.awt.Dimension(158, 30));
        AddCustomerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelHolderLayout = new javax.swing.GroupLayout(PanelHolder);
        PanelHolder.setLayout(PanelHolderLayout);
        PanelHolderLayout.setHorizontalGroup(
            PanelHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHolderLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelHolderLayout.createSequentialGroup()
                        .addComponent(ReservationLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelHolderLayout.createSequentialGroup()
                        .addComponent(AddReservationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(PanelHolderLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(AddReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        PanelHolderLayout.setVerticalGroup(
            PanelHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHolderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ReservationLabel)
                .addGap(18, 18, 18)
                .addGroup(PanelHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddReservationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout HolderLayout = new javax.swing.GroupLayout(Holder);
        Holder.setLayout(HolderLayout);
        HolderLayout.setHorizontalGroup(
            HolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HolderLayout.setVerticalGroup(
            HolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //TODO Disregard the Textfields function it is used to see the needed fields and buttons
    private void EndingTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndingTimeActionPerformed
        // TODO EndingTime
    }//GEN-LAST:event_EndingTimeActionPerformed

    private void StartingTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartingTimeActionPerformed
        // TODO StartingTime
    }//GEN-LAST:event_StartingTimeActionPerformed

    private void AddReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddReservationActionPerformed
        // TODO AddReservationButton
    }//GEN-LAST:event_AddReservationActionPerformed

    private void AddCustomerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerDetailsActionPerformed
        // TODO AddCustomerDetailsButton
    }//GEN-LAST:event_AddCustomerDetailsActionPerformed

    private void PartySizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartySizeActionPerformed
        // TODO PartySize
    }//GEN-LAST:event_PartySizeActionPerformed

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO FirstName
    }//GEN-LAST:event_FirstNameActionPerformed

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO LastName
    }//GEN-LAST:event_LastNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCustomerDetails;
    private javax.swing.JPanel AddCustomerPanel;
    private javax.swing.JButton AddReservation;
    private javax.swing.JPanel AddReservationLabel;
    private javax.swing.JTextField ContactNumber;
    private javax.swing.JLabel ContactNumberLavel;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EndingTime;
    private javax.swing.JLabel EndingTimeLabel;
    private javax.swing.JTextField FirstName;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JLabel FormatLabel;
    private javax.swing.JPanel Holder;
    private javax.swing.JTextField LastName;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JPanel PanelHolder;
    private javax.swing.JTextField PartySize;
    private javax.swing.JLabel PartySizeLabel;
    private javax.swing.JLabel ReservationLabel;
    private javax.swing.JTextField StartingTime;
    private javax.swing.JLabel StartingTimeLabel;
    // End of variables declaration//GEN-END:variables
}
