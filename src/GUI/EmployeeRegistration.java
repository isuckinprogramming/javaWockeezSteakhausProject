package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DatabaseTables.Employees;
import SystemObjects.ProgramUser;

import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class EmployeeRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameTaker;
	private JTextField lastNameTaker;
	private JTextField contactNumberTaker;
	private JTextField passwordTaker;
	private JTextField positionTaker;

	// reference to system objects
	private ProgramUser programUserReference;
	private Employees employeeTableReference;
	private EmployeeRegistration accessToTheFrame = this;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeRegistration frame = new EmployeeRegistration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EmployeeRegistration(ProgramUser programUserReference, Employees employeeTableReference) {

		this.employeeTableReference = employeeTableReference;
		this.programUserReference = programUserReference;
		prepareGUIComponents();
		this.setVisible(true);
	}


	/**
	 * 
	 * NOTE: DO NOT USE FOR PRODUCTION
	 * Create the frame.
	 * 
	 * Eclipse Window builder default cosntructor
	 * 
	 */
	public EmployeeRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 747);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel frameTitleLabel = new JLabel("EMPLOYEE REGISTER");
		frameTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frameTitleLabel.setBackground(new Color(255, 204, 153));
		frameTitleLabel.setOpaque(true);
		frameTitleLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 18));
		GridBagConstraints gbc_frameTitleLabel = new GridBagConstraints();
		gbc_frameTitleLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_frameTitleLabel.insets = new Insets(0, 0, 5, 0);
		gbc_frameTitleLabel.gridx = 0;
		gbc_frameTitleLabel.gridy = 0;
		contentPane.add(frameTitleLabel, gbc_frameTitleLabel);

		JLabel firstNameLabel = new JLabel("FIRST NAME");
		GridBagConstraints gbc_firstNameLabel = new GridBagConstraints();
		gbc_firstNameLabel.insets = new Insets(0, 0, 5, 0);
		gbc_firstNameLabel.gridx = 0;
		gbc_firstNameLabel.gridy = 2;
		contentPane.add(firstNameLabel, gbc_firstNameLabel);

		firstNameTaker = new JTextField();
		GridBagConstraints gbc_firstNameTaker = new GridBagConstraints();
		gbc_firstNameTaker.insets = new Insets(0, 0, 5, 0);
		gbc_firstNameTaker.fill = GridBagConstraints.HORIZONTAL;
		gbc_firstNameTaker.gridx = 0;
		gbc_firstNameTaker.gridy = 3;
		contentPane.add(firstNameTaker, gbc_firstNameTaker);
		firstNameTaker.setColumns(10);

		JLabel lastNameLabel = new JLabel("LAST NAME ");
		GridBagConstraints gbc_lastNameLabel = new GridBagConstraints();
		gbc_lastNameLabel.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_lastNameLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lastNameLabel.gridx = 0;
		gbc_lastNameLabel.gridy = 4;
		contentPane.add(lastNameLabel, gbc_lastNameLabel);

		lastNameTaker = new JTextField();
		lastNameTaker.setColumns(10);
		GridBagConstraints gbc_lastNameTaker = new GridBagConstraints();
		gbc_lastNameTaker.insets = new Insets(0, 0, 5, 0);
		gbc_lastNameTaker.fill = GridBagConstraints.HORIZONTAL;
		gbc_lastNameTaker.gridx = 0;
		gbc_lastNameTaker.gridy = 5;
		contentPane.add(lastNameTaker, gbc_lastNameTaker);

		JLabel contactNumberLabel = new JLabel("Contact Number");
		GridBagConstraints gbc_contactNumberLabel = new GridBagConstraints();
		gbc_contactNumberLabel.insets = new Insets(0, 0, 5, 0);
		gbc_contactNumberLabel.gridx = 0;
		gbc_contactNumberLabel.gridy = 6;
		contentPane.add(contactNumberLabel, gbc_contactNumberLabel);

		contactNumberTaker = new JTextField();
		contactNumberTaker.setColumns(10);
		GridBagConstraints gbc_contactNumberTaker = new GridBagConstraints();
		gbc_contactNumberTaker.insets = new Insets(0, 0, 5, 0);
		gbc_contactNumberTaker.fill = GridBagConstraints.HORIZONTAL;
		gbc_contactNumberTaker.gridx = 0;
		gbc_contactNumberTaker.gridy = 7;
		contentPane.add(contactNumberTaker, gbc_contactNumberTaker);

		JLabel passwordLabel = new JLabel("Password");
		GridBagConstraints gbc_passwordLabel = new GridBagConstraints();
		gbc_passwordLabel.insets = new Insets(0, 0, 5, 0);
		gbc_passwordLabel.gridx = 0;
		gbc_passwordLabel.gridy = 8;
		contentPane.add(passwordLabel, gbc_passwordLabel);

		passwordTaker = new JTextField();
		passwordTaker.setColumns(10);
		GridBagConstraints gbc_passwordTaker = new GridBagConstraints();
		gbc_passwordTaker.insets = new Insets(0, 0, 5, 0);
		gbc_passwordTaker.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordTaker.gridx = 0;
		gbc_passwordTaker.gridy = 9;
		contentPane.add(passwordTaker, gbc_passwordTaker);

		JLabel positionLabel = new JLabel("POSITION SELECTION");
		GridBagConstraints gbc_positionLabel = new GridBagConstraints();
		gbc_positionLabel.insets = new Insets(0, 0, 5, 0);
		gbc_positionLabel.gridx = 0;
		gbc_positionLabel.gridy = 10;
		contentPane.add(positionLabel, gbc_positionLabel);

		positionTaker = new JTextField();
		positionTaker.setColumns(10);
		GridBagConstraints gbc_positionTaker = new GridBagConstraints();
		gbc_positionTaker.insets = new Insets(0, 0, 5, 0);
		gbc_positionTaker.fill = GridBagConstraints.HORIZONTAL;
		gbc_positionTaker.gridx = 0;
		gbc_positionTaker.gridy = 11;
		contentPane.add(positionTaker, gbc_positionTaker);

		JButton registerEmployeeButton = new JButton("REGISTER");
		registerEmployeeButton.addActionListener(registerAction);
		GridBagConstraints gbc_registerEmployeeButton = new GridBagConstraints();

		gbc_registerEmployeeButton.gridx = 0;
		gbc_registerEmployeeButton.gridy = 12;
		contentPane.add(registerEmployeeButton, gbc_registerEmployeeButton);
	}

	private void prepareGUIComponents() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 747);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel frameTitleLabel = new JLabel("EMPLOYEE REGISTER");
		frameTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frameTitleLabel.setBackground(new Color(255, 204, 153));
		frameTitleLabel.setOpaque(true);
		frameTitleLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 18));
		GridBagConstraints gbc_frameTitleLabel = new GridBagConstraints();
		gbc_frameTitleLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_frameTitleLabel.insets = new Insets(0, 0, 5, 0);
		gbc_frameTitleLabel.gridx = 0;
		gbc_frameTitleLabel.gridy = 0;
		contentPane.add(frameTitleLabel, gbc_frameTitleLabel);

		JLabel firstNameLabel = new JLabel("FIRST NAME");
		GridBagConstraints gbc_firstNameLabel = new GridBagConstraints();
		gbc_firstNameLabel.insets = new Insets(0, 0, 5, 0);
		gbc_firstNameLabel.gridx = 0;
		gbc_firstNameLabel.gridy = 2;
		contentPane.add(firstNameLabel, gbc_firstNameLabel);

		firstNameTaker = new JTextField();
		GridBagConstraints gbc_firstNameTaker = new GridBagConstraints();
		gbc_firstNameTaker.insets = new Insets(0, 0, 5, 0);
		gbc_firstNameTaker.fill = GridBagConstraints.HORIZONTAL;
		gbc_firstNameTaker.gridx = 0;
		gbc_firstNameTaker.gridy = 3;
		contentPane.add(firstNameTaker, gbc_firstNameTaker);
		firstNameTaker.setColumns(10);

		JLabel lastNameLabel = new JLabel("LAST NAME ");
		GridBagConstraints gbc_lastNameLabel = new GridBagConstraints();
		gbc_lastNameLabel.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_lastNameLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lastNameLabel.gridx = 0;
		gbc_lastNameLabel.gridy = 4;
		contentPane.add(lastNameLabel, gbc_lastNameLabel);

		lastNameTaker = new JTextField();
		lastNameTaker.setColumns(10);
		GridBagConstraints gbc_lastNameTaker = new GridBagConstraints();
		gbc_lastNameTaker.insets = new Insets(0, 0, 5, 0);
		gbc_lastNameTaker.fill = GridBagConstraints.HORIZONTAL;
		gbc_lastNameTaker.gridx = 0;
		gbc_lastNameTaker.gridy = 5;
		contentPane.add(lastNameTaker, gbc_lastNameTaker);

		JLabel contactNumberLabel = new JLabel("Contact Number");
		GridBagConstraints gbc_contactNumberLabel = new GridBagConstraints();
		gbc_contactNumberLabel.insets = new Insets(0, 0, 5, 0);
		gbc_contactNumberLabel.gridx = 0;
		gbc_contactNumberLabel.gridy = 6;
		contentPane.add(contactNumberLabel, gbc_contactNumberLabel);

		contactNumberTaker = new JTextField();
		contactNumberTaker.setColumns(10);
		GridBagConstraints gbc_contactNumberTaker = new GridBagConstraints();
		gbc_contactNumberTaker.insets = new Insets(0, 0, 5, 0);
		gbc_contactNumberTaker.fill = GridBagConstraints.HORIZONTAL;
		gbc_contactNumberTaker.gridx = 0;
		gbc_contactNumberTaker.gridy = 7;
		contentPane.add(contactNumberTaker, gbc_contactNumberTaker);

		JLabel passwordLabel = new JLabel("Password");
		GridBagConstraints gbc_passwordLabel = new GridBagConstraints();
		gbc_passwordLabel.insets = new Insets(0, 0, 5, 0);
		gbc_passwordLabel.gridx = 0;
		gbc_passwordLabel.gridy = 8;
		contentPane.add(passwordLabel, gbc_passwordLabel);

		passwordTaker = new JTextField();
		passwordTaker.setColumns(10);
		GridBagConstraints gbc_passwordTaker = new GridBagConstraints();
		gbc_passwordTaker.insets = new Insets(0, 0, 5, 0);
		gbc_passwordTaker.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordTaker.gridx = 0;
		gbc_passwordTaker.gridy = 9;
		contentPane.add(passwordTaker, gbc_passwordTaker);

		JLabel positionLabel = new JLabel("POSITION SELECTION");
		GridBagConstraints gbc_positionLabel = new GridBagConstraints();
		gbc_positionLabel.insets = new Insets(0, 0, 5, 0);
		gbc_positionLabel.gridx = 0;
		gbc_positionLabel.gridy = 10;
		contentPane.add(positionLabel, gbc_positionLabel);

		positionTaker = new JTextField();
		positionTaker.setColumns(10);
		GridBagConstraints gbc_positionTaker = new GridBagConstraints();
		gbc_positionTaker.insets = new Insets(0, 0, 5, 0);
		gbc_positionTaker.fill = GridBagConstraints.HORIZONTAL;
		gbc_positionTaker.gridx = 0;
		gbc_positionTaker.gridy = 11;
		contentPane.add(positionTaker, gbc_positionTaker);

		JButton registerEmployeeButton = new JButton("REGISTER");
		registerEmployeeButton.addActionListener(registerAction);
		GridBagConstraints gbc_registerEmployeeButton = new GridBagConstraints();

		gbc_registerEmployeeButton.gridx = 0;
		gbc_registerEmployeeButton.gridy = 12;
		contentPane.add(registerEmployeeButton, gbc_registerEmployeeButton);
	
	}


	
	ActionListener registerAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String[] rawInputFromUser = extractAllContents();
			int convertedPosition = -1 ;
			try {
				convertedPosition	= Integer.parseInt(rawInputFromUser[4]);
			} catch (NumberFormatException ex) {

				JOptionPane.showMessageDialog(
						null,
						"Enter a valid integer number for the position.",
						"Employee Position Entry Warning",
						JOptionPane.WARNING_MESSAGE);

				return;
			}
			
			
			if (programUserReference == null || employeeTableReference == null) {
				
				// code here to warn that there are missing fields
				CloseRegistrationWindow();
				return;
				
			}

			boolean isRegistrationSuccessful = programUserReference.registerAnEmployeeGUIVerion(
				employeeTableReference,
				rawInputFromUser[0], 
				rawInputFromUser[1],
				rawInputFromUser[2],
				rawInputFromUser[3],
				convertedPosition
			);

			if (isRegistrationSuccessful) {
				
				LoginForm logInUser = new LoginForm(programUserReference, employeeTableReference);
				HideThisFrame();
				// CloseRegistrationWindow();	
			}	
		}
	};

	private void CloseRegistrationWindow() {

		accessToTheFrame.dispatchEvent(
				new WindowEvent(
						accessToTheFrame, WindowEvent.WINDOW_CLOSING));
	}

	private void HideThisFrame() {
		this.setVisible(false);
	}

	public String[] extractAllContents() {
		
		return new String[]{
			firstNameTaker.getText(),
			lastNameTaker.getText(),
			passwordTaker.getText(),
			contactNumberTaker.getText(),			
			positionTaker.getText()
		};
	}

}
