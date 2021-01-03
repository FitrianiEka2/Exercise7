package Registration_System1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_System1 extends JFrame {

	private JPanel contentPane;
	private JFrame Frame;
	private JTable table;
	private JTextField RefNo;
	private JTextField Firstname;
	private JTextField Surname;
	private JTextField Address;
	private JTextField PostCode;
	private JTextField Telephone;
	private JTextField DateReg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_System1 frame = new Registration_System1();
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
	public Registration_System1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBounds(0, 0, 1283, 700);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(23, 25, 1231, 78);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Proton Car Customer Registration System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(171, 11, 896, 56);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1.setBounds(23, 114, 488, 445);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Reference No");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(28, 21, 174, 37);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Firstname");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1_1.setBounds(28, 58, 174, 37);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Surname");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1_2.setBounds(28, 95, 174, 37);
		panel_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1_3.setBounds(28, 135, 174, 37);
		panel_1_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Post Code");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1_4.setBounds(28, 176, 174, 37);
		panel_1_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Telephone");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1_5.setBounds(28, 217, 174, 37);
		panel_1_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Date Registed");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1_6.setBounds(28, 258, 174, 37);
		panel_1_1.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Type of Car");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1_7.setBounds(28, 299, 174, 37);
		panel_1_1.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Payment Type");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1_8.setBounds(28, 340, 174, 37);
		panel_1_1.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Amount Paid");
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1_9.setBounds(28, 384, 174, 37);
		panel_1_1.add(lblNewLabel_1_9);
		
		RefNo = new JTextField();
		RefNo.setFont(new Font("Tahoma", Font.BOLD, 19));
		RefNo.setBounds(212, 28, 217, 30);
		panel_1_1.add(RefNo);
		RefNo.setColumns(10);
		
		Firstname = new JTextField();
		Firstname.setFont(new Font("Tahoma", Font.BOLD, 19));
		Firstname.setColumns(10);
		Firstname.setBounds(212, 65, 217, 30);
		panel_1_1.add(Firstname);
		
		Surname = new JTextField();
		Surname.setFont(new Font("Tahoma", Font.BOLD, 19));
		Surname.setColumns(10);
		Surname.setBounds(212, 102, 217, 30);
		panel_1_1.add(Surname);
		
		Address = new JTextField();
		Address.setFont(new Font("Tahoma", Font.BOLD, 19));
		Address.setColumns(10);
		Address.setBounds(212, 142, 217, 30);
		panel_1_1.add(Address);
		
		PostCode = new JTextField();
		PostCode.setFont(new Font("Tahoma", Font.BOLD, 19));
		PostCode.setColumns(10);
		PostCode.setBounds(212, 183, 217, 30);
		panel_1_1.add(PostCode);
		
		Telephone = new JTextField();
		Telephone.setFont(new Font("Tahoma", Font.BOLD, 19));
		Telephone.setColumns(10);
		Telephone.setBounds(212, 224, 217, 30);
		panel_1_1.add(Telephone);
		
		DateReg = new JTextField();
		DateReg.setFont(new Font("Tahoma", Font.BOLD, 19));
		DateReg.setColumns(10);
		DateReg.setBounds(212, 265, 217, 30);
		panel_1_1.add(DateReg);
		
		JComboBox ProveID = new JComboBox();
		ProveID.setFont(new Font("Tahoma", Font.BOLD, 16));
		ProveID.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Proton Saga (39,800.000 MYR)", "Proton Persona (54,600.000 MYR)", "Proton X50 (80,000.000 MYR)", "Proton X70 (99,802.000 MYR)"}));
		ProveID.setBounds(212, 306, 217, 30);
		panel_1_1.add(ProveID);
		
		JComboBox Member = new JComboBox();
		Member.setFont(new Font("Tahoma", Font.BOLD, 16));
		Member.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "10 years installment (Down Payment 2,860.00 MYR)", "5 years installment (Down Payment 1,400.00 MYR)", "2 years installment (Down Payment 500.00 MYR)"}));
		Member.setBounds(212, 347, 217, 30);
		panel_1_1.add(Member);
		
		JComboBox Paid = new JComboBox();
		Paid.setFont(new Font("Tahoma", Font.BOLD, 16));
		Paid.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "307.000 MYR (Proton Saga)", "640.000 MYR (Proton Saga)", "1,640.000 MYR (Proton Saga)", "", "431.000 MYR (Proton Persona)", "886.000 MYR (Proton Persona)", "2,254.000 MYR (Proton Persona)", "", "643.000 MYR (Porotn X50)", "1,310.000 MYR (Proton X50)", "3,312.000 MYR (Proton X50)", "", "807.000 MYR (Proton X70)", "1,640.000 MYR (Proton X70)", "4,136.000 MYR (Proton X70)"}));
		Paid.setBounds(212, 388, 217, 30);
		panel_1_1.add(Paid);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_2.setBackground(new Color(176, 224, 230));
		panel_1_2.setBounds(23, 570, 1231, 104);
		panel.add(panel_1_2);
		
		JButton btnNewButton = new JButton("Add Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
					RefNo.getText(),
					Firstname.getText(),
					Surname.getText(),
					Address.getText(),
					PostCode.getText(),
					Telephone.getText(),
					DateReg.getText(),
					ProveID.getSelectedItem(),
					Member.getSelectedItem(),
					Paid.getSelectedItem(),
				});
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null,"Membership Update confirmed","Membership Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton.setBounds(29, 31, 188, 42);
		panel_1_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RefNo.setText("");
				Firstname.setText("");
				Surname.setText("");
				Address.setText("");
				PostCode.setText("");
				Telephone.setText("");
				DateReg.setText("");
				ProveID.setSelectedItem("Make a Selection");
				Member.setSelectedItem("Make a Selection");
				Paid.setSelectedItem("Make a Selection");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1.setBounds(268, 31, 188, 42);
		panel_1_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					table.print();
				}
				catch(java.awt.print.PrinterException e) {
					System.err.format("No Printer found", e.getMessage());

				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_2.setBounds(506, 31, 188, 42);
		panel_1_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow()==-1) {
					if (table.getRowCount()==0) {
						
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Membership Management System1",JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Membership Management System",JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_3.setBounds(748, 31, 188, 42);
		panel_1_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frame = new JFrame();
				if (JOptionPane.showConfirmDialog(Frame,"Confirm if you want to exit","Membership Registration System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_4.setBounds(999, 31, 188, 42);
		panel_1_2.add(btnNewButton_4);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_3.setBackground(new Color(176, 224, 230));
		panel_1_3.setBounds(521, 114, 733, 445);
		panel.add(panel_1_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(20, 23, 691, 398);
		panel_1_3.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 10));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Reference No", "Firstname", "Surname", "Address", "Post Code", "Telephone", "Date Reg.", "Type of Car", "Payment Type", "Amount Paid"
			}
		));
		table.getColumnModel().getColumn(8).setPreferredWidth(99);
		scrollPane.setViewportView(table);
	}
}
