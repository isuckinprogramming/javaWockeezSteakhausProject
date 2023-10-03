package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;

public class AdminDashboardComplete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboardComplete frame = new AdminDashboardComplete(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
    public AdminDashboardComplete() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 491, 560);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(null);

      JSplitPane splitPane = new JSplitPane();
      splitPane.setBounds(0, 11, 475, 510);
      splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
      contentPane.add(splitPane);
    }

    public AdminDashboardComplete(boolean something) {
      setUpGUIComponents();
    }

    public void setUpGUIComponents() {
   		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 491, 560);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JSplitPane splitPane = new JSplitPane();
      splitPane.setBounds(0, 11, 475, 510);
      splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
      contentPane.add(splitPane);
      splitPane.add(AdminDashboard.getDashBoardPanel(), 1);
    }


}
